##string k bich m se kisi word ya sentence ko replace karne k liye 
#dusre words ya sentence se replace method ka use krte h 
"""string_name.replace("jo replace krna h","jisse replace krna h")"""
#kitne word replace krne h uski limit bhi set kr sakte h , and kitni limit h vo laga kr 
"""string_name.replace("jo replace krna h","jisse replace krna h","limit")"""

string,word1,word2=input("enter the whole paragraph and the replacing word to and from with commas").split(",")
print(string.replace(word1,word2))
print(string.replace(word1,word2,1))