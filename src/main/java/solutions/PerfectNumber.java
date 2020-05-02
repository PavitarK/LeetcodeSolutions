package solutions;

//Leetcode Problem 507. Perfect Number

public class PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        //Type casting the input to a double
        double i = (double) num;
        double sum =0 ;

        //Edge cases if input is 0 or if input is odd the result must be false
        if (num == 0 || num%2 !=0) {
            return false;
        }

        // Create a list of all the input's divisors while the list is greater than 1.
        do {
            i = Math.round(i / 2); //division that rounds the output up.
            sum+=i; // add result to sum
        }   while(i > 1);

        //Check if the sum of the list is equal to the input and return result
        return sum == num;
    }
}
