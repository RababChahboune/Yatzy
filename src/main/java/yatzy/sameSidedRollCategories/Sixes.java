package yatzy.sameSidedRollCategories;

public class Sixes extends SameSidedRoll{
    @Override
    public int getScore(int[] roll) {
        return calculateSameSidedScore(roll,6);
    }
}
