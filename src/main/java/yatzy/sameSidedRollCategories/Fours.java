package yatzy.sameSidedRollCategories;

public class Fours extends SameSidedRoll{
    @Override
    public int getScore(int[] roll) {
        return calculateSameSidedScore(roll,4);
    }
}
