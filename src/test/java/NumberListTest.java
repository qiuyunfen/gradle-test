import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class NumberListTest {
    @Test
    public void testOddMethod() {
        NumberList numberList = new NumberList();
        List<Integer> numberlist = new ArrayList<Integer>();
        for(int i = 1; i <= 10; i++) numberlist.add(i);
        List<Integer> oddList = new ArrayList<Integer>();
        for(int i = 1; i <= 10; i+=2) oddList.add(i);
        assertEquals("oddMethod should return oddList", oddList, numberList.Odd(numberlist));
    }
}
