#agr hame user se input m space k sath string milti h to usko kaise remove kare 
#left side ki space hatane k liye lstrip ka use krte h 
"""string_name.lstrip()"""
#right side ki space hatane k liye rstrip ka use krte h 
"""string_name.rstrip()"""
#dono side ki space hatane k liye strip ka use krte h 
"""string_name.strip()"""
#string k bich ki space hatane k liye replace ka use krte h 
"""string_name.replace("jo replace krna h","jisse replace krna h")"""

name="      vai   bhav     "
dot="....."
print(name.lstrip()+dot)
print(name.rstrip()+dot)
print(name.strip()+dot)
print(name.replace(" ","")+dot)