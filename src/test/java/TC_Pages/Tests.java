package TC_Pages;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {
    @Test
    public void teest(){
        System.out.println("teest");
    }

    @Test
    public void teest1(){
        System.out.println("teest");
    }

    @Test
    public void teest2(){
        System.out.println("teest");
        Assert.fail();
    }
}
