#include<iostream>
using namespace std;
int gcd(int n1, int n2){
    if(n2==0){
        return n1;
    }else{
        return gcd(n2, n1%n2);
    }
}
int main(){
    int n1, n2, g;
    cout<<"Enter two numbers : ";
    cin>>n1>>n2;
    g = gcd(n1,n2);
    cout<<"GCD of "<<n1<<" and "<<n2<<" is: "<<g;
    return 0;
}
