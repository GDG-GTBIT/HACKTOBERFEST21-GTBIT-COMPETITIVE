struct Pair getMinMax(int arr[], int n)
{
    struct Pair minmax;    
    int i;
     
    // If array has even number of elements
    // then initialize the first two elements
    // as minimum and maximum
    if (n % 2 == 0)
    {
        if (arr[0] > arr[1])    
        {
            minmax.max = arr[0];
            minmax.min = arr[1];
        }
        else
        {
            minmax.min = arr[0];
            minmax.max = arr[1];
        }
         
        // Set the starting index for loop
        i = 2;
    }
     
    // If array has odd number of elements
    // then initialize the first element as
    // minimum and maximum
    else
    {
        minmax.min = arr[0];
        minmax.max = arr[0];
         
        // Set the starting index for loop
        i = 1;
    }
     
    // In the while loop, pick elements in
    // pair and compare the pair with max
    // and min so far
    while (i < n - 1)
    {        
        if (arr[i] > arr[i + 1])        
        {
            if(arr[i] > minmax.max)    
                minmax.max = arr[i];
                 
            if(arr[i + 1] < minmax.min)        
                minmax.min = arr[i + 1];    
        }
        else       
        {
            if (arr[i + 1] > minmax.max)    
                minmax.max = arr[i + 1];
                 
            if (arr[i] < minmax.min)        
                minmax.min = arr[i];    
        }
         
        // Increment the index by 2 as
        // two elements are processed in loop
        i += 2;
    }        
    return minmax;
}
