package by.vlad.task1.service;

import by.vlad.task1.entity.CustomArray;

public interface ArrayOperations {
    int getMinNumber(CustomArray customArray);
    int getMinNumberStream(CustomArray customArray);
    int getMaxNumber(CustomArray customArray);
    int getMaxNumberStream(CustomArray customArray);
    void changeArrayContent(CustomArray customArray);
    void changeArrayContentStream(CustomArray customArray);
    double getAverageValue(CustomArray customArray);
    double getAverageValueStream(CustomArray customArray);
    int getSum(CustomArray customArray);
    int getSumStream(CustomArray customArray);
    long getCountOfPositiveNumbers(CustomArray customArray);
    long getCountOfPositiveNumbersStream(CustomArray customArray);
    long getCountOfNegativeNumbers(CustomArray customArray);
    long getCountOfNegativeNumbersStream(CustomArray customArray);
}