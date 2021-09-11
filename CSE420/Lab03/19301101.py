import re

recount = int(input())
regexes = []
strings = []
for rec in range(0,recount):
    regexes.append(input())

strcount = int(input())
for strc in range(0,strcount):
    strings.append(input())


for string in strings:
    matched = False
    for regex in regexes:
        check = re.search(regex, string)
        if check:
            print("YES,",regexes.index(regex)+1)
            matched = True
            break
        else:
            continue
    if not matched:
        print("NO", 0)
