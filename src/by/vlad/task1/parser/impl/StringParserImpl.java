package by.vlad.task1.parser.impl;

import by.vlad.task1.parser.StringParser;
import by.vlad.task1.validator.impl.CustomValidatorImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class StringParserImpl implements StringParser {
    private static final Logger logger = LogManager.getLogger();
    private static final String DELIMITER = ",";

    public List<Integer> parseArray(List<String> stringArray) {
        List<Integer> arrayList = new ArrayList<>();
        CustomValidatorImpl stringValidator = CustomValidatorImpl.getInstance();

        String curr;
        for (String array : stringArray) {
            for (String number : array.split(DELIMITER)) {
                if (stringValidator.validateString(number)) {
                    curr = number.trim();
                    logger.log(Level.INFO, "valid number: " + curr);
                    int currNumber = Integer.parseInt(curr);
                    arrayList.add(currNumber);
                } else {
                    logger.log(Level.INFO, "invalid number: " + number.trim());
                }
            }
        }

        if (arrayList.size() == 0){
            logger.log(Level.WARN, "list is empty");
           // throw new ParserException("list is empty");
        }

        return arrayList;
    }
}
