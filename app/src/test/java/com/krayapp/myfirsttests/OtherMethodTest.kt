package com.krayapp.myfirsttests

import org.junit.Assert.*
import org.junit.Test

class OtherMethodTest {

    @Test
    fun checkMultiCorrectly(){
        assertEquals(6,OtherMethodForTest().compute(2,3))
    }

    @Test
    fun checkMultiCorrectlySecond(){
        assertNotEquals(6,OtherMethodForTest().compute(2,4))
    }

    @Test
    fun getArrayCorrectly(){
        assertArrayEquals(OtherMethodForTest().getArray(), arrayOf(1,2,3,4,5))
    }

    @Test
    fun multiNotNull(){
        assertNotNull(OtherMethodForTest().compute(2,3))
    }
}