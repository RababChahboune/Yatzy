package yatzy.sameSidedRollCategories;

import org.junit.Test;
import yatzy.Category;

import static org.junit.Assert.*;

public class ThreesTest {

    @Test
    public void getScore_whenSomeSidesAreThrees() {
        //GIVEN
        Category category = new Threes();
        int[] roll = new int[]{1,2,3,2,3};
        //WHEN
        int actual = category.getScore(roll);
        //THEN
        assertEquals(6, actual);
    }

    @Test
    public void getScore_whenNoSidesAreThrees() {
        //GIVEN
        Category category = new Threes();
        int[] roll = new int[]{4,4,4,5,5};
        //WHEN
        int actual = category.getScore(roll);
        //THEN
        assertEquals(0, actual);
    }

}