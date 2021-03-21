import solutions.HappyNumber;

import static solutions.ArrangingCoins.arrangeCoins;

public class main {
    public static void main(String[] args) {
        int n = 20;
        HappyNumber happy = new HappyNumber(); 

        System.out.println(happy.isHappy(n));
    }

}
