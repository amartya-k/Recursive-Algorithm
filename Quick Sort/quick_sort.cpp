// function for doing partition in array
long long int partition(long long int a[],long long int be,long long int end)
{
   

    //taking pivot as random element of the array use inbuilt rand function 
   //generating a random number between beginning and ending index
    int pivotIndex = be + rand() % (end - be+1);
    int pivot;
    pivot = a[pivotIndex];

    swap(a[pivotIndex], a[end]);
    pivotIndex = end;
    int k = be - 1;
    for (int i = be; i <end; i++)
    {
        if (a[i] <= pivot)
        {
            k++;
            swap(a[i], a[k]);
        }
    }
    swap(a[k + 1], a[pivotIndex]);
    return (k + 1);
}

// function for quick sort
void quicksort(long long int a[],long long  int be,long long  int end)
{
    if (be < end)
    {
        long long int p = partion(a, be, end);
        quicksort(a, be, p-1);
        quicksort(a, p + 1, end);
    }
}