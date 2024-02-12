Problem 1:
a. 10000000000n^2 vs n^3
10000000000n^2 is asymptomatically greater than n^3 until n reaches 10000000000
b. n^2log(n) vs n(log(n))^10
n(log(n))^10 is asymptomatically greater than n^2log(n)
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

  Best Case: O(1), Omega(n)
  Average Case: O(n), Omega(n), Theta(n)
  Worst Case: O(n), Omega(n), Theta(n)
 
