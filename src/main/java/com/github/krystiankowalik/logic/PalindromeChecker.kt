package com.github.krystiankowalik.logic

fun Long.isPalindrome() = this.toString() == this.toString().reversed()