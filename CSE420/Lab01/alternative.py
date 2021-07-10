from pathlib import Path
import re

directorylist = str(Path(__file__).absolute()).split("/")
directory = "/".join(directorylist[:-1])
file = Path(directory+'/input.txt').read_text()


keywords = ["abstract", "break", "boolean", "byte", "case", "catch", "char", "class", "continue", "default","define", "do", "double", "else", "extends", "final", "finally", "float", "for", "if", "implements", "import","include", "instanceof", "int", "interface", "long","native", "new", "package", "private", "protected", "public", "return", "short", "static", "string", "super", "switch", "synchronized", "this", "throw", "throws", "transient", "try", "using", "void", "volatile", "while", "false", "true", "null"]
logic = [">", "<", ">=", "<=","||","&&","^","|","&","!"]
math = ['+', "-", '=', "/","%","*",'++','--']
others = [",", ";", "(",")","{","}","[","]"]

inkeywords = []
inlogic = []
inmath= []
innumbers = []
inothers = []
instrings = []

for word in keywords:
        if word in file:
            inkeywords.append(word)
            file = file.replace(word,"")


for word in logic:
        if word in file:
            inlogic.append(word)
            file = file.replace(word,"")


for word in math:
        if word in file:
            inmath.append(word)
            file = file.replace(word,"")



for word in others:
        if word in file:
            inothers.append(word)
            file = file.replace(word,"")


strings = re.findall(r"[a-zA-Z]+",file)
for string in strings:
    if string not in instrings :
        instrings.append(string)
        file = file.replace(string,"")

innumbers = ' '.join(file.split()).split(" ")

# print(keywords.reverse())
print("Keywords:",", ".join(inkeywords[::-1]))
print("Identifiers:",", ".join(instrings))
print("Math Operators:",", ".join(inmath))
print("Logical Operators:",", ".join(inlogic))
print("Numerical Values:",", ".join(innumbers))
print("Others:"," ".join(inothers))