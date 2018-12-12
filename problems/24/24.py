# problem 24

from copy import copy

NUMBERS = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

permutation_count = 0
permutations = list()


# recursive function
def permute(pool, permutations, current=list(), depth=1):
    # print("pool: {0}; current: {1}; depth: {2}".format(pool, current, depth))
    # base case
    if depth == len(NUMBERS):
        current.append(pool[0])
        permutations.append(current)
        current = list()
        return

    temp_pool = copy(pool)
    temp_current = copy(current)

    # recursive case
    for i in range(len(temp_pool)):
        pool = copy(temp_pool)
        current = copy(temp_current)
        current.append(pool[i])
        pool.remove(pool[i])
        permute(pool, permutations, current, depth + 1)


permute(copy(NUMBERS), permutations)

print(permutations[999999])
print("done")
