package by.vlad.task1.main;

import by.vlad.task1.exception.ReaderException;
import by.vlad.task1.reader.TextFileReader;
import by.vlad.task1.reader.impl.TextFileReaderImpl;

public class ArrayTaskMain {
    public static void main(String[] args) {
        String filePath = "resource\\array.txt";
        TextFileReader fileReader = new TextFileReaderImpl();

        try {
            fileReader.readArrayFromFile(filePath);
        } catch (ReaderException e) {
            e.printStackTrace();
        }
        /*StringParser stringParser = new StringParserImpl();
        Creator creator = new CreatorImpl();

        List<Integer> integerList = null;
        try {
            integerList = stringParser.parseArray(fileReader.readArrayFromFile(filePath));
        } catch (ParserException | ReaderException e) {
            e.printStackTrace();
        }

        CustomArray customArray = creator.createArrayFromFile(integerList);

        CustomArrayMath arrayOperation = new CustomArrayMathImpl();
        CustomArraySort arraySort = new CustomArraySortImpl();

        System.out.println(arrayOperation.countOfNegative(customArray));
        arraySort.insertionSort(customArray);
*/
    }
}
