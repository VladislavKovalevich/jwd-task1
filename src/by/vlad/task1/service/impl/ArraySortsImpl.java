package by.vlad.task1.service.impl;

import by.vlad.task1.entity.CustomArray;
import by.vlad.task1.service.ArraySorts;

import java.util.Arrays;

public class ArraySortsImpl implements ArraySorts {

    @Override
    public void bubbleSort(CustomArray customArray) {
        int[] array = customArray.getArray();

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = array.length - 1; j > i; j--) {

                if (array[j - 1] > array[j]){

                    int temp;
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }

            }

        }
    }

    @Override
    public void selectionSort(CustomArray customArray) {
        int[] array = customArray.getArray();

        for (int i = 0; i < array.length; i++) {

            int maxItemPos;
            int maxItem;

            maxItemPos = i;
            maxItem = array[i];

            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < maxItem){
                    maxItemPos = j;
                    maxItem = array[j];
                }

            }

            array[maxItemPos] = array[i];
            array[i] = maxItem;
        }
    }

    @Override
    public void insertionSort(CustomArray customArray) {
        int[] array = customArray.getArray();
        int key;
        int lastIndex;
        int firstIndex;

        for (int i = 0; i < array.length; i++) {

            key = array[i];
            lastIndex = i;
            firstIndex = 0;

            lastIndex = binarySearch(firstIndex, lastIndex, array, key);

            for (int j = i; j > lastIndex; j--) {
                array[j] = array[j - 1];
            }

            array[lastIndex] = key;

        }
    }

    @Override
    public void streamSort(CustomArray customArray) {
        int[] array = customArray.getArray();
        int[] sortedArray;

        sortedArray = Arrays.stream(array)
                .sorted()
                .toArray();

        customArray.setArray(sortedArray);
    }

    private int binarySearch(int firstIndex, int lastIndex, int[] array, int element) {
        int last;
        int first;
        int middle;

        last = lastIndex;
        first = firstIndex;

        while (first < last){

            middle = first + (last - first)/ 2;

            if (element < array[middle]){
                last = middle;
            }else{
                first = middle + 1;
            }
        }

        return first;
    }

}
