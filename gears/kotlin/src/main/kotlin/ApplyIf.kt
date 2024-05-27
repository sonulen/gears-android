package com.redmadrobot.gears.kotlin

/**
 * Applies the given block of modifications to the T if the condition is true.
 *
 * @param condition condition to determine if the block should be applied.
 * @param block Lambda function that modifies the T.
 * @return Modified T based on the condition.
 */
public inline fun <T> T.applyIf(
    condition: Boolean,
    block: T.() -> T,
): T = applyIfElse(condition = condition, trueBlock = block, falseBlock = { this })

/**
 * Chooses between two blocks of modifications based on a condition and returns the resulting T.
 *
 * @param condition Boolean condition to determine which block to apply.
 * @param trueBlock Lambda function to modify the T if the condition is true.
 * @param falseBlock Lambda function to modify the T if the condition is false.
 * @return Modified T based on the condition.
 */
public inline fun <T> T.applyIfElse(
    condition: Boolean,
    trueBlock: T.() -> T,
    falseBlock: T.() -> T,
): T = if (condition) trueBlock() else falseBlock()
