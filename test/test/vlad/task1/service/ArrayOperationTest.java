package test.vlad.task1.service;

import by.vlad.task1.entity.CustomArray;
import by.vlad.task1.exceptions.ParserException;
import by.vlad.task1.exceptions.ReaderException;
import by.vlad.task1.parser.StringParser;
import by.vlad.task1.parser.impl.StringParserImpl;
import by.vlad.task1.reader.TextFileReader;
import by.vlad.task1.reader.impl.TextFileReaderImpl;
import by.vlad.task1.service.ArrayOperations;
import by.vlad.task1.service.impl.ArrayOperationsImpl;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Arrays;
import java.util.List;

public class ArrayOperationTest {
    private CustomArray customArray;
    private List<Integer> numberList;
    private ArrayOperations arrayOperations;

    @BeforeClass
    public void init() throws ReaderException, ParserException {
        TextFileReader textFileReader = new TextFileReaderImpl();
        StringParser stringParser = new StringParserImpl();
        arrayOperations = new ArrayOperationsImpl();

        String fileData = textFileReader.readArrayFromFile("resource\\array.txt");
        numberList = stringParser.parseArray(fileData);
    }

    @BeforeMethod
    public void initTestMethod(){
        customArray = new CustomArray(numberList);
    }

    @Test
    public void testSumOperation(){
        int expectedSum = 0;
        int actualSum = arrayOperations.getSum(customArray);
        Assert.assertEquals(actualSum, expectedSum);
    }

    @Test
    public void testAverageValue(){
        double expectedAverageValue = 0.0;
        double actualAverageValue = arrayOperations.getAverageValue(customArray);
        Assert.assertEquals(actualAverageValue, expectedAverageValue);
    }

    @Test
    public void testMinNumber(){
        int expectedMinNumber = -6;
        int actualMinNumber = arrayOperations.getMinNumber(customArray);
        Assert.assertEquals(actualMinNumber, expectedMinNumber);
    }

    @Test
    public void testMaxNumber(){
        int expectedMaxNumber = 5;
        int actualMaxNumber = arrayOperations.getMaxNumber(customArray);
        Assert.assertEquals(actualMaxNumber, expectedMaxNumber);
    }

    @Test
    public void testCountOfPositiveNumbers(){
        long expected = 2;
        long actual = arrayOperations.getCountOfPositiveNumbers(customArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testCountOfNegativeNumbers(){
        long expected = 2;
        long actual = arrayOperations.getCountOfNegativeNumbers(customArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testChangeArrayContent(){
        CustomArray expected = new CustomArray(Arrays.asList(0, 5, 2, 0));
        arrayOperations.changeArrayContent(customArray);
        Assert.assertEquals(customArray.getArray(), expected.getArray());
    }


    @Test
    public void testSumStream(){
        int expectedSum = 0;
        int actualSum = arrayOperations.getSumStream(customArray);
        Assert.assertEquals(actualSum, expectedSum);
    }

    @Test
    public void testAverageValueStream(){
        double expectedAverageValue = 0.0;
        double actualAverageValue = arrayOperations.getAverageValueStream(customArray);
        Assert.assertEquals(actualAverageValue, expectedAverageValue);
    }

    @Test
    public void testMinNumberStream(){
        int expectedMinNumber = -6;
        int actualMinNumber = arrayOperations.getMinNumberStream(customArray);
        Assert.assertEquals(actualMinNumber, expectedMinNumber);
    }

    @Test
    public void testMaxNumberStream(){
        int expectedMaxNumber = 5;
        int actualMaxNumber = arrayOperations.getMaxNumberStream(customArray);
        Assert.assertEquals(actualMaxNumber, expectedMaxNumber);
    }

    @Test
    public void testCountOfPositiveNumbersStream(){
        long expected = 2;
        long actual = arrayOperations.getCountOfPositiveNumbersStream(customArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testCountOfNegativeNumbersStream(){
        long expected = 2;
        long actual = arrayOperations.getCountOfNegativeNumbersStream(customArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testChangeArrayContentStream(){
        CustomArray expected = new CustomArray(Arrays.asList(0, 5, 2, 0));
        arrayOperations.changeArrayContentStream(customArray);
        Assert.assertEquals(customArray.getArray(), expected.getArray());
    }
}
