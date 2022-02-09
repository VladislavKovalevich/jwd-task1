package test.vlad.task1.service;

import by.vlad.task1.creator.Creator;
import by.vlad.task1.creator.impl.CreatorImpl;
import by.vlad.task1.entity.CustomArray;
import by.vlad.task1.exceptions.ParserException;
import by.vlad.task1.exceptions.ReaderException;
import by.vlad.task1.parser.StringParser;
import by.vlad.task1.parser.impl.StringParserImpl;
import by.vlad.task1.reader.TextFileReader;
import by.vlad.task1.reader.impl.TextFileReaderImpl;
import by.vlad.task1.service.ArraySorts;
import by.vlad.task1.service.impl.ArraySortsImpl;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

public class ArraySortsTest {
    private CustomArray customArray;
    private ArraySorts arraySorts;
    private List<Integer> numberList;

    @BeforeClass
    public void init() throws ReaderException, ParserException {
        TextFileReader textFileReader = new TextFileReaderImpl();
        StringParser stringParser = new StringParserImpl();
        arraySorts = new ArraySortsImpl();

        String fileData = textFileReader.readArrayFromFile("resource\\array.txt");
        numberList = stringParser.parseArray(fileData);
    }

    @BeforeMethod
    public void initTestMethod(){
        customArray = new CustomArray(numberList);
    }


    @Test
    public void testSelectionSort(){
        arraySorts.selectionSort(customArray);
        int[] expected = new int[]{-6, -1, 2, 5};
        Assert.assertEquals(customArray.getArray(), expected);
    }

    @Test
    public void testBubbleSort(){
        arraySorts.bubbleSort(customArray);
        int[] expected = new int[]{-6, -1, 2, 5};
        Assert.assertEquals(customArray.getArray(), expected);
    }

    @Test
    public void testInsertionSort(){
        arraySorts.insertionSort(customArray);
        int[] expected = new int[]{-6, -1, 2, 5};
        Assert.assertEquals(customArray.getArray(), expected);
    }

    @Test
    public void testStreamSort(){
        arraySorts.streamSort(customArray);
        int[] expected = new int[]{-6, -1, 2, 5};
        Assert.assertEquals(customArray.getArray(), expected);
    }
}
