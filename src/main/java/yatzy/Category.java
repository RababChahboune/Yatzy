package yatzy;

public interface Category {
    int getScore(int[] roll);

    default  int[] getSidesCount(int[] roll){
        int[] sides = new int[6];
        for(int i = 0; i < roll.length; i++){
            sides[roll[i] - 1] += 1;
        }
        return sides;
    }
}
