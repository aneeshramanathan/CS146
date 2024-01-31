package Homework.Homework1;

class Solution {
    public static boolean isPalindrome(String s) {
        String newString = "";
        for(int i = 0; i < s.length() - 1; i++){
            if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))){
                newString += s.charAt(i);
            }
        } 
        newString = newString.toLowerCase();
        int i = 0;
        int j = newString.length() - 1;
        while(i <= j){
            if(newString.charAt(i) != newString.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[]args){
        System.out.println(isPalindrome("race a car"));
    }
}
