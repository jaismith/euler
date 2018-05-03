import sys

for a in range(1,999):
	for b in range(1,999):
		for c in range(1,999):
#			print("checking",a,",",b,",",c)
			if a**2 + b**2 == c**2:
				if a + b + c == 1000:
					print("found",a * b * c)
					sys.exit()
