#include <bits/stdc++.h> 

using namespace std; 
  
void reverseQueue(queue<long long int>& q) 
{ 
    // Base case 
    if (q.empty()) 
        return; 
  
      
    long long int data = q.front(); 
    q.pop(); 
  
      
    reverseQueue(q); 
  
       
    q.push(data); 
} 
  
 
int main() 
{ 
    queue <long long int> Queue; 
    for (int i=0; i<5; i++){
        Queue.push(rand()%10 +1);
    }
    //before
     while (!Queue.empty()) { 
        cout << Queue.front() << " "; 
        Queue.pop();
    }
     
    reverseQueue(Queue); 
    
    //after
    
    while (!Queue.empty()) { 
        cout <<"\n"<< Queue.front() << " "; 
        Queue.pop(); 
    } 
}