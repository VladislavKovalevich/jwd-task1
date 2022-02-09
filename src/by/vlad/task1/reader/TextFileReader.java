package by.vlad.task1.reader;

import by.vlad.task1.exception.ReaderException;

import java.util.List;

public interface TextFileReader {
    List<String> readArrayFromFile(String filePath) throws ReaderException;
}
