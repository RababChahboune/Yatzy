package yatzy.sameSidedRollCategories;

import org.junit.Test;
import yatzy.Category;

import static org.junit.Assert.*;

public class SixesTest {

    @Test
    public void getScore_whenSomeSidesAreSixes() {
        //GIVEN
        Category category = new Sixes();
        int[] roll = new int[]{6,5,6,6,5};
        //WHEN
        int actual = category.getScore(roll);
        //THEN
        assertEquals(18, actual);
    }

    @Test
    public void getScore_whenNoSidesAreSixes() {
        //GIVEN
        Category category = new Sixes();
        int[] roll = new int[]{4,4,4,5,5};
        //WHEN
        int actual = category.getScore(roll);
        //THEN
        assertEquals(0, actual);
    }

}