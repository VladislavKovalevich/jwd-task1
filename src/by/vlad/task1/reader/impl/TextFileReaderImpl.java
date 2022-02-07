package by.vlad.task1.reader.impl;

import by.vlad.task1.exceptions.ReaderException;
import by.vlad.task1.reader.TextFileReader;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;

public class TextFileReaderImpl implements TextFileReader {
    final static Logger logger = LogManager.getLogger();

    @Override
    public String readArrayFromFile(String filePath) throws ReaderException{
        StringBuilder strings = new StringBuilder();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(filePath)))){
            String line;

            line = bufferedReader.readLine();

            while (line != null) {
                strings.append(line);
                line = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e){
            logger.log(Level.ERROR, "File "+ filePath + " was not found", e);
            throw new ReaderException("File "+ filePath + " was not found");
        } catch (IOException e) {
            logger.log(Level.ERROR, "Failed Input/Output operations while working with file "+ filePath, e);
            throw new ReaderException("Failed Input/Output operations while working with file "+ filePath);
        }

        logger.log(Level.INFO, "Содержимое файла: "+ strings);

        return strings.toString();
    }
}
