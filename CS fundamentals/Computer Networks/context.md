# Internet

As a web developer , it is really important to understand what internet is and how it works.

<em> **Internet is called as the network of networks**, A *Network* is an inter-connected group of computer devices that can communicate with each other</em> 

## History

The first time internet came in to existence is when United States Department of Defense creted ARPANET. This was developed, as part of their program to create decentralized network for communication in the event of an nuclear attack.

## How it works
<em>At the high level, Internet is web of routers interconnected together for exchanging information using standard protocols for secure and reliable transfer.</em>

## Network
### Open Systems Interconnection Model
The OSI model, created in 1984 by International Standards Organisation, is a reference framework that explains the process of transmitting data between computers.

It has seven abstract layers that describe the advanced network connections among devices:
1. Physical layer
2. Data link layer
3. Network layer
4. Transport layer
5. Session layer
6. Presentation layer
7. Application layer 

### Physical Layer

The function of this layer are:
1. Bit synchronization:
2. Bit rate control
   
A newtork Interface controller handles the signal transmission part. A NIC controller also provides a IP address to the system for creating a connection to another system in the internet.


computers must be connected to switch using a copper wire or optic fibre
A system of netwroks connected to a switch form the LAN local area network
Data created here is ready to transmit and is called packet or frame

LAN ports are the connection ports on switch and devices for making connection using a cable.

`see how a switch works at hardware level`

Router help in connecting a device to the internet. Swithc is connected to the router. ISP provide us with cable that help router to be connected to the internet for cost

router deliver packet from device to the router

internet is the structure that connects all the LAN all over the world avaible for connection

A home router is mix of switch and router. THey also have a access point for wireless fidelity

`why many routes instead of one giant router`

Routing table is a special  table in every router help in deciding which router should get the packet to reach the destination faster. Router look the metadata of the packet and forward it based on routing table. 

THe algorithms decode the path of the packet. Router ignores the fact that where a packet come from, called route filtering

router take account of many factors while forwarding like packet density, path length, etc.



### Data Link Layer

Data link layer handles the node to node to communication. It ensures that data is transmitted end to end error free.

Ethernet Interface, WIFI are part of this layer.

Data sent from network is processed by this layer in frames and metadata like reciever's MAC address, Header are added to each frame. ARP (Address Resolution Protocol) requests the MAC address of the reciever.
 
### Network Layer

video sent over internet piece by piece is called streaming
WAN Wide area network - combination of LAN's
Ex. A pizza restaurant many outlets in the a state. LAN at eact outlet can connected together and called a WIDE AREA NETWORk

Banks have a WAN created over the country for their operations.

WAN vs Internet
internet is public network and WAN is private network.
packet can be seen by hackers and modified. 
Setting up WAN is very costly

VPN is simple technique for creating WAN. Virtual private network. The tunnelling feature of the VPN make data transmission very secure over the internet.

site to site VPN a tunnel between routers

Private WAN is a dedicated network line provided by the ISP for cost

Switches for LAN, Routers for WAN

Local ISP are called point of presence

`Learn about peering`
 
1. IP address
    For every system availbale on the Internet, it has can be found at an address called IP addreess. 
    IPV4
    IPV6

2. Doamin name are connected to IP addresses by DNS servers.
    Ex: Google DNS server[8.8.8.8]

Network components:
1. WIFI adapters - a chip help to connect to internet also called NIC
2. LAN NIC

Every chip has a MAC address. IP addresses to every device is assigned by ISP (Internet service providers). So Even if  one device is connected with multiple netwirks, that same device could be found with different IP address.

MAC address is permanent persistent address. A manufacturer assigns MAC address for every NIC. A devie can have multiple MAC addresses if it has multiple NIC. But every NIC has a unique MAC address.

Port number helps OS to transfer the incoming data to the respective application that made the request

### Application Layer      
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



### Sockets
In order to interact with a network, you need a socket.

Socket vs Port
Just a software concern         Port is identifier
Used to send/receive data in software                      appplications connect to other machines using port number
Client and server both interact with network over sockets

## Protocols - Application Layer
> These are set of rules defining the transmission of data between devices and systems

**Internet Engineering Task Force (IETF)** is an non-profit organisation that standardizes the communication protocols. For any new protocols to be present in market, the company should raise a Request for Comments (RFC) to IETF.

Standardization helps in interuse of various technologies made by different manufacturees. For example, a browser made by one company can communicate with server made by other company as long as they both adhere to HTTP protocol

### HTTP protocol


1. HTTP (Hyper Text Transfer Protocol)

HTTP protocol:
1. Request
2. Path
3. Version
4. Host
5. connection: keep-alive/closed
6. user-agent

    