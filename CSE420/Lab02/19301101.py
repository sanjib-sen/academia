

allowed = ['-','_','.']
special_double = ["@@","!!","##","$$","%\%","^^","&&","**","||","??",">>","<<","::",";;",",,","--","==","++","__","``"]
def isNumber(character):
    return True if ord(character) > 47 and ord(character)<58 else False

def isLetter(character):
    return True if ord(character) > 96 and ord(character)<123 else False

def allowedDomainChars(string):
    for s in string:
        if not isNumber(s) and (not isLetter(s)) and (s!='-') and (s!='.'): return False
    return True

def isValidUserName(string):
    return False if len(string)>64 or string=="" or " " in string or isNumber(string[0]) or string[0] == '.' or string[-1] == '.' or '..' in string else True

def isValidEmailDomain(string):
    if len(string)>255 or string=="" or " " in string or '..' in string or '.' not in string or string[string.index('.')+1]=='-': return False
    dotsplit = string.split(".")
    for dot in dotsplit:
        if dot[0]=='-' or dot[-1]=='-':return False 
    return True if allowedDomainChars(string) else False

def isValidEmail(string):
    if not '@' in string or '@@' in string: return False
    stringList = string.split("@")
    if len(stringList)>2: 
        return False
    if not isValidUserName(stringList[0]): 
        return False
    if not isValidEmailDomain(stringList[1]): 
        return False
    return True

def isValidWeb(string):
    if " " in string or ".." in string: return False
    string = string.split(".")
    if len(string)<3: return False
    if string[0] != "https://www" and string[0]!= "http://www" and string[0]!= "www": return False
    for s in string:
        if s[0]=='-' or s[-1]=='-': return False
        for spc in special_double:
            if spc in s:
                return False
    return True


def main(inp, num):
    if isValidWeb(inp):
        print("Web,",num)
    elif isValidEmail(inp):
        print("Email,",num)


cases = int(input())
lst =[]
for i in range(1,cases+1):
    inp = input()
    lst.append([inp,i])

for l in lst:
    main(l[0],l[1])



