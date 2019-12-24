#Ask user name and age 
#if user name start with("a" or "A") and age is above 10 then
#print "u can watch coco movie")
#else print "Sorry, you can not watch coco ")



name=input("enter your name : ")
age=int(input("Enter your age : "))
if name[0]=="a" or name[0]=="A" and age>10:
	print("u can watch coco movie")
else:
	print("Sorry, you can not watch coco ")
