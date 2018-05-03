import itertools
import math

#array = list(itertools.product([0,1], repeat=40))
#countGlob = 0

#for i in range(0,math.factorial(20)):
#	countLoc = 0
#	for j in range(0,20):
#		if array[i][j] == 1:
#			print("item",i,"of attempt",i,"is 'down'")
#			countLoc += 1
#	if countLoc == 5:
#		countGlob += 1

#print(countGlob)

print(math.factorial(40)/(math.factorial(20)*math.factorial(20)))
