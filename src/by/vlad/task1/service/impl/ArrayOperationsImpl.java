package by.vlad.task1.service.impl;

import by.vlad.task1.entity.CustomArray;
import by.vlad.task1.service.ArrayOperations;

public class ArrayOperationsImpl implements ArrayOperations {
    @Override
    public int getMinNumber(CustomArray customArray) {
        //int min;

        //min = Arrays.stream(customArray.getArray()).min().getAsInt();

        //return min;
        int minValue = Integer.MAX_VALUE;

        for (int i: customArray.getArray()){
            if (i < minValue){
                minValue = i;
            }
        }

        return minValue;
    }

    @Override
    public int getMaxNumber(CustomArray customArray) {
        //int max;

        //max = Arrays.stream(customArray.getArray()).max().getAsInt();

        //return max;
        int maxValue = Integer.MIN_VALUE;

        for (int i: customArray.getArray()){
            if (i > maxValue){
                maxValue = i;
            }
        }

        return maxValue;
    }

    @Override
    public void changeArrayContent(CustomArray customArray) {

        //int[] currArray = Arrays.stream(customArray.getArray()).filter(x -> x < 0).map(x -> x = 0).toArray();

        //System.out.println(Arrays.toString(currArray));
        //customArray.setArray(currArray);
        int[] array = customArray.getArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0){
                array[i] = 0;
            }
        }
    }

    @Override
    public double getAverageValue(CustomArray customArray) {
        //double averageValue;

        //averageValue = Arrays.stream(customArray.getArray()).average().getAsDouble();

        //return averageValue;
        double averageValue;
        int sum = 0;
        int itemsCount = customArray.getArray().length;

        for (int i : customArray.getArray()) {
            sum += i;
        }

        averageValue = (double) sum / itemsCount;

        return averageValue;
    }

    @Override
    public int getSum(CustomArray customArray) {
        int sum = 0;

        //sum = Arrays.stream(customArray.getArray()).sum();

        for (int i : customArray.getArray()) {
            sum += i;
        }

        return sum;
    }

    @Override
    public long getCountOfPositiveNumbers(CustomArray customArray) {
        long positiveNumbers = 0;

        //positiveNumbers = Arrays.stream(customArray.getArray()).filter(x -> x >= 0).count();

        for (int i : customArray.getArray()) {
            if (i >= 0) {
                positiveNumbers++;
            }
        }

        return positiveNumbers;
    }

    @Override
    public long getCountOfNegativeNumbers(CustomArray customArray) {
        long negativeNumbers = 0;

        //negativeNumbers = Arrays.stream(customArray.getArray()).filter(x -> x < 0).count();

        for (int i : customArray.getArray()) {
            if (i < 0) {
                negativeNumbers++;
            }
        }

        return negativeNumbers;
    }
}