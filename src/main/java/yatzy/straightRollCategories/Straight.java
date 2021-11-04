package yatzy.straightRollCategories;

import yatzy.Category;

public abstract class Straight implements Category {

    protected boolean isStraight(int[] roll , StraightType type) {
        int[] sides = getSidesCount(roll);
        int i = type.equals(StraightType.large) ? 1 : 0;
        while (i < roll.length && sides[i] == 1){
            i++;
        }
        return i == roll.length;
    }

    protected enum StraightType{
        small,
        large
    }
}
