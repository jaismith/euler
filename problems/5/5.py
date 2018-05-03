import sys

def check(test):
	for i in range(3,20):
#		print("testing",test,"for divisibility by",i)
		if test % i != 0:
#			print(j,"is not divisible by",i)
			return(0)
	return(1)

for j in range(20,10000000000000000,20):
#	print(j)
	if check(j) == 1:
		print("smallest multiple found:",j)
		sys.exit()
#print(check(int(input("enter test num "))))
