void insertionSort(int arr[], int n)
{
    int i;                                      1
    int key;                                    1
    int j;                                      1
    for (i = 1; i < n; i++) {                   N+1
        key = arr[i];                           N
        j = i - 1;                              N
        while (j >= 0 && arr[j] > key) {        N(N+1)
            arr[j + 1] = arr[j];                N(N)
            j = j - 1;                          N(N)
        }
        arr[j + 1] = key;                      N
    }
}

I think that the insertion time complexity of insertion sort is N^2 and that means it is quadratic. Using the code above I wrote the amount of iterations each line is performed and since there is a nested while loop inside the for loop that while loop will go N(N+1) times. The highest power is N^2 which is why the insertion sort algorithm is quadratic since the highest power is 2.
