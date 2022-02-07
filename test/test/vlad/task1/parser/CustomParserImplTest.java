package test.vlad.task1.parser;

import by.vlad.task1.exceptions.ParserException;
import by.vlad.task1.parser.StringParser;
import by.vlad.task1.parser.impl.StringParserImpl;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Arrays;
import java.util.List;

public class CustomParserImplTest {
    private StringParser stringParser;

    @BeforeMethod
    public void setUp(){
        stringParser = new StringParserImpl();
    }

    @DataProvider(name = "parseString")
    public static Object[][] dataCreate(){
        return new Object[][]{{"-1, 02, 5, 2 , -6, - 6", Arrays.asList(-1, 5, 2, -6)} };
    }

    @Test(dataProvider = "parseString")
    public void testReadArrayFromFile(String testString, List<Integer> expected) throws ParserException {
        List<Integer> actual = stringParser.parseArray(testString);
        Assert.assertEquals(actual, expected);
    }

    @AfterMethod
    public void tierDown(){
        stringParser = null;
    }
}