#user ka name lena h or uski length print krvani h or 
#dusra user se ek character input krvana h or usko count krna h 
#ki kitni baar aata h name m

name,char=input("enter your name and the character which u want to count ").split(",")
print("length of your name is "+str(len(name.strip())))
print(f"count of {char} in {name} is {name.strip().lower().count(char.strip().lower())}")