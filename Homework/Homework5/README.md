Problem 1:
a. T(n)=2T(n-1)+1
   T(n-1)=2T(n-2)+2+1
   T(n-2)=2T(n-3)+4+2+1
   T(n-3)=2T(n-4)+8+2+1
   T(n)=2^k(n-k)+2^0+2^1+2^2+2^3+...+2^k-1
   n=k
   T(n)=2^n(n-n)+2^0+2^1+2^2+2^3+...+2^n-1
   T(n)=2^nT(0)+(n-1/i)∑2^i
   T(n)=2^n*1+2^n-1
   T(n)=2^(n+1)-1

   