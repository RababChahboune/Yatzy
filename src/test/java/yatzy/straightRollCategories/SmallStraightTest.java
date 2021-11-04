package yatzy.straightRollCategories;

import org.junit.Test;
import yatzy.Category;

import static org.junit.Assert.*;

public class SmallStraightTest {

    @Test
    public void getScore_whenAllSidesBetweenOneAndFive() {
        //GIVEN
        Category category = new SmallStraight();
        int[] roll = new int[]{1,2,3,4,5};
        //WHEN
        int actual = category.getScore(roll);
        //THEN
        assertEquals(15, actual);
    }

    @Test
    public void getScore_whenNotAllSidesBetweenOneAndFive() {
        //GIVEN
        Category category = new SmallStraight();
        int[] roll = new int[]{1,2,2,4,5};
        //WHEN
        int actual = category.getScore(roll);
        //THEN
        assertEquals(0, actual);
    }

}