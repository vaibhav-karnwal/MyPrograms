#indentation deni jaruri hoti h python m means apace jo if ka area define karta h 
#if elif else condition ko ese likhte h 
""" if condition1:
        statement1
    elif condition2:
        statement2
	else
		statement3"""

#ticket booking
#1-3 age free 
#4-10 age 100 
#11-60 age 250
#above 60 age 200


age=int(input("Enter your age : "))
if age==0 or age<0:
	print("you can't watch")
elif 0<age<=3:
	print("ticket price = free")
elif 3<age<=10:
	print("ticket price = 100")
elif 10<age<=60:
	print("ticket price = 250")
else:
	print("ticket price = 200")