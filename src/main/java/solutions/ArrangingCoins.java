package solutions;

public class ArrangingCoins {

    public static int arrangeCoins(int n) {
         int remain = n, used = 0, row = 0;

         while(remain > 0){
             if(remain > used) {
                 used += row + 1;
                 remain -=row + 1;
                 row++;
             }
             else if(remain >= row) {
                 used += row;
                 remain -= row;
                 row++;
             }
         }

         if(remain < 0)
             return row -1;
         else
             return row;
    }
}
