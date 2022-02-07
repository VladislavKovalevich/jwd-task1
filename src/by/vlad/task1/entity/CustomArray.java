package by.vlad.task1.entity;

import java.util.Arrays;
import java.util.List;

public class CustomArray {
    private int[] array;

    public CustomArray(List<Integer> array) {
        this.array = new int[array.size()];

        for (int i = 0; i < array.size(); i++) {
            this.array[i] = array.get(i);
        }
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomArray that = (CustomArray) o;
        return Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        return "CustomArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}