import solutions.HappyNumber;

import static solutions.ArrangingCoins.arrangeCoins;

public class main {
    public static void main(String[] args) {
        int n = 4;
        HappyNumber happy = new HappyNumber(); 

        System.out.println(happy.isHappy(n));
    }

}
