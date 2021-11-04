import org.junit.*;
import org.mockito.Mockito;
import yatzy.Category;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


public class YatzyTest {

    @Test
    public void smallStraight() {
        //GIVEN
        Category category = mock(Category.class);
        int[] roll = new int[]{1,2,3,4,5};
        doReturn(0).when(category).getScore(roll);
        //WHEN
        int actual = new Yatzy(1,2,3,4,5, category).calculateScore();
        //THEN
        assertEquals(0, actual);
        Mockito.verify(category,Mockito.times(1)).getScore(roll);
    }

}
