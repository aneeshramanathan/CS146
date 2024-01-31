package Labs.Lab2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class javapart {
    public static boolean validAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        char [] array = s.toCharArray();
        char [] arrayTwo = t.toCharArray();
        Arrays.sort(array);
        Arrays.sort(arrayTwo);
        for(int i=0; i < s.length(); i++){
            if(array[i] != arrayTwo[i]){
                return false;
            }
        }
        return true;
    }
    

    public static void main (String [] args){
        System.out.println(validAnagram("tea", "eat"));
    }
}

