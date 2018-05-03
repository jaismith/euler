import sys

chain = []

def checkCollatz(num):
	chain.append(num)
	while (num != 1):
		if num % 2 == 0:
			num = num/2
		else:
			num = (3 * num) + 1
		chain.append(int(num))

count = 0
cache = 0
max = 0
percent = 0

for i in range(999999,599999,-1):
	if i % 1999 == 0:
		percent += .5
		print("\r",percent,cache)
	chain = []
	checkCollatz(i)
	if len(chain) > cache:
		max = i
		cache = len(chain)

print(max)
