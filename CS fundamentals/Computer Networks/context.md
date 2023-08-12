Network: a group of computers communication with each other

internet is the way of communication. (Network of interconnected computers)

why we need network:
1. Sharing resources
2. Communication
3. 

History:
The first time internet came in to existence is when US military defence department creted ARPANET.

Protocol: There are set of rules governing the transmission of data between two devices

Ineternet Engineering Task Force monitors the communication protocols. For standardisation.
For any new protocols to be present in market, the company should raise a Request for Comments (RFC) to IETF.

For every system availbale on the Internet, it has can be found at an address called IP addreess. 
IPV4
IPV6

Doamin name are connected to IP addresses by DNS servers.
Ex: Google DNS server[8.8.8.8]

Network components:
1. WIFI adapters - a chip help to connect to internet also called NIC
2. LAN NIC

Every chip has a MAC address. IP addresses to every device is assigned by ISP (Internet service providers). So Even if  one device is connected with multiple netwirks, that same device could be found with different IP address.

MAC address is permanent persistent address. A manufacturer assigns MAC address for every NIC. A devie can have multiple MAC addresses if it has multiple NIC. But every NIC has a unique MAC address.

Port number helps OS to transfer the incoming data to the respective application that made the request


1. Application layer
    gets user input
2. presentation layer
    prepares the data and encrypts it
3. Session layer
    Manages authentication tokens
4. Transport layer
    the protocol that guarentees delivery
5. Network layer
    Decides the route
6. Data link layer
7.  physiccal layer 

# Application Layer      
Application Architecture:
1. Client Server type
    Anything that requests data is called client
    Anyting that generates data agaisnt a request is called a server

    client ---------------- Server
    (resquest)          (response) 

    It is also called as request-response model
2. Peer to peer architecture:
    different machines running same application.
    Single has no particular responsibility ( all are on same level)

    Every machine acts as consumer and owner of the data


## Sockets
In order to interact with a network, you need a socket.

Socket vs Port
Just a software concern         Port is identifier
Used to send/receive data in software                      appplications connect to other machines using port number
Client and server both interact with network over sockets


## Application Layer Protocols
1. HTTP (Hyper Text Transfer Protocol)

HTTP protocol:
1. Request
2. Path
3. Version
4. Host
5. connection: keep-alive/closed
6. user-agent

    