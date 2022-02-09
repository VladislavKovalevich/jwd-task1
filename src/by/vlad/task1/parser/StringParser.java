package by.vlad.task1.parser;

import by.vlad.task1.exception.ParserException;

import java.util.List;

public interface StringParser {
    List<Integer> parseArray(List<String> stringArray) throws ParserException;
}
