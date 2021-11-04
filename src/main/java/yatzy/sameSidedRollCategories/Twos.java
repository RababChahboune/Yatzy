package yatzy.sameSidedRollCategories;

public class Twos extends SameSidedRoll{
    @Override
    public int getScore(int[] roll) {
        return calculateSameSidedScore(roll,2);
    }
}