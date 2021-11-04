package yatzy.straightRollCategories;

public class SmallStraight extends Straight{

    @Override
    public int getScore(int[] roll) {
        return isStraight(roll,StraightType.small) ? 15 : 0;
    }

}
