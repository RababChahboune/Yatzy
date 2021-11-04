import yatzy.Category;

public class Yatzy {

    public int[] roll;
    public Category category;

    public Yatzy(int d1, int d2, int d3, int d4, int d5, Category category) {
        roll = new int[5];
        roll[0] = d1;
        roll[1] = d2;
        roll[2] = d3;
        roll[3] = d4;
        roll[4] = d5;
        this.category = category;
    }

    public int calculateScore(){
        return category.getScore(roll);
    }
}
