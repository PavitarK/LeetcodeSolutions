package solutions;
import java.util.*;
import java.lang.Math;

public class binaryGap {
        public int solution(int N) {
            // write your code in Java SE 11
            String bInput = Integer.toBinaryString(N);
            boolean flag1 = false;
            boolean flag2 = false;
            int size = bInput.length();
            int count = 0;
            int gap = 0;
            int largestGap = 0;

            //check if any array left to read
            while(count < size){
                //find smallest 1
                while(!flag1 && count<size){
                    if(bInput.charAt(count) == '1')
                        flag1 =true;

                    count++;
                }

                //count how many zeros in gap
                while(!flag2 && count < size){
                    if(bInput.charAt(count) == '1')
                        flag2 = true;
                    else {
                        gap++;
                        count++;
                    }
                }

                //check if gap is the largest gap and that the gap is closed
                if(gap > largestGap && flag2){
                    largestGap = gap;
                }

                //reset all flags and counters
                gap = 0;
                flag1 = false;
                flag2 = false;
            }

            return largestGap;

        }
    }
