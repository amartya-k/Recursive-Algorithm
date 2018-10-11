from random import randint


def recursive(arr, low, high, x, sort=False):

    if sort:
        arr.sort()

    """
    Perform Binary Ceil Search by Recursive Method.
    :param array: Iterable of elements.
    :param left: start limit of array.
    :param right: end limit of array.
    :param element: element to be searched.
    :param sort: True will sort the array first then search, By default = False.
    :return: returns value of index of element (if found) else return None.
    """

    if x <= arr[low]:
        return low

    if x > arr[high]:
        return None

    mid = (low + high) // 2

    if arr[mid] == x:
        return mid

    elif arr[mid] < x:
        if mid + 1 <= high and x <= arr[mid + 1]:
            return mid + 1
        else:
            return recursive(arr, mid + 1, high, x)

    else:
        if mid - 1 >= low and x > arr[mid - 1]:
            return mid
        else:
            return recursive(arr, low, mid - 1, x)


def main():
    array = [randint(1,10000) for _ in range(100)]
    print(array)
    element = randint(1,10000)
    print(element)
    result = recursive(array, 0, 99, element, True)
    if result is None:
        print('Recursive Ceil Search : Element not present in array')
    else:
        print('Recursive Ceil Search : Element is present at index', result)

    array.sort()
    # print(array)

if __name__ == '__main__':
    main()
