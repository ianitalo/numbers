package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class DivisibleByFilterTest
{
    Integer testnumber;
    Integer divisor = 2;
    boolean res;
    DivisibleByFilter filtro;
    @BeforeEach
    public void helper()
    {
        testnumber = 9;
        filtro = new DivisibleByFilter(divisor);
    }
    @Test
    public void Accept()
    {
        res = filtro.accept(testnumber);
        Assertions.assertEquals(false,res);
    }

}
