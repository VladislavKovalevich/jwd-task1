package by.vlad.task1.creator;

import by.vlad.task1.entity.CustomArray;

import java.util.List;

public interface Creator {
    CustomArray createArrayFromFile(List<Integer> integerList);
}
