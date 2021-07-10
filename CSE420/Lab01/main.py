from pathlib import Path
import re

directorylist = str(Path(__file__).absolute()).split("/")
directory = "/".join(directorylist[:-1])
file = Path(directory+'/input.txt').read_text()


keywords = ["abstract", "break","bool", "boolean", "byte", "case", "catch", "char", "class", "continue", "default","define", "do", "double", "else", "extends", "final", "finally", "float", "for", "if", "implements", "import","include", "instanceof", "int", "interface", "long","native", "new", "package", "private", "protected", "public", "return", "short", "static", "string", "super", "switch", "synchronized", "this", "throw", "throws", "transient", "try", "using", "void", "volatile", "while", "false", "true", "null", "printf", "scanf"]
logic = [">", "<", ">=", "<=","||","&&","^","|","&","!", "==", "!="]
math = ['+', "-", '=', "/","%","*",'++','--']
others = [",", ";", "(",")","{","}","[","]"]

inkeywords = []
inlogic = []
inmath= []
innumbers = []
inothers = []
instrings = []


for other in others:
    if other in file:
        inothers.append(other)
        file = file.replace(other,"")


file = " ".join(file.split()).split(" ")
for word in file:
        if word in keywords:
            if word not in inkeywords:
                inkeywords.append(word)
            file.remove(word)

        elif word in logic: 
            if word not in inlogic:
                inlogic.append(word)
            file.remove(word)
            
        elif word in math:
            if word not in inmath:
                inmath.append(word)
            file.remove(word)

        elif word in others:
            if word not in inothers:
                inothers.append(word)
            file.remove(word)



file = " ".join(file)
strings = re.findall(r"[a-zA-Z]+",file)
for string in strings:
    if string not in instrings :
        instrings.append(string)
    file = file.replace(string, "")

innumbers = file.split()

print("Keywords:",", ".join(inkeywords))
print("Identifiers:",", ".join(instrings))
print("Math Operators:",", ".join(inmath))
print("Logical Operators:",", ".join(inlogic))
print("Numerical Values:",", ".join(innumbers))
print("Others:"," ".join(inothers))