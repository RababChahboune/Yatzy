package yatzy.sameSidedRollCategories;

import org.junit.Test;
import yatzy.Category;

import static org.junit.Assert.*;

public class FoursTest {

    @Test
    public void getScore_whenSomeSidesAreFours() {
        //GIVEN
        Category category = new Fours();
        int[] roll = new int[]{4,4,4,5,5};
        //WHEN
        int actual = category.getScore(roll);
        //THEN
        assertEquals(12, actual);
    }

    @Test
    public void getScore_whenNoSidesAreFours() {
        //GIVEN
        Category category = new Fours();
        int[] roll = new int[]{1,5,6,3,2};
        //WHEN
        int actual = category.getScore(roll);
        //THEN
        assertEquals(0, actual);
    }

}