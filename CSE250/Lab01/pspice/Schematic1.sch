*version 9.1 2567894689
u 57
R? 5
V? 2
@libraries
@analysis
@targets
@attributes
@translators
a 0 u 13 0 0 0 hln 100 PCBOARDS=PCB
a 0 u 13 0 0 0 hln 100 PSPICE=PSPICE
a 0 u 13 0 0 0 hln 100 XILINX=XILINX
@setup
unconnectedPins 0
connectViaLabel 0
connectViaLocalLabels 0
NoStim4ExtIFPortsWarnings 1
AutoGenStim4ExtIFPorts 1
@index
pageloc 1 0 2249 
@status
n 0 121:06:06:18:49:55;1625575795 e 
s 0 121:06:06:18:49:55;1625575795 e 
c 121:06:06:19:08:38;1625576918
*page 1 0 970 720 iA
@ports
port 7 GND_ANALOG 230 220 h
@parts
part 2 r 320 50 h
a 0 u 13 0 15 25 hln 100 VALUE=10k
a 0 sp 0 0 0 10 hlb 100 PART=r
a 0 s 0:13 0 0 0 hln 100 PKGTYPE=RC05
a 0 s 0:13 0 0 0 hln 100 GATE=
a 0 a 0:13 0 0 0 hln 100 PKGREF=R1
a 0 ap 9 0 15 0 hln 100 REFDES=R1
part 3 r 320 130 h
a 0 u 13 0 15 25 hln 100 VALUE=10k
a 0 sp 0 0 0 10 hlb 100 PART=r
a 0 s 0:13 0 0 0 hln 100 PKGTYPE=RC05
a 0 s 0:13 0 0 0 hln 100 GATE=
a 0 a 0:13 0 0 0 hln 100 PKGREF=R2
a 0 ap 9 0 15 0 hln 100 REFDES=R2
part 4 r 440 140 v
a 0 sp 0 0 0 10 hlb 100 PART=r
a 0 s 0:13 0 0 0 hln 100 PKGTYPE=RC05
a 0 s 0:13 0 0 0 hln 100 GATE=
a 0 a 0:13 0 0 0 hln 100 PKGREF=R3
a 0 ap 9 0 15 0 hln 100 REFDES=R3
part 5 r 440 220 v
a 0 sp 0 0 0 10 hlb 100 PART=r
a 0 s 0:13 0 0 0 hln 100 PKGTYPE=RC05
a 0 s 0:13 0 0 0 hln 100 GATE=
a 0 a 0:13 0 0 0 hln 100 PKGREF=R4
a 0 ap 9 0 15 0 hln 100 REFDES=R4
part 6 VDC 230 120 h
a 1 u 13 0 -11 18 hcn 100 DC=12V
a 0 sp 0 0 22 37 hln 100 PART=VDC
a 0 a 0:13 0 0 0 hln 100 PKGREF=V1
a 1 ap 9 0 24 7 hcn 100 REFDES=V1
part 1 titleblk 970 720 h
a 1 s 13 0 350 10 hcn 100 PAGESIZE=A
a 1 s 13 0 180 60 hcn 100 PAGETITLE=
a 1 s 13 0 300 95 hrn 100 PAGENO=1
a 1 s 13 0 340 95 hrn 100 PAGECOUNT=1
@conn
w 24
a 0 up 0:33 0 0 0 hln 100 V=
s 360 50 360 90 23
s 360 90 360 130 29
s 360 90 440 90 27
a 0 up 33 0 400 89 hct 100 V=
s 440 90 440 100 30
w 26
a 0 up 0:33 0 0 0 hln 100 V=
s 320 50 320 90 25
s 320 90 320 130 34
s 320 90 230 90 32
a 0 up 33 0 275 89 hct 100 V=
s 230 90 230 120 35
w 38
s 230 220 230 160 43
s 230 220 440 220 45
w 48
a 0 up 0:33 0 0 0 hln 100 V=
s 440 180 440 140 47
a 0 up 33 0 442 160 hlt 100 V=
@junction
j 360 50
+ p 2 2
+ w 24
j 360 130
+ p 3 2
+ w 24
j 320 50
+ p 2 1
+ w 26
j 320 130
+ p 3 1
+ w 26
j 360 90
+ w 24
+ w 24
j 440 100
+ p 4 2
+ w 24
j 320 90
+ w 26
+ w 26
j 230 120
+ p 6 +
+ w 26
j 230 220
+ s 7
+ w 38
j 230 160
+ p 6 -
+ w 38
j 440 140
+ p 4 1
+ w 48
j 440 220
+ p 5 1
+ w 38
j 440 180
+ p 5 2
+ w 48
@attributes
a 0 s 0:13 0 0 0 hln 100 PAGETITLE=
a 0 s 0:13 0 0 0 hln 100 PAGENO=1
a 0 s 0:13 0 0 0 hln 100 PAGESIZE=A
a 0 s 0:13 0 0 0 hln 100 PAGECOUNT=1
@graphics
t 56 t 6 420 40 510 80 0 45
Name: Sanjib Kumar Sen
ID: 19301101
Sec: 05
t 55 t 5 430 26 510 40 0 17
Lab 02: Circuit 1
