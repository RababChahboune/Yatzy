package yatzy.straightRollCategories;

import org.junit.Test;
import yatzy.Category;

import static org.junit.Assert.*;

public class LargeStraightTest {

    @Test
    public void getScore_whenAllSidesBetweenTwoAndSixes() {
        //GIVEN
        Category category = new LargeStraight();
        int[] roll = new int[]{6,2,3,4,5};
        //WHEN
        int actual = category.getScore(roll);
        //THEN
        assertEquals(20, actual);
    }

    @Test
    public void getScore_whenNotAllSidesBetweenTwoAndSixes() {
        //GIVEN
        Category category = new LargeStraight();
        int[] roll = new int[]{1,2,2,4,5};
        //WHEN
        int actual = category.getScore(roll);
        //THEN
        assertEquals(0, actual);
    }

}