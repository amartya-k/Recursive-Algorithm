def fibo(n):
    if n==1:
        return 0
    elif n==2:
        return 1
    else:
        return fibo(n-1)+fibo(n-2)
n=int(input("Enter the value of n: "))
if n<0:
    print("Enter a number greater than 0")
else:
    print("The fibonacci number is "+str(fibo(n)))
