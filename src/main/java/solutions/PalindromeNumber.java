package solutions;

//Leetcode Problem 09.Palindrome Number: https://leetcode.com/problems/palindrome-number/

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        double palindrome=0;
        int temp = x;
        int adding;

        if(temp < 0){
            System.out.println("false");
            return false;
        }

        while(temp > 0){
            palindrome = palindrome * 10;
            adding = temp % 10;
            palindrome = palindrome + adding;
            temp = temp/10;
        }
        return palindrome == x;
    }
}
