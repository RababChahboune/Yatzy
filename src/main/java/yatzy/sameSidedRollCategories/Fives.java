package yatzy.sameSidedRollCategories;

public class Fives extends SameSidedRoll{
    @Override
    public int getScore(int[] roll) {
        return calculateSameSidedScore(roll,5);
    }
}
