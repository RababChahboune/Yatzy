package yatzy.straightRollCategories;

public class LargeStraight extends Straight{

    @Override
    public int getScore(int[] roll) {
        return isStraight(roll,StraightType.large) ? 20 : 0;
    }

}
