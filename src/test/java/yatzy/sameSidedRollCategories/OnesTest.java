package yatzy.sameSidedRollCategories;

import org.junit.Test;
import yatzy.Category;

import static org.junit.Assert.*;

public class OnesTest {

    @Test
    public void getScore_whenSomeSidesAreOnes() {
        //GIVEN
        Category category = new Ones();
        int[] roll = new int[]{1,2,1,4,5};
        //WHEN
        int actual = category.getScore(roll);
        //THEN
        assertEquals(2, actual);
    }

    @Test
    public void getScore_whenNoSidesAreOnes() {
        //GIVEN
        Category category = new Ones();
        int[] roll = new int[]{6,2,2,4,5};
        //WHEN
        int actual = category.getScore(roll);
        //THEN
        assertEquals(0, actual);
    }

}