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

#for i in primes:
#	print(i)

factors = []

checking = 1

target = 600851475143

i = 1

while target not in primes:
	i = 1
	checking = 1
	while checking:
		print("checking",primes[i])
		if target % primes[i] == 0:
			factors.append(primes[i])
			print("dividing",target,"by",primes[i])
			target = target / primes[i]
			print("target is now",target)
			checking = 0
		i += 1

factors.append(target)

for i in factors:
	print(i)
