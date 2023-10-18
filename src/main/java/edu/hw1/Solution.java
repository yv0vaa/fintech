package edu.hw1;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Arrays;
public class Solution{
    private final static Logger LOGGER = LogManager.getLogger();
    public static void prt(){
        LOGGER.info("Hello, world!");
    }
    public static long minutesToSeconds(String s){
        if (s.charAt(3) >= '6'){
            return -1;
        }
        return (Character.getNumericValue((s.charAt(0))) * 10 + Character.getNumericValue(s.charAt(1))) * 60 + 
        + Character.getNumericValue(s.charAt(3)) * 10  + Character.getNumericValue(s.charAt(4));
    }
    public static int countDigits(long n){
        if (n == 0){
            return 1;
        }
        int cnt = 0;
        while (n > 0){
            cnt++;
            n /= 10;
        }
        return cnt;
    }
    public static int min(int[] a){
        int min = a[0];
        for (int elem : a){
            if (elem < min){
                min = elem;
            }
        }
        return min;
    }
    public static int max(int[] a){
        int min = a[0];
        for (int elem : a){
            if (elem > min){
                min = elem;
            }
        }
        return min;
    }
    public static boolean isNestable(int[] a1, int[] a2){
        return min(a1) > min(a2) && max(a1) < max(a2);
    }
    public static String fixString(String s){
        String ans = "";
        for (int i = 0; i < s.length() - 1; i += 2){
            ans += s.charAt(i + 1);
            ans += s.charAt(i);
        }
        if (s.length() % 2 == 1){
            ans += s.charAt(s.length() - 1);
        }
        return ans;
    }
    public static boolean isPalindrome(long n){
        String s = "" + n;
        for (int i = 0; i < s.length() / 2; i++){
            if (s.charAt(i) != s.charAt(s.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindromeDescendant(long n){
        if (countDigits(n) <= 1){
            return false;
        }
        if (isPalindrome(n)){
            return true;
        }
        int m = 0;
        while (n > 0){
            m *= 10;
            m += n % 10 + n % 100;
            n /= 100;
        }
        return isPalindromeDescendant(m);
    }
    public static int toint(char[] arr){
        int ans = 0;
        for (int i = 0; i < 4; i++){
            ans *= 10;
            ans += Character.getNumericValue(arr[i]);
        }
        return ans;
    }
    public static int rev(char[] arr){
        int ans = 0;
        for (int i = 3; i >= 0; i--){
            ans *= 10;
            ans += Character.getNumericValue(arr[i]);
        }
        return ans;
    }
    public static int countK(int n){
        String s = "" + n;
        var arr = s.toCharArray();
        Arrays.sort(arr);
        int a1 = toint(arr), a2 = rev(arr);
        if (a2 - a1 == 6174){
            return 1;
        }
        return 1 + countK(a2 - a1);
    }
    public static int rotateRight(int n, int shift) {
        return (n >>> shift) | (n << (Integer.SIZE - shift));
    } 
    // doesnt work yet
    public static int rotateLeft(int n, int shift) {
        return (n << shift) | (n >>> (Integer.SIZE - shift));
    }
    public static boolean knightBoardCapture(int[][] f){
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                if (f[i][j] == 1){
                    if (i - 2 >= 0 && j - 1 >= 0 && f[i - 2][j - 1] == 1) {
                        return false;
                    }
                    if (i - 2 >= 0 && j + 1 < 8 && f[i - 2][j + 1] == 1) {
                        return false;
                    }
                    if (i - 1 >= 0 && j + 2 < 8 && f[i - 1][j + 2] == 1) {
                        return false;
                    }
                    if (i + 1 < 8 && j + 2 < 8 && f[i + 1][j + 2] == 1) {
                        return false;
                    }
                    if (i + 2 < 8 && j + 1 < 8 && f[i + 2][j + 1] == 1) {
                        return false;
                    }
                    if (i + 2 < 8 && j - 1 >= 0 && f[i + 2][j - 1] == 1) {
                        return false;
                    }
                    if (i + 1 < 8 && j - 2 >= 0 && f[i + 1][j - 2] == 1) {
                        return false;
                    }
                    if (i - 1 >= 0 && j - 2 >= 0 && f[i - 1][j - 2] == 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
