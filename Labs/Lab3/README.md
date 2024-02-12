Problem 1:
a. 10000000000n^2 vs n^3
n^3 is asymptomatically greater than 10000000000n^2
b. n^2log(n) vs n(log(n))^10
n^2log(n) is asymptomatically greater than n(log(n))^10
c. n^log(n) vs 2^sqrt(n)
2^sqrt(n) is asymptomatically greater than n^log(n)
d. 2^n vs 2^2n
2^2n is asymptomatically greater than 2^n

Problem 2:
isPrime(n): 
  for(i = 2, i*i <= n; i++) {
    if(n % i == 0) {
      return false
    }
  return true

  Best Case: O(1)
  Average Case: O(sqrt(n))
  Worst Case: O(sqrt(n))
 
