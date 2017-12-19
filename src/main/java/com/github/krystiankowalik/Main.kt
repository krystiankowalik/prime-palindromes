package com.github.krystiankowalik

import com.github.krystiankowalik.logic.PrimeRangeCalculator

const val FIVE_DIGIT_NUMBER_MIN = 10_000L
const val FIVE_DIGIT_NUMBER_MAX = 99_999L

fun main(args: Array<String>) {

    val range = LongRange(FIVE_DIGIT_NUMBER_MIN, FIVE_DIGIT_NUMBER_MAX)
    val primeRangeCalculator = PrimeRangeCalculator(range)
    val largestPalindrome = primeRangeCalculator.getLargestPalindromeFromMultipliedPrimes()

    println("The largest Palindrome in range  $range is: ${largestPalindrome.value}.")
    println("It is the product of multiplication of the following five-digit primes: ${largestPalindrome.multipliers}")


}






