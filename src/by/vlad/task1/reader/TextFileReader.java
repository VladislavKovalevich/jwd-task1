package by.vlad.task1.reader;

import by.vlad.task1.exceptions.ReaderException;

public interface TextFileReader {
    String readArrayFromFile(String filePath) throws ReaderException;
}
