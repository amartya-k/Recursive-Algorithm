#Code contributed by Navtika Kumar
n = input("Enter the string of digits: ")
maxprod = 0
number = ""
first = 0
last = 0
while first < len(n)-12:
    last = first + 13
    num = n[first:last]
    total = 1
    for i in num:
        total *= int(i)
    if total > maxprod:
        maxprod = total
        number = num
    first += 1
print("13 adjacent numbers with greatest product are: ",number)
print("\nTheir product value is: ",maxprod)