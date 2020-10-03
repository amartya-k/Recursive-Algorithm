def fac(n):
    if n==0:
        return 1
    elif n==1:
        return n
    else:
        return n*fac(n-1)
n=int(input("Enter a number: "))
if n<0:
    print("Enter a number greater than 0")
else:
    print("The factorial of "+str(n)+" is "+str(fac(n)))
