package yatzy.sameOfAKindCategories;

public class FourOfAKind extends SameOfAKind{
    @Override
    public int getScore(int[] roll) {
        return calculateSameKindScore(roll, Kind.four);
    }
}
