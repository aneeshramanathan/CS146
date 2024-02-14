Problem 1:
a. T(n)=2T(n-1)+1
   T(n-1)=2T(n-2)+2+1
   T(n-2)=2^2T(n-3)+4+2+1
   T(n-3)=2^3T(n-4)+8+2+1
   T(n)=2^k(n-k)+2^0+2^1+2^2+2^3+...+2^k-1
   k=n
   T(n)=2^n(n-n)+2^0+2^1+2^2+2^3+...+2^n-1
   T(n)=2^nT(0)+(n-1/i)∑2^i
   T(n)=2^n*1+2^n-1
   T(n)=2^(n+1)-1
   Masters Theorem: 
   T(n)=aT(n/b)+f(n)
   a=2, b=1, f(n)=1
   n^logb(a)=n^log1(2)=n^0=1
   2nd case because both f(n) and n^logb(a) are both equal to 1
   T(n)=2T(N-1)+1
b. T(n)=3T(n-1)+n
   T(n)=3^2T(n-1)+3n+n
   T(n)=3^3T(n-1)+9n+3n+n
   T(n)=3^k(n-k)+n(3^1+3^2+3+3^3+...+3^k-1)
   k=n
   T(n)=3^n(n-n)+n(3^1+3^2+3+3^3+...+3^n-1)
   T(n)=3^nT(0)+n((n-1/i)∑3^i)
   T(n)=3^n*1+n(3^n-1/2)
   Masters Theorem: 
   T(n)=aT(n/b)+f(n)
   a=3, b=1, f(n)=n
   n^logb(a)=n^log1(3)=n^0=1
   Third case because n grows faster than 1. 
   f(n/b)=3*f(n-1)=3(n-1)=3n-3
   3n-3<=N
   3T(n-1)+n
c. T(n)=9(n/2)+n^2
   T(n)=9(n/4)+(n/2)^2
   T(n)=9(n/8)+(n/4)^2
   T(n)=9^kT(n/2^k)+9^(k-1)(n/2^(k-1))^2
   T(n)=9^kT(n/2^k)+n^2((k-1/i)∑9^i(n/2^(k-1))^2)
   k=log(n)
   T(n)=9^log(n)T(n/2^log(n))+n^2((log(n)-1/i)∑9^i(n/2^(log(n)-1))^2)
   T(n)=9^log(n)*1+n^2((9^log(n)-1)/8-4(2^-2log(n)-1)/3)
   Masters Theorem: 
   T(n)=aT(n/b)+f(n)
   a=9, b=2, f(n)=n^2
   n^2=O(n^c) where c=2
   logb(a)=log2(9)>c
   Case 1 of masters theorem
   O(nlog2(cn)+1)
d. T(n)=100T(n/2)+n^(log2(cn)+1)
   
   Masters Theorem:
   a=100, b=2, f(n)=nlog2(cn)+1
   Case 3 of masters theorem
   n^2log(n)
e. T(n)=4T(n/2)+n^2log(n)
   T(n)=4^2T(n/4)+4(n/2)^2log(n/2)+n^2log(n)
   T(n)=4^3T(n/8)+4^2(n/4)^2log(n/4)+4(n/2)^2log(n/2)+n^2log(n)
   T(n)=4^kT(n/2^k)+4^k-1(n/2^k-1)^2log(n/2^k-1)+4^k-2(n/2^k-2)^2log(n/2^k-2)+4^k-3(n/2^k-3)^2log(n/2^k-3)
   T(n)=4^kT(n/2^k)+(k-1/i=0)∑4^i(n/2^i)^2log(n/2^i)+n^2log(n)
   k=log2(n)
   T(n)=4^log2(n)T(n/2^log2(n))+(log2(n)-1/i=0)∑4^i(n/2^i)^2log(n/2^i)+n^2log(n)
   (log2(n)-1/i=0)∑4^i(n/2^i)^2log(n/2^i)+n^2log(n)=n^2(log(n)(log2(n)-1/i=0)∑1/2^2i-log(2)(log(n-1)/i=0)∑i/2^2i)
   log(n)(log2(n)-1/i=0)∑1/2^2i=4/3-4n^2/3
   log(2)(log(n-1)/i=0)∑i/2^2i=log2(n)
   n^2log(n)
   Masters Theorem:
   T(n)=4T(n/2)+n^2log(n)
   a=4, b=2, f(n)=n^2log(n)
   f(N)=n^2log(n)=n^c, c = 2
   logb(a)=log2(4)=2.
   n^clog(n)
f. T(n)=5T(n/2)+n^2/log(n)
   T(n)=5^2T(n/4)+5(n/2)^2log(n/2)+n^2/log(n)
   T(n)=5^3T(n/8)+5^2(n/4)^2log(n/4)+5(n/2)^2log(n/2)+n^2/log(n)
   T(n)=5^kT(n/2^k)+(k-1/ i=0)∑5^i((n/2^i)^2/log(n/2^i))+n^2/log(n)
   k=log2(n)
   T(n)=5^log2(n)T(n/2^log2(n))+(log2(n)-1/ i=0)∑5^i((n/2^i)^2/log(n/2^i))+n^2/log(n)
   (log2(n)-1/ i=0)∑5^i((n/2^i)^2/log(n/2^i))+n^2/log(n)=(log2(n)-1/ i=0)∑(5^i/log(n)-ilog(2))(n^2/2^2i)=n^2(log2(n)-1/ i=0)∑(1/2^2i)
   T(n)=n^log(2)5
   Masters Theorem:
   T(n)=5T(n/2)+n^2/log(n)
   a=5, b=2, f(n)=n^2/log(n)
   f(n)=n^2/log(n)=O(n^c) where c<2
   O(n^logb(a))

Problem 2:
   yetAnotherFunc(n): 
   if n > 1: 
   for(i=0;i<10n;i++)
      doSomething;
      yetAnotherFunc(n/2);
      yetAnotherFunc(n/2);
   T(n)=2(T(n/2)+10n)=2T(n/2)+20n
   Using masters method:
   a=2, b=2, f(n)=20n
   Second case because 20n has a polynomial degree of 1 and logb(a) is also equal to 1
   T(n)=Theta(n^logb(a)log^k+1(n))=Theta(nlog(n))
