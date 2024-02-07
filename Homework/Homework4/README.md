Problem 1:
  Insertion sort
    - The best case time for insertion sort is O(n), Omega(n), Theta(n) because the array is already sorted so you only have to do the same         number of comparisons as the length of the array that you want to be sorted.
    - The worst case time for insertion sort is O(n^2), Omega(n^2), Theta(n^2) because the array would be in reverse order which means the          largest element would be at the beginning and the smallest element would be at the end. In this case the insertion sort would have to         iterate over the whole array and each time it would move that value a number of times and every iteration in the for loop it would            increase the amount of times it has to move the value by one.
    - The average case time for insertion sort is O(n^2), Omega(n^2), Theta(n^2) when the array is not sorted but the values are in random          order. In this case it has O(n^2) time complexity because insertion sort iterates over each element and inserts in into the correct           position and also the average time xomplecity is the same as the worst case time complexity.

Problem 2:
  Matrix Multiplication
    - The best case time for matrix multiplication is O(rows_A * columns_B * columns_A), Omega(rows_A * columns_B * columns_A), Theta(rows_A       * columns_B * columns_A). This is because the time complexity is proportional to the the dimensions of the matrix.
    - The worst case time for matrix multiplication is O(rows_A * columns_B * columns_A), Omega(rows_A * columns_B * columns_A),                   Theta(rows_A * columns_B * columns_A). The time compexity of the worst case is the same as the best case because the time complexity         is heavily dependent on the size of the matrix.
    - The average case time for matrix multiplication is O(rows_A * columns_B * columns_A), Omega(rows_A * columns_B * columns_A),                 Theta(rows_A * columns_B * columns_A). The average case is the same as the worst case time complexity.
  
