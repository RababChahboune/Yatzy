package yatzy.miscellaneousCategories;

import yatzy.Category;

public class TwoPair implements Category {

    @Override
    public int getScore(int[] roll) {
        int[] sides = getSidesCount(roll);
        int pairCount = 0;
        int score = 0;
        for (int i = sides.length-1 ; i >= 0; i--){
            if (sides[i] >= 2) {
                pairCount++;
                score += i+1;
            }
        }
        return pairCount == 2 ? score * 2 : 0;
    }
}
