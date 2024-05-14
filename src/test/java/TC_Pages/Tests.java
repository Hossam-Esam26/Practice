package TC_Pages;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {
    @Test
    public void teest(){
        System.out.println("teest");
    }

    @Test
    public void test(){
        System.out.println("teest");
    }

    @Test
    public void teestt(){
        System.out.println("teest");
        Assert.fail("This is an issue");
    }
}
