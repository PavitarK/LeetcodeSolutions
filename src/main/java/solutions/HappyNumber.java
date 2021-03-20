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
                for(n_mod = new_n; n_mod > 0; n_mod = n_mod /10){
                    remainder = n_mod %10;
                    sum += remainder * remainder;
                }
                if(sum == 1){
                    check_happy = false;
                }
                else{
                    check_happy = true;
                    allValues.put(i, sum);
                    for(int j = 0; j < i; j++){
                        compare = allValues.get(j);
                        if(compare == sum){
                            return false;
                        }
                    }
                    new_n = sum;
                    sum = 0;
                    i++;
                }
            }
            return !check_happy;
        }
    }