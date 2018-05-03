import math
import sys

triList = []

for i in range(1,int(input("provide upper range "))):
	candidate = 0
	for j in range(i,0,-1):
#		print("adding",j,"to candidate")
		candidate += j
	triList.append(candidate)

#print(triList)

for i in range(len(triList)):
	divisors = []
	for j in range(1,math.ceil(math.sqrt(triList[i]))):
#		print("testing",j)
		if triList[i] % j == 0:
			divisors.append(j)
			divisors.append(int(triList[i] / j))
#	print(triList[i],"has divisors: ",divisors)
	if len(divisors) >= 500:
		sys.exit()

print("answer not found")
