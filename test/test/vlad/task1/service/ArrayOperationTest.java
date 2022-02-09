package test.vlad.task1.service;

import by.vlad.task1.entity.CustomArray;
import by.vlad.task1.exception.ParserException;
import by.vlad.task1.exception.ReaderException;
import by.vlad.task1.parser.StringParser;
import by.vlad.task1.parser.impl.StringParserImpl;
import by.vlad.task1.reader.TextFileReader;
import by.vlad.task1.reader.impl.TextFileReaderImpl;
import by.vlad.task1.service.ArrayOperation;
import by.vlad.task1.service.impl.ArrayOperationImpl;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Arrays;
import java.util.List;

public class ArrayOperationTest {
    private CustomArray customArray;
    private List<Integer> numberList;
    private ArrayOperation arrayOperation;

    @BeforeClass
    public void init() throws ReaderException, ParserException {
        TextFileReader textFileReader = new TextFileReaderImpl();
        StringParser stringParser = new StringParserImpl();
        arrayOperation = new ArrayOperationImpl();

        List<String> fileData = textFileReader.readArrayFromFile("resource\\array.txt");
        numberList = stringParser.parseArray(fileData);
    }

    @BeforeMethod
    public void initTestMethod(){
        customArray = new CustomArray(numberList);
    }

    @Test
    public void testSumOperation(){
        int expectedSum = 0;
        int actualSum = arrayOperation.getSum(customArray);
        Assert.assertEquals(actualSum, expectedSum);
    }

    @Test
    public void testAverageValue(){
        double expectedAverageValue = 0.0;
        double actualAverageValue = arrayOperation.getAverageValue(customArray);
        Assert.assertEquals(actualAverageValue, expectedAverageValue);
    }

    @Test
    public void testMinNumber(){
        int expectedMinNumber = -6;
        int actualMinNumber = arrayOperation.getMinNumber(customArray);
        Assert.assertEquals(actualMinNumber, expectedMinNumber);
    }

    @Test
    public void testMaxNumber(){
        int expectedMaxNumber = 5;
        int actualMaxNumber = arrayOperation.getMaxNumber(customArray);
        Assert.assertEquals(actualMaxNumber, expectedMaxNumber);
    }

    @Test
    public void testCountOfPositiveNumbers(){
        long expected = 2;
        long actual = arrayOperation.getCountOfPositiveNumbers(customArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testCountOfNegativeNumbers(){
        long expected = 2;
        long actual = arrayOperation.getCountOfNegativeNumbers(customArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testChangeArrayContent(){
        CustomArray expected = new CustomArray(Arrays.asList(0, 5, 2, 0));
        arrayOperation.changeArrayContent(customArray);
        Assert.assertEquals(customArray.getArray(), expected.getArray());
    }


    @Test
    public void testSumStream(){
        int expectedSum = 0;
        int actualSum = arrayOperation.getSumStream(customArray);
        Assert.assertEquals(actualSum, expectedSum);
    }

    @Test
    public void testAverageValueStream(){
        double expectedAverageValue = 0.0;
        double actualAverageValue = arrayOperation.getAverageValueStream(customArray);
        Assert.assertEquals(actualAverageValue, expectedAverageValue);
    }

    @Test
    public void testMinNumberStream(){
        int expectedMinNumber = -6;
        int actualMinNumber = arrayOperation.getMinNumberStream(customArray);
        Assert.assertEquals(actualMinNumber, expectedMinNumber);
    }

    @Test
    public void testMaxNumberStream(){
        int expectedMaxNumber = 5;
        int actualMaxNumber = arrayOperation.getMaxNumberStream(customArray);
        Assert.assertEquals(actualMaxNumber, expectedMaxNumber);
    }

    @Test
    public void testCountOfPositiveNumbersStream(){
        long expected = 2;
        long actual = arrayOperation.getCountOfPositiveNumbersStream(customArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testCountOfNegativeNumbersStream(){
        long expected = 2;
        long actual = arrayOperation.getCountOfNegativeNumbersStream(customArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testChangeArrayContentStream(){
        CustomArray expected = new CustomArray(Arrays.asList(0, 5, 2, 0));
        arrayOperation.changeArrayContentStream(customArray);
        Assert.assertEquals(customArray.getArray(), expected.getArray());
    }
}
