package Homework.Homework2;


public class javapart extends VersionControl {
    public int firstBad(int n) {
        int least = 1;
        int greatest = n;
        while(least < greatest){
            int mid = least + (greatest - least) / 2;
            if(isBadVersion(mid)){
                greatest = mid;
            }
            else{
                least = mid + 1;
            }
        }
        return least;
    }
}
