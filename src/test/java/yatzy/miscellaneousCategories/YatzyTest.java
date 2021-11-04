package yatzy.miscellaneousCategories;

import org.junit.Test;
import yatzy.Category;

import static org.junit.Assert.*;

public class YatzyTest {

    @Test
    public void getScore_WhenSameSidedDice() {
        //GIVEN
        Category category = new Yatzy();
        int[] roll = new int[]{4,4,4,4,4};
        //WHEN
        int actual = category.getScore(roll);
        //THEN
        assertEquals(50, actual);
    }

    @Test
    public void getScore_WhenNotSameSidedDice() {
        //GIVEN
        Category category = new Yatzy();
        int[] roll = new int[]{6,6,6,6,3};
        //WHEN
        int actual = category.getScore(roll);
        //THEN
        assertEquals(0, actual);
    }


}