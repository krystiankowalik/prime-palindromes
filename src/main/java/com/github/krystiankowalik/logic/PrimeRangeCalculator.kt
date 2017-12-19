package com.github.krystiankowalik.logic

import com.github.krystiankowalik.model.Palindrome

class PrimeRangeCalculator(private val numberRange: LongRange) {

    fun getLargestPalindromeFromMultipliedPrimes(): Palindrome {
        val primes = generatePrimes()

        var largestPalindrome = Palindrome()

        primes.forEach({ outerPrime ->
            primes.forEach({ innerPrime ->
                val product = outerPrime * innerPrime
                if (product.isPalindrome() && product > largestPalindrome.value) {
                    largestPalindrome = Palindrome(product, Pair(outerPrime, innerPrime))
                }
            })
        })

        return largestPalindrome
    }

    fun generatePrimes(): List<Long> = numberRange.filter({ it.isPrime() }).toList()

    private fun Long.isPrime(): Boolean {

        if (this == 1L) {
            return false
        }

        val primeCheckUpperLimit = Math.sqrt(this.toDouble()).toLong()
        return (2L..primeCheckUpperLimit).none { this % it == 0L }
    }
}