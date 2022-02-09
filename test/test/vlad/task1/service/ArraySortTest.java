package test.vlad.task1.service;

import by.vlad.task1.entity.CustomArray;
import by.vlad.task1.exception.ParserException;
import by.vlad.task1.exception.ReaderException;
import by.vlad.task1.parser.StringParser;
import by.vlad.task1.parser.impl.StringParserImpl;
import by.vlad.task1.reader.TextFileReader;
import by.vlad.task1.reader.impl.TextFileReaderImpl;
import by.vlad.task1.service.ArraySort;
import by.vlad.task1.service.impl.ArraySortImpl;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

public class ArraySortTest {
    private CustomArray customArray;
    private ArraySort arraySort;
    private List<Integer> numberList;

    @BeforeClass
    public void init() throws ReaderException, ParserException {
        TextFileReader textFileReader = new TextFileReaderImpl();
        StringParser stringParser = new StringParserImpl();
        arraySort = new ArraySortImpl();

        List<String> fileData = textFileReader.readArrayFromFile("resource\\array.txt");
        numberList = stringParser.parseArray(fileData);
    }

    @BeforeMethod
    public void initTestMethod(){
        customArray = new CustomArray(numberList);
    }


    @Test
    public void testSelectionSort(){
        arraySort.selectionSort(customArray);
        int[] expected = new int[]{-6, -1, 2, 5};
        Assert.assertEquals(customArray.getArray(), expected);
    }

    @Test
    public void testBubbleSort(){
        arraySort.bubbleSort(customArray);
        int[] expected = new int[]{-6, -1, 2, 5};
        Assert.assertEquals(customArray.getArray(), expected);
    }

    @Test
    public void testInsertionSort(){
        arraySort.insertionSort(customArray);
        int[] expected = new int[]{-6, -1, 2, 5};
        Assert.assertEquals(customArray.getArray(), expected);
    }

    @Test
    public void testStreamSort(){
        arraySort.streamSort(customArray);
        int[] expected = new int[]{-6, -1, 2, 5};
        Assert.assertEquals(customArray.getArray(), expected);
    }
}
