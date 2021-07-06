*version 9.1 2804800581
u 47
R? 7
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
pageloc 1 0 2673 
@status
n 0 121:06:06:20:54:00;1625583240 e 
s 0 121:06:06:20:54:04;1625583244 e 
*page 1 0 970 720 iA
@ports
port 46 GND_ANALOG 220 200 h
@parts
part 7 r 530 200 v
a 0 sp 0 0 0 10 hlb 100 PART=r
a 0 s 0:13 0 0 0 hln 100 PKGTYPE=RC05
a 0 s 0:13 0 0 0 hln 100 GATE=
a 0 a 0:13 0 0 0 hln 100 PKGREF=R6
a 0 ap 9 0 15 0 hln 100 REFDES=R6
part 2 r 250 140 h
a 0 u 13 0 15 25 hln 100 VALUE=10k
a 0 sp 0 0 0 10 hlb 100 PART=r
a 0 s 0:13 0 0 0 hln 100 PKGTYPE=RC05
a 0 s 0:13 0 0 0 hln 100 GATE=
a 0 a 0:13 0 0 0 hln 100 PKGREF=R1
a 0 ap 9 0 15 0 hln 100 REFDES=R1
part 5 r 330 200 v
a 0 x 0:13 0 0 0 hln 100 PKGREF=R2
a 0 xp 9 0 15 0 hln 100 REFDES=R2
a 0 sp 0 0 0 10 hlb 100 PART=r
a 0 s 0:13 0 0 0 hln 100 PKGTYPE=RC05
a 0 s 0:13 0 0 0 hln 100 GATE=
part 3 r 370 140 h
a 0 x 0:13 0 0 0 hln 100 PKGREF=R3
a 0 xp 9 0 15 0 hln 100 REFDES=R3
a 0 sp 0 0 0 10 hlb 100 PART=r
a 0 s 0:13 0 0 0 hln 100 PKGTYPE=RC05
a 0 s 0:13 0 0 0 hln 100 GATE=
a 0 u 13 0 15 25 hln 100 VALUE=10k
part 6 r 440 200 v
a 0 x 0:13 0 0 0 hln 100 PKGREF=R4
a 0 xp 9 0 15 0 hln 100 REFDES=R4
a 0 sp 0 0 0 10 hlb 100 PART=r
a 0 s 0:13 0 0 0 hln 100 PKGTYPE=RC05
a 0 s 0:13 0 0 0 hln 100 GATE=
part 4 r 470 140 h
a 0 x 0:13 0 0 0 hln 100 PKGREF=R5
a 0 xp 9 0 15 0 hln 100 REFDES=R5
a 0 sp 0 0 0 10 hlb 100 PART=r
a 0 s 0:13 0 0 0 hln 100 PKGTYPE=RC05
a 0 s 0:13 0 0 0 hln 100 GATE=
a 0 u 13 0 15 25 hln 100 VALUE=10k
part 8 VDC 220 160 h
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
w 10
s 220 160 220 140 9
s 220 140 250 140 11
w 30
s 510 140 530 140 29
s 530 140 530 160 31
w 14
s 290 140 330 140 13
s 330 140 370 140 39
s 330 160 330 140 37
w 28
s 410 140 440 140 27
s 440 140 470 140 42
s 440 160 440 140 40
w 34
s 530 200 440 200 33
s 330 200 220 200 35
s 440 200 330 200 36
@junction
j 250 140
+ p 2 1
+ w 10
j 290 140
+ p 2 2
+ w 14
j 370 140
+ p 3 1
+ w 14
j 470 140
+ p 4 1
+ w 28
j 410 140
+ p 3 2
+ w 28
j 510 140
+ p 4 2
+ w 30
j 530 160
+ p 7 2
+ w 30
j 330 160
+ p 5 2
+ w 14
j 330 140
+ w 14
+ w 14
j 440 160
+ p 6 2
+ w 28
j 440 140
+ w 28
+ w 28
j 220 160
+ p 8 +
+ w 10
j 220 200
+ p 8 -
+ w 34
j 330 200
+ p 5 1
+ w 34
j 440 200
+ p 6 1
+ w 34
j 530 200
+ p 7 1
+ w 34
j 220 200
+ s 46
+ p 8 -
j 220 200
+ s 46
+ w 34
@attributes
a 0 s 0:13 0 0 0 hln 100 PAGETITLE=
a 0 s 0:13 0 0 0 hln 100 PAGENO=1
a 0 s 0:13 0 0 0 hln 100 PAGESIZE=A
a 0 s 0:13 0 0 0 hln 100 PAGECOUNT=1
@graphics
t 43 t 6 330 60 440 100 0 45
Name: Sanjib Kumar Sen
ID: 19301101
Sec: 05
t 44 t 5 340 46 420 60 0 17
Lab 02: Circuit 2
