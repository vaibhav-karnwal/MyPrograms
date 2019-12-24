#string k bich m se kisi word ya sentence ki location pata karne k liye 
#find method ka use kiya jaata h
"""string_name.find("jo word dhundna h")"""
#find method m limit bhi set kr sakte h ki kaha se usko search krna h 
"""string_name.find("jo word dhundna h","starting position")"""

sentence,word=input("enter the paragraph and word to find with comma").split(",")
print(sentence.find(word,"2"))
