package com.sky.mockito;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * @author sky
 * @date 2022/4/7
 * @description mockito测试
 */

public class MockitoTest {

    @Test
    public void verifyTest(){
        List mockedList =  mock(List.class);
        mockedList.add("one");
        mockedList.clear();

        verify(mockedList).add("one");
        verify(mockedList).clear();
    }

}
