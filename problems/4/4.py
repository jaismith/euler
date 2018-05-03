import sys

def checkPalindrome(test):
	for i in range(0,int(len(test)/2)):
	        if test[i] != test[len(test)-1-i]:
        	        return(0)
	return(1)

#print(checkPalindrome(str(input("provide number to test "))))

for num2 in range (999,900,-1):
	num1 = 999
	for num1 in range (999,900,-1):
		if checkPalindrome(str(num1*num2)):
			print(num1,"*",num2,"equals palindrome",num1*num2)
			sys.exit()
		num1 += -1
		print("checking",num1,"times",num2)
	num2 += -1
