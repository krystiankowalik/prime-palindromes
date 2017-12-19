package com.github.krystiankowalik.model

class Palindrome(
        val value: Long,
        val multipliers: Pair<Long, Long>
) {
    constructor() : this(0L, Pair(0, 0))

}