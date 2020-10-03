def gcd(a,b):
    if a==0:
        return b
    elif b==0:
        return a
    
    if a==b:
        return a

    if a>b:
        return gcd(a-b,b)
    return gcd(a,b-a)
a=int(input("Enter value of a :"))
b=int(input("Enter value of b :"))
if gcd(a,b):
    print("GCD of",a,"and",b,"is",gcd(a,b))
else:
    print("Invalid")
