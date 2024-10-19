package com.example.tiptime

import org.junit.Assert.assertEquals
import org.junit.Test

class TipCalculatorTests {
    @Test
    fun calculateTip_20PercentNoRoundup() {
        val tipAmount = 10.0
        val tipPercent = 20.0
        val expectedTip = "$2.00"
        val actualTip = calculateTip(tipAmount, tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }
}