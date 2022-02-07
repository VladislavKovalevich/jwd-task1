package by.vlad.task1.parser.impl;

import by.vlad.task1.exceptions.ParserException;
import by.vlad.task1.parser.StringParser;
import by.vlad.task1.validation.impl.CustomValidatorImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class StringParserImpl implements StringParser {
    final static Logger logger = LogManager.getLogger();

    public List<Integer> parseArray(String stringArray) throws ParserException {
        List<Integer> arrayList = new ArrayList<>();
        CustomValidatorImpl stringValidator = CustomValidatorImpl.getInstance();

        for (String number : stringArray.split(",")) {
            if (stringValidator.validateString(number)) {
                logger.log(Level.INFO, "valid number: "+ number.trim());
                arrayList.add(Integer.parseInt(number.trim()));//исправить
            }else{
                logger.log(Level.INFO, "invalid number: "+ number.trim());
            }
        }

        if (arrayList.size() == 0){
            logger.log(Level.ERROR, "string list is empty");
            throw new ParserException("string list is empty");
        }

        return arrayList;
    }
}
