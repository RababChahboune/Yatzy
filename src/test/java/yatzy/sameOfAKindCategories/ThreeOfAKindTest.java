package yatzy.sameOfAKindCategories;

import org.junit.Test;
import yatzy.Category;

import static org.junit.Assert.*;

public class ThreeOfAKindTest {

    @Test
    public void getScore_whenSameSideThrice() {
        //GIVEN
        Category category = new ThreeOfAKind();
        int[] roll = new int[]{3,3,3,4,5};
        //WHEN
        int actual = category.getScore(roll);
        //THEN
        assertEquals(9, actual);
    }

    @Test
    public void getScore_whenSameSideMoreThanThrice() {
        //GIVEN
        Category category = new ThreeOfAKind();
        int[] roll = new int[]{3,3,3,3,5};
        //WHEN
        int actual = category.getScore(roll);
        //THEN
        assertEquals(9, actual);
    }

    @Test
    public void getScore_WhenNoSimilarSides() {
        //GIVEN
        Category category = new ThreeOfAKind();
        int[] roll = new int[]{1,2,3,4,5};
        //WHEN
        int actual = category.getScore(roll);
        //THEN
        assertEquals(0, actual);
    }

}