#string ko center m rakh k dono side m alag se design banane k liye
# center method ka use krte h ")
"""string_name.center(string + kitne charactar tk design banana h vo in integer,"design")"""
name="Vaibhav"
print(name.center(9,"*"))


name5=input("enter your name")
print(name5.center(len(name5)+4,"*"))

name4,word=input("enter the name to decorate").split(",")
print(name4.center(len(name4)+8,"word"))