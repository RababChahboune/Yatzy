package yatzy.sameSidedRollCategories;

import org.junit.Test;
import yatzy.Category;

import static org.junit.Assert.*;

public class FivesTest {

    @Test
    public void getScore_whenSomeSidesAreFive() {
        //GIVEN
        Category category = new Fives();
        int[] roll = new int[]{4,4,4,5,5};
        //WHEN
        int actual = category.getScore(roll);
        //THEN
        assertEquals(10, actual);
    }

    @Test
    public void getScore_whenNoSidesAreFive() {
        //GIVEN
        Category category = new Fives();
        int[] roll = new int[]{4,4,4,3,2};
        //WHEN
        int actual = category.getScore(roll);
        //THEN
        assertEquals(0, actual);
    }

}