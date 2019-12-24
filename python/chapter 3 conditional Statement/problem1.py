#indentation deni jaruri hoti h python m means apace jo if ka area define karta h 
#Nested if else condition ko ese likhte h 
"""if condition:
        statement1
    else:
        if condition2:
            statement2
        else:
            statement3"""
            
#make a variable ,like winning_number and assign any number to it
#ask user to guess a number
#if user guessed correctly then print "YOU WIN"
#if user didn't guessed correctly then:
    #if user guessed lower than actual number then print "too low"
    #if user guessed higher than actual number then print "too high"

winning_number=23
guess_number=int(input("Guess a number : "))
if guess_number == winning_number:
	print("YOU WIN")
else:
    if guess_number < winning_number:
        print("too low")
    else:
        print("too high")