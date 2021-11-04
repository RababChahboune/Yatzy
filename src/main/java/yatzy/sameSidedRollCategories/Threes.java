package yatzy.sameSidedRollCategories;

public class Threes extends SameSidedRoll{
    @Override
    public int getScore(int[] roll) {
        return calculateSameSidedScore(roll,3);
    }
}
