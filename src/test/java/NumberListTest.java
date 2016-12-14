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
    @Test
    public void testEvenMethod() {
        NumberList numberList = new NumberList();
        List<Integer> numberlist = new ArrayList<Integer>();
        for(int i = 1; i <= 10; i++) numberlist.add(i);
        List<Integer> evenList = new ArrayList<Integer>();
        for(int i = 2; i <= 10; i+=2) evenList.add(i);
        assertEquals("oddMethod should return oddList", evenList, numberList.Even(numberlist));
    }
}
