package by.vlad.task1.main;

import by.vlad.task1.creator.Creator;
import by.vlad.task1.creator.impl.CreatorImpl;
import by.vlad.task1.entity.CustomArray;
import by.vlad.task1.exception.ParserException;
import by.vlad.task1.exception.ReaderException;
import by.vlad.task1.parser.StringParser;
import by.vlad.task1.parser.impl.StringParserImpl;
import by.vlad.task1.reader.TextFileReader;
import by.vlad.task1.reader.impl.TextFileReaderImpl;
import by.vlad.task1.service.ArrayOperation;
import by.vlad.task1.service.ArraySort;
import by.vlad.task1.service.impl.ArrayOperationImpl;
import by.vlad.task1.service.impl.ArraySortImpl;

import java.util.List;

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

        ArrayOperation arrayOperation = new ArrayOperationImpl();
        ArraySort arraySort = new ArraySortImpl();

        System.out.println(arrayOperation.getCountOfNegativeNumbers(customArray));
        arraySort.insertionSort(customArray);
*/
    }
}
