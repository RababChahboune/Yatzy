package yatzy.miscellaneousCategories;

import yatzy.Category;

public class Pair implements Category {

    @Override
    public int getScore(int[] roll) {
        int[] sides = getSidesCount(roll);
        for (int i = sides.length - 1; i >= 0; i--){
            if (sides[i] >= 2){
                return (i+1) * 2;
            }
        }
        return 0;
    }
}
