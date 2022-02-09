package by.vlad.task1.service.impl;

import by.vlad.task1.entity.CustomArray;
import by.vlad.task1.service.ArrayOperation;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ArrayOperationImpl implements ArrayOperation {
    private static final Logger logger = LogManager.getLogger();

    @Override
    public int getMinNumber(CustomArray customArray) {
        int minValue = Integer.MAX_VALUE;

        for (int i: customArray.getArray()){
            if (i < minValue){
                minValue = i;
            }
        }

        logger.log(Level.INFO, "min = " + minValue);
        return minValue;
    }

    @Override
    public int getMinNumberStream(CustomArray customArray) {
        int[] array = customArray.getArray();
        int min = Arrays.stream(array).min().getAsInt();
        logger.log(Level.INFO, "min (stream) = " + min);
        return min;
    }

    @Override
    public int getMaxNumber(CustomArray customArray) {
        int maxValue = Integer.MIN_VALUE;

        for (int i: customArray.getArray()){
            if (i > maxValue){
                maxValue = i;
            }
        }

        logger.log(Level.INFO, "max = " + maxValue);
        return maxValue;
    }

    @Override
    public int getMaxNumberStream(CustomArray customArray) {
        int[] array = customArray.getArray();
        int max = Arrays.stream(array).max().getAsInt();
        logger.log(Level.INFO, "max (stream) = " + max);
        return max;
    }

    @Override
    public void changeArrayContent(CustomArray customArray) {
        int[] array = customArray.getArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0){
                array[i] = 0;
            }
        }

        logger.log(Level.INFO, "elements were replaced " + Arrays.toString(array));
        customArray.setArray(array);
    }

    @Override
    public void changeArrayContentStream(CustomArray customArray) {
        int[] array = customArray.getArray();
        int[] changedArray = Arrays.stream(array).map(x -> x < 0 ? 0: x).toArray();
        logger.log(Level.INFO, "elements were replaced (stream) " + Arrays.toString(changedArray));
        customArray.setArray(changedArray);
    }

    @Override
    public double getAverageValue(CustomArray customArray) {
        double averageValue;
        int sum = 0;
        int itemsCount = customArray.getArray().length;

        for (int i : customArray.getArray()) {
            sum += i;
        }

        averageValue = (double) sum / itemsCount;

        logger.log(Level.INFO, "average = " + averageValue);
        return averageValue;
    }

    @Override
    public double getAverageValueStream(CustomArray customArray) {
        int[] array = customArray.getArray();
        double average = Arrays.stream(array).average().getAsDouble();
        logger.log(Level.INFO, "average (stream) = " + average);
        return average;
    }

    @Override
    public int getSum(CustomArray customArray) {
        int sum = 0;

        for (int i : customArray.getArray()) {
            sum += i;
        }

        logger.log(Level.INFO, "sum = " + sum);
        return sum;
    }

    @Override
    public int getSumStream(CustomArray customArray) {
        int[] array = customArray.getArray();
        int sum = Arrays.stream(array).sum();
        logger.log(Level.INFO, "sum (stream) = " + sum);
        return sum;
    }

    @Override
    public long getCountOfPositiveNumbers(CustomArray customArray) {
        long positiveNumbers = 0;

        for (int i : customArray.getArray()) {
            if (i >= 0) {
                positiveNumbers++;
            }
        }

        logger.log(Level.INFO, "count of positive = " + positiveNumbers);

        return positiveNumbers;
    }

    @Override
    public long getCountOfPositiveNumbersStream(CustomArray customArray) {
        int[] array = customArray.getArray();
        long result = Arrays.stream(array).filter(x -> x > 0).count();
        logger.log(Level.INFO, "count of positive (stream) = " + result);
        return result;
    }

    @Override
    public long getCountOfNegativeNumbers(CustomArray customArray) {
        long negativeNumbers = 0;

        for (int i : customArray.getArray()) {
            if (i < 0) {
                negativeNumbers++;
            }
        }

        logger.log(Level.INFO, "count of negative = " + negativeNumbers);

        return negativeNumbers;
    }

    @Override
    public long getCountOfNegativeNumbersStream(CustomArray customArray) {
        int[] array = customArray.getArray();
        long result = Arrays.stream(array).filter(x -> x < 0).count();
        logger.log(Level.INFO, "count of negative (stream) = " + result);
        return result;
    }
}