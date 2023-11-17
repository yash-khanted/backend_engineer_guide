# Load balancer
A computer program handling user traffic on a web server. A load balancer main task is to evenly distribute traffic across all the servers.

1. How does a load balancer know which server is running and which is not?
   - There are two types of checks a load balancer or a third party tool makes to know the availability of server
  1. HeartBeat check: Every server sends a message of its liveliness to the LB/Zookeeper. If a LB dosenot receives a message then it perform the next check
  2. Health check: Here LB/Zookeeper sends a message to the server. If the server does not respond back then it will be declared dead by the LB/Zookeeper

2. What is load balancer goes down
   1. Active/Passive solution
   2. Multiple load balancers

## Data sharding
The process of splitting data into consecutive parts for storage in multiple points instead of one.

Splitting/partitioning: Can be done in two ways
1. Vertical partitioning
2. Horizontal partitioning

In distributed networks, data intensive applications will have multiple servers and each server will have sharded data. Thus for a user to reach the exact server that can cater it a response a routing algorithm must be implemented by the load balancer.
List of routing algos:
1. Simple Mod
2. Range based technique
3. Mapping table
4. Consistent Hashing
   1. Equal load distribution
   2. Handle server crashes
   3. Load balancers don't have to keep memory in ram
   4. Do not need sync up
   5. Fast to compute

## Consistent Hashing
**Hash FUnction** A function that return a unique value for an input x (be any type) within a specified range of numbers
Every hash function returns different value for an same input. This help in preventing security issues and efficient storage

As the number of hash functions used increases, load distribution becomes more efficient

### Consistent Hash Ring
A pictorial circle on which there are 0 to 359 points with each rerresenting a value of the hashed server. It help in routing the incoming request to a server.
Let suppose there are 3 server and 3 hash functions. So totally there will be nine random points on the CHR
When there is request from a user, the load balancer will convert user id to a hashcode value on the CHR
Moving in the clockwise the immediate largest hashcode value of server will be choosen to the handle the request by LB

# Caching
App architecture
1. A stateful app server architecture
   1. Where each app server is embedded with its own database server.
   2. Here app logic and database logic are couple and thus scaling independently is not possible
   3. But it provides respoonsed faster
2. A stateless app server architecture
   1. Every app server connects to a pool of seperate located database servers

In stateless app architecture we use caching to handle responsed that are created frequently
**Memory is always hierarchical**

Caching is done at
1. Browser level, the types of files cached are
   1. HTML, CSS JS (basically these files are hidden from developers)
   2. Cookies (session store)
   3. Can accesss local storaged for few 100MD of data
   4. Indexed DB (A javascript based browser database)
2. CDN Level
   1. CDN is made of multiple edge server (akamai, AWS)

Main problems/ function to be handled in a cache are and they both go hand in hand
1. Cache eviction - When you have to decide which policy is to be used for data removal from cache when it is full memeory wise
   1. First in first out (queue)
   2. last recently used (95% used) (priority queue)
   3. last in last out **(Find a usecase for this type of cache)**
   4. Least frequently used(95% used)
2. Cache invalidation - This the process of read and write conditions

## cache Invalidation
There are four types
1. Time to live (TTL)
   1. Reads are fast
      1. read from cache firt only then from the database
      2. after reading from database, it is written to cache asynchronously
   2. writes are fast
      1. writes only to database
   3. It gives stale data (eventually consistent)
      1. The cache has expiry time for every data in cache. Which helps in validation of cached data
2. Write around
   1. Reads are fast
      1. read are similar to time to live (TTL)
   2. writes are fast
      1. simply write to db
   3. It gives stale data (eventually consistent)
      1. a updater server periodically keeps refreshing the data in cache from database
3. Write through
   1. read are fast
      1. similar to time to live (TTL)
   2. write are slow (uses distributed transaction)
      1. when a user request to write a data, then it is written to both database and cache parallely only then a request is completed
   3. it doesn't ever give stale data (immediately consistent)
      1. This make sure data in cache and db are consistent/ in sync
4. Write back
   1. read are ultra fast
      1. read only from cache
   2. write are ultra fast
      1. write only to cache
   3. There is high risk of data loss
      1. the data in cache is eventually dumped to database. But if in the meantime cache server dies then data is lost forever.
   4. Ex: Analytics application where data is not important but chart is

Important inteview question
1. Implement LRU cache