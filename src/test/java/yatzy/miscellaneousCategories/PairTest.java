package yatzy.miscellaneousCategories;

import org.junit.Test;
import yatzy.Category;

import static org.junit.Assert.*;

public class PairTest {

    @Test
    public void getScore_WhenSameSideTwice() {
        //GIVEN
        Category category = new Pair();
        int[] roll = new int[]{3,4,3,5,6};
        //WHEN
        int actual = category.getScore(roll);
        //THEN
        assertEquals(6, actual);
    }

    @Test
    public void getScore_WhenSameSideMoreThanTwice() {
        //GIVEN
        Category category = new Pair();
        int[] roll = new int[]{5,3,3,3,5};
        //WHEN
        int actual = category.getScore(roll);
        //THEN
        assertEquals(10, actual);
    }

    @Test
    public void getScore_WhenTwoPairs() {
        //GIVEN
        Category category = new Pair();
        int[] roll = new int[]{5,5,1,1,2};
        //WHEN
        int actual = category.getScore(roll);
        //THEN
        assertEquals(10, actual);
    }

    @Test
    public void getScore_WhenNoSimilarSides() {
        //GIVEN
        Category category = new Pair();
        int[] roll = new int[]{1,2,3,4,5};
        //WHEN
        int actual = category.getScore(roll);
        //THEN
        assertEquals(0, actual);
    }

}