package yatzy.sameOfAKindCategories;

import org.junit.Test;
import yatzy.Category;

import static org.junit.Assert.*;

public class FourOfAKindTest {

    @Test
    public void getScore_whenSameSideFourTimes() {
        //GIVEN
        Category category = new FourOfAKind();
        int[] roll = new int[]{3,3,3,3,5};
        //WHEN
        int actual = category.getScore(roll);
        //THEN
        assertEquals(12, actual);
    }

    @Test
    public void getScore_whenNotSameSideFourTimes() {
        //GIVEN
        Category category = new FourOfAKind();
        int[] roll = new int[]{3,3,3,5,5};
        //WHEN
        int actual = category.getScore(roll);
        //THEN
        assertEquals(0, actual);
    }

}