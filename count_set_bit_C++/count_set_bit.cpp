#include<bits/stdc++.h>
using namespace std;
int count_set_bit(int n){
    if(n==0){
        return 0;   // base case
    }
    else{
        return (n&1)+(count_set_bit(n>>1));
    }
}
int main(){
    cout<<count_set_bit(13)<<endl;
}