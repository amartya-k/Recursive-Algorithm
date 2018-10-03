def binary_search(values, i, j, key):
    if not i < j:
        return -1
    mid = (i + j) // 2
    if values[mid] < key:
        return binary_search(values, mid + 1, j, key)
    elif values[mid] > key:
        return binary_search(values, i, mid, key)
    else:
        return mid


values = input('Enter the sorted numbers: \n')
values = values.split()
values = [int(x) for x in values]
key = int(input('The number to search for: '))

index = binary_search(values, 0, len(values), key)
if index < 0:
    print('{} was not found.'.format(key))
else:
    print('{} was found at index {}.'.format(key, index))
