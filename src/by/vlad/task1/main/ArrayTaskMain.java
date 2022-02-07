package by.vlad.task1.main;

import by.vlad.task1.creator.Creator;
import by.vlad.task1.creator.impl.CreatorImpl;
import by.vlad.task1.entity.CustomArray;
import by.vlad.task1.exceptions.ParserException;
import by.vlad.task1.exceptions.ReaderException;
import by.vlad.task1.parser.StringParser;
import by.vlad.task1.parser.impl.StringParserImpl;
import by.vlad.task1.reader.TextFileReader;
import by.vlad.task1.reader.impl.TextFileReaderImpl;
import by.vlad.task1.service.ArrayOperations;
import by.vlad.task1.service.ArraySorts;
import by.vlad.task1.service.impl.ArrayOperationsImpl;
import by.vlad.task1.service.impl.ArraySortsImpl;

import java.util.List;

public class ArrayTaskMain {
    public static void main(String[] args) {
        String filePath = "resource\\array.txt";
        TextFileReader fileReader = new TextFileReaderImpl();
        StringParser stringParser = new StringParserImpl();
        Creator creator = new CreatorImpl();

        List<Integer> integerList = null;
        try {
            integerList = stringParser.parseArray(fileReader.readArrayFromFile(filePath));
        } catch (ParserException | ReaderException e) {
            e.printStackTrace();
        }

        CustomArray customArray = creator.createArrayFromFile(integerList);

        ArrayOperations arrayOperations = new ArrayOperationsImpl();
        ArraySorts arraySorts = new ArraySortsImpl();

        System.out.println(arrayOperations.getCountOfNegativeNumbers(customArray));
        arraySorts.selectionSort(customArray);

    }
}
