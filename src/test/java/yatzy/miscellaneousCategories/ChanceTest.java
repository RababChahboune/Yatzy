package yatzy.miscellaneousCategories;

import org.junit.Test;
import yatzy.Category;

import static org.junit.Assert.*;

public class ChanceTest {
    @Test
    public void getScore() {
        //GIVEN
        Category category = new Chance();
        int[] roll = new int[]{2,3,4,5,1};
        //WHEN
        int actual = category.getScore(roll);
        //THEN
        assertEquals(15, actual);
    }
}