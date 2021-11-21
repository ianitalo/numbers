package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListSorterTest {
    List<Integer> list;
    List<Integer> expected;
    @BeforeEach
    public void helper()
    {
        list = Arrays.asList(3, 2, 6, 1,25, 4, 5, 7,8,9,1,2,3,8,4);
        expected = Arrays.asList(1,1,2, 2,3, 3, 4,4, 5, 6, 7,8,8,9,25);
    }
    @Test
    public void sort() {

        ListSorter sorter = new ListSorter();
        List<Integer> sorted = sorter.sort(list);

        Assertions.assertEquals(expected, sorted);
    }
}
