def recBinarySearch(givenList, start, end, key):

    # Base case
    if start > end:
        # Element not found
        return -1

    mid = (start + end) // 2

    if givenList[mid] == key:
        # Final result
        return mid

    elif givenList[mid] < key:
        # Search the right side of list
        return recBinarySearch(givenList, mid + 1, end, key)

    else:
        # Search the left side of list
        return recBinarySearch(givenList, start, mid - 1, key)


if __name__ == '__main__':

    # Take size of list as input
    noOfElements = int(input().strip())

    # Take list as input, in ascending order
    givenList = list(map(int, input().strip().split()))

    # Optional: Sort list
    # Remove commented line to sort the array
    # givenList.sort()

    # Take element to be searched as input
    key = int(input().strip())

    # Perform Binary Search
    result = recBinarySearch(givenList, 0, noOfElements - 1, key)

    if result != -1:
        print("Element", key, "found at index", result)
    else:
        print("Element", key, "not found.")

# Sample Input:
# 
# 10
# 12 23 34 45 56 67 78 89 90 99
# 45
# 
# Sample Input:
# 
# Element 45 found at index 3
