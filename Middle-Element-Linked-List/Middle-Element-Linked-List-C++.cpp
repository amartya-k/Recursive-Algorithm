#include <iostream>
using namespace std;

// Tree Node Structure
struct Node
{
    int data;
    struct Node *next;
};

// Create new Node
Node *newLNode(int data)
{
    Node *temp = new Node;
    temp->data = data;
    temp->next = NULL;
    return temp;
}
// Function for finding midpoint recursively
void midpoint_util(Node *head, int *n, Node **mid)
{

    // If we reached end of linked list
    if (head == NULL)
    {
        *n = (*n) / 2;
        return;
    }

    *n = *n + 1;

    midpoint_util(head->next, n, mid);

    // Rolling back, decrement n by one
    *n = *n - 1;
    if (*n == 0)
    {

        // Final answer
        *mid = head;
    }
}

Node *midpoint(Node *head)
{
    Node *mid = NULL;
    int n = 1;
    midpoint_util(head, &n, &mid);
    return mid;
}

int main()
{
    Node *head = newLNode(10);
    head->next = newLNode(20);
    head->next->next = newLNode(30);
    head->next->next->next = newLNode(40);
    head->next->next->next->next = newLNode(50);
    Node *result = midpoint(head);
    cout << result->data << endl;
    return 0;
}