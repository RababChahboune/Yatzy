package yatzy.sameSidedRollCategories;

public class Ones extends SameSidedRoll{
    @Override
    public int getScore(int[] roll) {
        return calculateSameSidedScore(roll,1);
    }
}
