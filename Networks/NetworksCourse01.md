# **Networks Course 01 Notes**
## *An Introduction to Networking*

> The resources a network makes available to its users include applications and the data provided by these applications. Collectively, these resources are usually referred to as network services. A network is a group of computers and other devices connected by some type of transmission media.

## How Networks are used
* Client-server Applications || Client computer requests data or a service from a second computer (the server).
    * Web services || A web browser (client computer) requests data or services; the Web serber (server app) returns a the requested data.
    * Email Services || SMTP (Simple Mail Transfer Protocol) sends an email to the sender's mail server, which sends it to  the receiver's mail server which intern uses POP3(Post Office Protocol) or IMAP4 (Internet Message Access Protocol) to allow the receiver to receive the email.
    * FTP (File Transfer Protocol) || Transfer files between two computers using FTP or SFTP (Secure File Transfer Protocol)
    * Telnet service || Command-line used to control a computer remotely (not sexure)
    * Remote desktop || Secure transmission who both use RDP to establish a client-server communication
    * Remote applications || Aplication installed on a server - easy for maintenance and backup of applications
        

* File and Print Services
    * File services || server's ability to share and store files
    * File server || computer that stores files
    * Print Services || share printers across a network
        * one printer = less time on maintenance and management


* Communications Services
    * Convergance || using the same network to deliver multiple types of communication services - i.e.: videos, voice messages, fax, etc
    * Unified communication (UC) || centralized management of multiple network-based communications

    * Types of communication services:
        * Conversational voice VoIP (Voice over IP) || Can use point-to-point model (Example: Skype) or point-to-multipoint model (Example: Conferance call)
        * Streaming live audio and video (Example: Skype)
        * Sstreaming stored audio and video (Example: Youtube)

   * Voice and video transmissions are delay-sensitive, they are considered loss-tolerent. 
   * Bandwith = amount of traffic, data, or transmission activity on the network

## Controlling Network Access
* Topology || how parts of a whole work together
* Physical topology || hardware -- how computers, cables and other devices form the physical network
* Logical topology || software -- [missing description]
* Network operating system || controlls access to the entire network

## Peer-to-Peer (or point-to-point) Model
The OS of each computer on the network is responsible for controlling access to its resources - no centralized connection. Each computer has its own local account that is not accessible by others.

Computers (hosts) can share resources or prevent accessto resources.

* Advantages:
    * Simple configuration
    * Less expensive
* Disadvantages
    * Not scalable
    * Not necessarily secure
    * Not practical for large installations

## Client-Server Network Model
Resources are managed by the Network Operating System (NOS) through a centralized database.

Terminology and definitions:

    > Windows Domain: Logical group of computers that a Windows Server can control.
    > Active Directory (AD): Centralized directory database that contains user account info and security for the entire group of computers.
    > Global Account (username or ID): domain-level account assigned by the network administrator and kept in AD. 

A user can sign onto the network from any computer on the network and gain access to the resources that AD allows.

Clients don't share their resources directly to each other - its controlled by entries in the domain database.

The NOS is responsible for:
* Managing client data and resources
* Ensuring authorized user access
* Controlling user file access
* Restricting user network access
* Dictating computer communication rules
* Supplying application to clients

Servers that have NOS installed require more memory, storage capacity and processing power and they should be equipped with special hardware that provides network management functions.

    Advantages in relation to P2P
        > User credentials assigned from one place
        > Multiple shared resource access centrally controlled
        > Centrol problem monitoring, diagnostics and correction capabilities
        > More scalable

## LAN and Their Hardware
LAN (Locan Area Network) is usually contained in a small space. 

It needs a switch which receives incoming data from ports and redirects it to another or multiple other ports. It can have many switches by using a backbone which is a conduit that connects the segments of a network.

It uses Star Topology (all devides are connected to one device - the switch) and uses a NIC (Network Interface Card) which is a network port used to attach a device to a network.

The router is a device that manages the traffic between multiple networks. It can be used in small home networks to connect the LAN to the internet. Intustrial grade routers can have several network ports - one for each netwerk it connects to. It is the gateway between networks.

## MANs and WANs
Metropolitan Area Network (MAN) is a group of connected LANs in the same geographical area - also known as Campus area network (aka CAN).

Wide Area Network (WAN) is a group of LANs spread over a wide geographical area.

Personal Area Network (PAN) is the smallest network and is used for personal devices.