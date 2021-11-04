package yatzy.sameSidedRollCategories;

import org.junit.Test;
import yatzy.Category;

import static org.junit.Assert.*;

public class TwosTest {

    @Test
    public void getScore_whenSomeSidesAreTwos() {
        //GIVEN
        Category category = new Twos();
        int[] roll = new int[]{1,2,3,2,6};
        //WHEN
        int actual = category.getScore(roll);
        //THEN
        assertEquals(4, actual);
    }

    @Test
    public void getScore_whenNoSidesAreTwos() {
        //GIVEN
        Category category = new Twos();
        int[] roll = new int[]{4,4,4,5,5};
        //WHEN
        int actual = category.getScore(roll);
        //THEN
        assertEquals(0, actual);
    }

}