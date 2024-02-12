Problem 1:
a. 10000000000n^2 vs n^3
n^3 is asymptomatically greater than 10000000000n^2
n^3 grows at a faster rate than n^2 because the exponent is bigger.
b. n^2log(n) vs n(log(n))^10
n^2log(n) is asymptomatically greater than n(log(n))^10
The first grows relating to n^2 and if you use the log formulas for the second one you notice that the equation only grows until n.
c. n^log(n) vs 2^sqrt(n)
2^sqrt(n) is asymptomatically greater than n^log(n)
If you simplify you get that 2^sqrt(n) is equivalent to log(sqrt(n)) and that is bigger than 2log(log(n)).
d. 2^n vs 2^2n
2^2n is asymptomatically greater than 2^n
the exponent 2n is greater then the exponent n.

Problem 2:
isPrime(n): 
  for(i = 2, i*i <= n; i++) {
    if(n % i == 0) {
      return false
    }
  return true

  Best Case: O(1). If there is an even number then it would be the best case.
  Average Case: O(sqrt(n)). When it is a prime nimber.
  Worst Case: O(sqrt(n))
 
