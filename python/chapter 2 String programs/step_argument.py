#step argument ka use step wise character print krne k liye hota h 
#jaise ki agr string h "vaibhav"
#to isme agr hum step argument 1 lete h to yeh as it is print krdega 
#but agr hum 2 lete h to yeh "vihv" print karega
#agr hum 3 lete h to yeh "vbv" print karega
"""name[start argument:stop argument:step argument]"""

name="vaibhav"
print(name[0:6:1])
print(name[0:6:2])
print(name[0:6:3])
print(name[ : :1])
print(name[5: :-1])			#reverse m print krdega 5th position se 
print(name[6: :-1])			#reverse m print krdega 6th position se 
print(name[ : :-1])			#reverse krdega puri string 