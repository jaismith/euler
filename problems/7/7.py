primes = []

def sift(bound):
	primeList = [1] * bound
	primeList[0] = 0
	primeList[1] = 0
	for i in range(4,bound,2):
		primeList[i] = 0
	for i in range(3,bound,2):
		if primeList[i] == 1:
			for j in range(2 * i,bound,i):
				primeList[j] = 0
	for i in range(0,bound):
		if primeList[i] == 1:
			primes.append(int(i))

sift(int(input("specify upper bound ")))

print(primes[10000])
