package yatzy.sameSidedRollCategories;

import yatzy.Category;

public abstract class SameSidedRoll implements Category {
    protected int calculateSameSidedScore(int[] roll, int side){
        int total = 0;
        for(int i = 0 ; i < roll.length ; i++){
            if( roll[i] == side ){
                total += roll[i];
            }
        }
        return total;
    }
}
