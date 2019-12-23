#ab hame agr 1 se jaida character print krvane ho to 
#hum use karenge string slicing ka 
#jisme hum 
"""string_name[start argument : stop argument -1] use krte h """

name="vaibhav"

#to print vai only
print(name[0:3])

#to print bha
print(name[3:6])

#agr hum start argument or stop argument khaali chhor dete h to 
#vo pura name print krdega 
print(name[ : ])

#agr hum sirf start argument hi khaali chhore to 
#vo sirf stop argument tk k character print karega starting se 
print(name[ :4])

#agr hum sirf stop argument hi khaali chhore to 
#vo sirf start argument se le k end tk k character print krdega 
print(name[4: ])

#hum isme negative arguments bhi le sakte h 
print(name[-3:-1])