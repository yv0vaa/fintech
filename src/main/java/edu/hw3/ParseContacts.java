package edu.hw3;
import java.util.Arrays;

public class ParseContacts {
    
    public static String[] parseContacts(String[] array, String order){
        Arrays.sort(array, new MyCompare());      
        if (order.equals("DESC")){
            for (int i = 0; i < array.length / 2 ; i++){
                var temp = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = temp;
            }
        } 
        return array;
    }
}
