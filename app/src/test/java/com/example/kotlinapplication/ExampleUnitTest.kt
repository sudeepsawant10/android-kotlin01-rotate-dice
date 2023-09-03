package com.example.kotlinapplication

import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    val dice = Dice(6)
    val rollResult = dice.roll()
    @Test
    fun generates_number(){
        assertTrue("The value of rollResult was not between 1 and 6", rollResult in 1..6);
    }
}