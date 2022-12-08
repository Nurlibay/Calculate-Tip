package uz.nurlibaydev.tiptime

import org.junit.Assert
import org.junit.Test

/**
 *  Created by Nurlibay Koshkinbaev on 08/12/2022 19:03
 */

class TipCalculatorTests {

    @Test
    fun calculate_20_percent_tip_no_roundup() {
        val amount = 10.00
        val tipPercent = 20.00
        val expectedTip = "$2.00"
        val actualTip = calculateTipTest(amount = amount, tipPercent = tipPercent, false)
        Assert.assertEquals(expectedTip, actualTip)
    }
}