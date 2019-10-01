# Python program to find LCM of two numbers 
# Recursive function to return gcd of a and b 
def gcd(a,b):   
    # base case if a and b are equal  
    if (b == 0): 
        return a 
    # if a is greater 
    if (b > a): 
        return gcd(b, a) 
          
    return gcd(b, a%b) 
  
# Function to return LCM of two numbers 
def lcm(a,b): 
    return (a*b) // gcd(a,b) 
  
# Driver program to test above function 
a = 15 
b = 55
print('LCM of', a, 'and', b, 'is', lcm(a, b)) 
  
