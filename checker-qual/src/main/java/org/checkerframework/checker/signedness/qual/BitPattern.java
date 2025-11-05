package org.checkerframework.checker.signedness.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.SubtypeOf;

/**
 * The value is to be interpreted as a raw bit pattern rather than as an arithmetic number. This
 * qualifier is used for values that are the result of bit manipulation operations (e.g.,
 * Double.doubleToLongBits()) or bitmask flags.
 *
 * <p>Arithmetic operations (+, -, *, /, %) and increment/decrement operations are forbidden
 * on @BitPattern values, but bitwise and shift operations (&, |, ^, ~, <<, >>, >>>) are allowed.
 *
 * @checker_framework.manual #signedness-checker Signedness Checker
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@SubtypeOf({UnknownSignedness.class})
public @interface BitPattern {}
