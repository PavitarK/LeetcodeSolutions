package solutions;
import java.util.ArrayList;
import java.util.List;

/*
Leetcode Problem 412. Fizz Buzz
Runtime: 1 ms, faster than 99.88% of Java online submissions for Fizz Buzz.
Memory Usage: 38.1 MB, less than 100.00% of Java online submissions for Fizz Buzz.
*/

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        //intialize a new ArrayList
        List<String> fizzBuzz = new ArrayList<String>();

        //increment from 1 to n
        for(int i=1; i<=n; i++){
            //check if the value is a multiple of 3 and 5
            if(i%3 ==0 && i%5 ==0)
                fizzBuzz.add("FizzBuzz");

            //check multiple of three and add to the list accordingly
            else if(i%3==0)
                fizzBuzz.add("Fizz");

            //check multiple of five and add to the list accordingly
            else if(i%5==0)
                fizzBuzz.add("Buzz");

            //if all else fails simply add the number to the list
            else
                fizzBuzz.add(String.valueOf(i));
        }
        return fizzBuzz;
    }
}

