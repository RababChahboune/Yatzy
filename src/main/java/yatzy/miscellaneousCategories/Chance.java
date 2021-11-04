package yatzy.miscellaneousCategories;

import yatzy.Category;

import java.util.Arrays;

public class Chance implements Category {
    @Override
    public int getScore(int[] roll) {
        return Arrays.stream(roll).sum();
    }
}
