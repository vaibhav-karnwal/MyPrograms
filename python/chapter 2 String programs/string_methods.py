#kisi bhi string ki length nikalne k liye len function ka use krte h 
"""len(string_name)"""
#kisi bhi string k sb character ko lower case m krne k liye lower method ka use krte h 
"""string_name.lower()"""
#ksisi bhi string k sb character ko upper case m krne k liye upper method ka use krte h
"""string_name.upper()"""
#kisi bhi string k first character ko upper case m or sb character ko lower case m 
#krne k liye title method ka use krte h 
"""string_name.title()"""
#kisi bhi character ko kisi string m se count krne k liye count method ka use krte h 
"""string_name.count()"""

name="vAiBhAv"
char="a"
print(f"length of string = {len(name)}")
print(f"string in lower case = {name.lower()}")
print(f"string in upper case = {name.upper()}")
print(f"string in title form = {name.title()}")
print(f"character count in string {name.lower().count(char)}")