# main file for euler 25

# imports

from math import ceil

# variables

found = False
prev = 1
prev2 = 1
index = 2

# main

while not found:
    current = prev + prev2
    prev2 = prev
    prev = current
    index += 1

    # print('F{0} = {1}'.format(index, current))

    length = len(str(current))

    if length == 1000:
        found = True

    if length % 5 == 0:
        print('\rProgress: [', end='')
        for i in range(ceil((length / 1000) * 50)):
            print('#', end='')
        print(']', end='')


print('\nF{0} = {1}'.format(index, current))
