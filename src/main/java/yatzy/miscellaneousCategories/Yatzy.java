package yatzy.miscellaneousCategories;

import yatzy.Category;

public class Yatzy implements Category {
    @Override
    public int getScore(int[] roll) {
        int i = 0;
        int dice = roll[0];
        while( i < roll.length && roll[i] == dice ){
            i++;
        }
        return i == roll.length ? 50 : 0;
    }
}
