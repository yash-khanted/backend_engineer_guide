What is OS
software that connects with a human and hardware device

OS for developers
- provides API for developerrs
- Resource manager, allocating CPU, memory for application
- Allows developers to interact with hardware

UNI programming OS Vs MUlti programming OS
run more than one program in OS then it is multi=programming

Uni programming OS Examples:
calculator
TV's

Mullti tasking
it is sme as multi=programming. BUt this word is specifically used for windows OS

Categories of Multi programming OS
1. Based on number of users usage at a timme
- single user multi programming OS
ex: windows, android
- Multi user multi programming OS
ex: AWS

2. Pre-emptive and non-preemptive OS
How an OS performs tasks
- ONE by ONE tasks are performed
- SWITCHING beteween tasks

in non prementive, you cannot switcch between tasks

in premptive switching is allowed
preemptive means pause the task before completion





Processes
a running program is called a process

program is compiled code ready to run on a machine.

A program in execution is called a process

program sits in secondary storage, hard disk

process is stored in primary storage, RAM

1. user starts a proces
2. All the variables are initialised in RAM
3. CPU uses data from RAM works

Every process is attached a PCB[process control block] It stores all the information about the proocess like
- PID
- code
- resources used
- CPU related information
- memory limit
- state of the process
- last executed step
- data pointers

Types of process 
1. Based on the work
   1. I/O bound process - This types of process involves a lot interaction from the hardware/ interface devices Ex. Printing, word application, etc
   2. CPU bound process - A process mostly performed by computations. Ex. machine learning model
   3. Mix bound process - process that involves a little of both I/O and computations. Ex. Gaming applcaiton etc.

How do I/O happens?
When a process need input it raises an interrupt (i.e signal to CPU), then CPU transfers the control to I/O unit to get the input.

### CPU scheduling
In order for CPU to run efficiently, the processes are scheduled carefully. The biggest drawback is multiple context switching kills CPU time. A process needs time to be started coldly.

There are algorithms for CPU scheduling:
1. First come first serve
   1. Based on PID, process with lowest PID is executed first
2. Shortest remaining time first
   1. Based on the time to completion of a process. The lowest remaining time is executed first
3. Round Robin method
   1. Every process run for a k time periodically in a circle until completion


Terminology
1. Throughput - No of processes completed in a given amount of time
2. Latency - Average time taken by processes to complete from the time CPU knows it

## Threads
A lightweight process Or Smallest unit of execution. CPU executes thread not process. A process can have many threads, such process is called multi threaded process.

Every thread has different task but same the same data. Code, data and resources are centralized

Concurrency, a feature of CPU in which multiple threads execute may not necessarily at the same time.

Parallelism, a feature of CPU in which multiple threads make progress at the same time.


//To do
Executor API
Synchronized keyword

Critical Section: A part of the that is prone to create issues. When multiple threads enter this section they can create choas called race condition. In a critical section mostly the data is being mutated. 


Properties of good multi-thread code:
1. Only one thread in critical section at a time. (Offer mutual exclusion)
2. Overall system should make progress
3. Bounded waiting: No threads should wait indefinitely
4. No busy waiting: Where thread continously checks if they can enter the critical section


Mutex (locks)
Semaphores (Producer consumer problem)


# Linux
GNU project founded by Richard Stallman. An american free software movement activist

Linux is kernel that communicates with the hardware. Linus trovalds started developing linux kernel

Ubuntu (debian based), openSUSE, kali, debian , redhat are the distribution of linux kernel.