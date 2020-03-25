import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class calculatorTest {
    //can't test user input
    Calculator cal = new Calculator();


    @Test
    public void testAdding(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        Assert.assertEquals(java.util.Optional.ofNullable(cal.add(1, list)), Optional.of(6));
    }

    @Test
    public void testMultiply(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(2);
        list.add(3);

        Assert.assertEquals(java.util.Optional.ofNullable(cal.multiply(1, list)), Optional.of(12));
    }
}
