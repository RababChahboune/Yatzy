package yatzy.sameOfAKindCategories;

import java.util.Arrays;

public class FullHouse extends SameOfAKind{
    @Override
    public int getScore(int[] roll) {
        return calculateSameKindScore(roll, Kind.two) != 0 && calculateSameKindScore(roll, Kind.three) != 0 ? Arrays.stream(roll).sum() : 0;
    }
}
