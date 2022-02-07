package by.vlad.task1.parser;

import by.vlad.task1.exceptions.ParserException;

import java.util.List;

public interface StringParser {
    List<Integer> parseArray(String stringArray) throws ParserException;
}
