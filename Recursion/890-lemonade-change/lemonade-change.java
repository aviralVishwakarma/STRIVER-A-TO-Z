class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5)
                five++;
            else if (bills[i] == 10)
                ten++;
            int rem = bills[i] - 5;
            if (rem == 0)
                continue;
            else if (rem == 5 && five >= 1) {
                five--;
            } else if (ten >= 1 && five >= 1) {
                five--;
                ten--;
            } else if (five >= 3) {
                five -= 3;
            } else {
                return false;
            }
        }
        return true;
    }
}