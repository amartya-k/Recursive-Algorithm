#include <stdio.h>
int gcd(int a, int b) 
{ 
    // Everything divides 0  
    if (a == 0) 
       return b; 
    if (b == 0) 
       return a; 
    // base case 
    if (a == b) 
        return a; 
        
    // a is greater 
    if (a > b) 
        return gcd(a-b, b); 
}
  


int main()
{
    int n1, n2, i, gcd;
    printf("Enter two integers: ");
    scanf("%d %d", &n1, &n2);
    printf("G.C.D of %d and %d is %d", n1, n2, gcd(n1,n2);
    return 0;
}
