package by.vlad.task1.service;

import by.vlad.task1.entity.CustomArray;

public interface ArrayOperations {
    int getMinNumber(CustomArray customArray);
    int getMaxNumber(CustomArray customArray);
    void changeArrayContent(CustomArray customArray);
    double getAverageValue(CustomArray customArray);
    int getSum(CustomArray customArray);
    long getCountOfPositiveNumbers(CustomArray customArray);
    long getCountOfNegativeNumbers(CustomArray customArray);
}
