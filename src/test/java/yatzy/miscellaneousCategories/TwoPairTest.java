package yatzy.miscellaneousCategories;

import org.junit.Test;
import yatzy.Category;

import static org.junit.Assert.*;

public class TwoPairTest {
    @Test
    public void getScore_WhenSameSideDiceTwice() {
        //GIVEN
        Category category = new TwoPair();
        int[] roll = new int[]{1,1,2,2,2};
        //WHEN
        int actual = category.getScore(roll);
        //THEN
        assertEquals(6, actual);
    }

    @Test
    public void getScore_WhenOnePair() {
        //GIVEN
        Category category = new TwoPair();
        int[] roll = new int[]{1,1,3,4,5};
        //WHEN
        int actual = category.getScore(roll);
        //THEN
        assertEquals(0, actual);
    }
}