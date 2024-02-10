package BonusQuestion.BonusQuestion1;

class javapart{
    public static int nFibonacci(int n){
        int first = 0;
        int second = 1;
        int third; 
        for(int i = 2; i <= n; i++ ){  
            third = first + second;
            first = second;
            second = third;
        }
        return second; 
    }
    public static void main(String[] args) {
        System.out.println(nFibonacci(9));
    }
}
