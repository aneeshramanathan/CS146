class pythonpart:
    def nFibonacci(n: int) -> int:
        first = 0
        second = 1
        third = None
        for i in range (2, n+1):
            third = first + second
            first = second
            second = third
        return second
    
    print(nFibonacci(9))