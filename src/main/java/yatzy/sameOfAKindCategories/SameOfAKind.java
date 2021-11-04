package yatzy.sameOfAKindCategories;

import yatzy.Category;

public abstract class SameOfAKind implements Category {
    protected int calculateSameKindScore(int[] roll, Kind kind){
        int[] sides = getSidesCount(roll);
        for (int i = 0; i < 6; i++){
            if (sides[i] >= kind.kind){
                return (i + 1) * kind.kind;
            }
        }
        return 0;
    }

    protected enum Kind {
        two(2),
        three(3),
        four(4);
        final int kind;
        Kind(int kind) {
            this.kind = kind;
        }
    }
}
