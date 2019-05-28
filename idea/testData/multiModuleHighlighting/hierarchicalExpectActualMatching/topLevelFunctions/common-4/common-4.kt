package sample

actual fun case_10() = object : I {}

actual <!NOTHING_TO_INLINE("public actual inline fun <T> T.case_11(): I defined in sample in file common-4.kt")!>inline<!> fun <T> T.case_11() = object : I {}

expect tailrec fun case_20(y: () -> Unit): Int

expect infix fun <T> T.case_21(x: Int): Int

expect infix fun <T> T.case_22(x: Int): Int

expect fun <T> T.case_23(x: Int): Int

actual suspend fun case_15() = 10

expect operator fun CharSequence.plus(x: Int): Int

expect internal suspend inline infix operator fun <T> T.plus(x: () -> T): T

expect infix operator fun <T> T.minus(x: () -> T): T

expect fun case_24(): Int

expect internal fun case_25(): Int

class Case12 : I {}

actual fun <!ACTUAL_WITHOUT_EXPECT("Actual function 'case_12'", " The following declaration is incompatible because return type is different:     public expect fun case_12(): I ")!>case_12<!>() = Case12()

actual fun <!ACTUAL_WITHOUT_EXPECT("Actual function 'case_13'", " The following declaration is incompatible because return type is different:     public expect fun case_13(): Number ")!>case_13<!>() = 10

actual suspend inline fun <T> (suspend T.(T) -> T).case_16(crossinline x: (T) -> T): T = x(<!NO_VALUE_FOR_PARAMETER("p1")!>)<!>

actual suspend fun <T> (suspend T.(T) -> T).case_19(x: (T) -> T): T = x(<!NO_VALUE_FOR_PARAMETER("p1")!>)<!>
