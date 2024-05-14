package TC_Pages;

import TC_Pages.TC_SignUp.TC_SignUpPage;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Tests {
    @Test
    public void teest() throws IOException, ParseException {
        new TC_SignUpPage().createAccountWithValidData();
    }

}
