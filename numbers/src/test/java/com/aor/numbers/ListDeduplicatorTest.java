package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListDeduplicatorTest {
    List<Integer> list;
    List<Integer> expected;
    @BeforeEach
    public void helper()
    {
        list = Arrays.asList(1,2,4,2,5);
        expected = Arrays.asList(1,2,4,5);
    }
    @Test
    public void deduplicate()
    {
        class StubListSorter implements GenericSorter{
            @Override
            public List<Integer> sort() {
                return  Arrays.asList(1, 2, 2, 4, 5);
            }
        }
        StubListSorter stubsort = new StubListSorter();
        ListDeduplicator deduplicated =  new ListDeduplicator();
        List<Integer> res = deduplicated.deduplicate(list,stubsort);

        Assertions.assertEquals(expected, res);
    }
}
