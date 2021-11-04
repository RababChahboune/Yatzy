package yatzy.sameOfAKindCategories;

public class ThreeOfAKind extends SameOfAKind{
    @Override
    public int getScore(int[] roll) {
        return calculateSameKindScore(roll,Kind.three);
    }
}
