package yatzy.sameOfAKindCategories;

import org.junit.Test;
import yatzy.Category;

import static org.junit.Assert.*;

public class FullHouseTest {

    @Test
    public void getScore_whenOnePairAndOneTriple() {
        //GIVEN
        Category category = new FullHouse();
        int[] roll = new int[]{6,2,2,2,6};
        //WHEN
        int actual = category.getScore(roll);
        //THEN
        assertEquals(18, actual);
    }

    @Test
    public void getScore_whenNotPairAndTriple() {
        //GIVEN
        Category category = new FullHouse();
        int[] roll = new int[]{2,3,4,5,6};
        //WHEN
        int actual = category.getScore(roll);
        //THEN
        assertEquals(0, actual);
    }

}