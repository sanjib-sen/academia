inp = input("Enter The Address: ")

allowed = ['-','_','.']

def isNumber(character):
    return True if ord(character) > 47 and ord(character)<58 else False

def isLetter(character):
    return True if ord(character) > 96 and ord(character)<123 else False

def allowedDomainChars(string):
    for s in string:
        if not isNumber(s) or isLetter(s) or '-': return False
    return True

def isEmail(string):
    return True if '@' in string else False

def isValidUserName(string):
    return False if len(string)>64 or string=="" or " " in string or isNumber(string[0]) or string[0] == '.' or string[-1] == '.' or '..' in string else True

def isValidEmailDomain(string):
    string = str(string)
    if len(string)>255 or string=="" or " " in string or string[0] == '-' or string[-1] == '-' or '@' in string or '..' in string or '.' not in string or string[string.index('.')+1]=='-': return False
    return True if allowedDomainChars(string) else False

def isvalidEmail(string):
    stringList = string.split("@")
    if not len(stringList)<=2: return False
    elif not isValidUserName(stringList[0]): return False
    elif not isValidEmailDomain(stringList[1]): return False