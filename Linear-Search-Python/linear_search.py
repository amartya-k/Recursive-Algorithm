from random import randint

"""
Python code for linearly search x in arr[].  If x
is present then return its  location,  otherwise
return None.
"""


def recursive(array, element, low):
    """
    Perform Linear Search by Recursive Method.
    :param array: Iterable of elements.
    :param low: traversing variable of an array.
    :param element: element to be searched.
    :return: returns value of index of element (if found) else return None.
    """
    if array[low]==element:
        return low

    if low==len(array)-1:
        return None

    return recursive(array, element, low+1)



def main():
    array = [randint(1,100) for _ in range(100)]
    element = randint(1,100)

    print(array)
    print(element)

    result = recursive(array, element, 0)
    if result is None:
        print('Recursive Linear Search : Element not present in array')
    else:
        print('Recursive Linear Search : Element is present at index', result)
    result = iterative(array, element)
    if result is None:
        print('Iterative Linear Search : Element not present in array')
    else:
        print('Iterative Linear Search : Element is present at index', result)


if __name__ == '__main__':
    main()