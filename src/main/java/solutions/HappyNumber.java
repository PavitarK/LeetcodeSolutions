package solutions;
import java.util.*;

public class HappyNumber {
        public boolean isHappy(int n) {
            int n_mod;
            int sum = 0;
            int i = 0;
            int new_n = n;
            int compare;
            int remainder;
            boolean check_happy = true;

            HashMap<Integer, Integer> allValues = new HashMap<Integer, Integer>();

            while(check_happy){
                //perform modulus and divisions of number until 0
                for(n_mod = new_n; n_mod > 0; n_mod = n_mod /10){
                    remainder = n_mod %10;
                    sum += remainder * remainder;
                }

                //check if sum = 1
                if(sum == 1){
                    check_happy = false;
                }
                else{
                    check_happy = true;

                    // to check if in an infinite loop make sure we aren't getting the same sum twice
                    allValues.put(i, sum);
                    for(int j = 0; j < i; j++){
                        compare = allValues.get(j);
                        if(compare == sum){
                            return false; //if duplicate found we know not happy
                        }
                    }
                    // if not in infinite loop update flags
                    new_n = sum;
                    sum = 0;
                    i++;
                }
            }
            return true;
        }
    }