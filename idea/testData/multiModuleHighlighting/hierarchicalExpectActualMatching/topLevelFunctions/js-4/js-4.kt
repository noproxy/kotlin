package sample

actual fun <T> Map<in T, <!REDUNDANT_PROJECTION("Map")!>out<!> T>.case_4() = null <!UNCHECKED_CAST("Nothing?", "T")!>as T<!>

actual fun <T> T.case_8() = null <!UNCHECKED_CAST("Nothing?", "T")!>as T<!>

actual fun case_9() = 10

actual suspend inline fun <T> (suspend T.(T) -> T).case_17<!ACTUAL_WITHOUT_EXPECT("Actual function 'case_17'", " The following declaration is incompatible because parameter types are different:     public expect suspend inline fun <T> (T.(T) -> T).case_17(crossinline x: (T) -> T): T ")!>(crossinline x: (T) -> T)<!>: T = x(<!NO_VALUE_FOR_PARAMETER("p1")!>)<!>

actual suspend inline fun <T> (suspend T.(T) -> T).case_18<!ACTUAL_WITHOUT_EXPECT("Actual function 'case_18'", " The following declaration is incompatible because some value parameter is noinline in one declaration and not noinline in the other:     public expect suspend inline fun <T> (suspend T.(T) -> T).case_18(crossinline x: (T) -> T): T ")!>(noinline x: (T) -> T)<!>: T = x(<!NO_VALUE_FOR_PARAMETER("p1")!>)<!>

actual tailrec fun case_20(y: () -> Unit): Int {
    y()
    return if (true) 10 else case_20 { }
}

actual infix fun <T> T.case_21(x: Int) = 10

<!ACTUAL_WITHOUT_EXPECT("Actual function 'case_22'", " The following declaration is incompatible because some modifiers on expected declaration are missing on the actual one (external, infix, inline, operator, tailrec):     public expect infix fun <T> T.case_22(x: Int): Int ")!>actual<!> fun <T> T.case_22(x: Int) = 10

actual infix fun <T> T.case_23(x: Int) = 10

actual operator fun CharSequence.plus(x: Int) = 10

actual internal suspend inline infix operator fun <T> T.plus(x: () -> T) = x()

<!ACTUAL_WITHOUT_EXPECT("Actual function 'minus'", " The following declaration is incompatible because some modifiers on expected declaration are missing on the actual one (external, infix, inline, operator, tailrec):     public expect infix operator fun <T> T.minus(x: () -> T): T ")!>actual operator<!> fun <T> T.minus(x: () -> T) = x()

actual <!ACTUAL_WITHOUT_EXPECT("Actual function 'case_24'", " The following declaration is incompatible because visibility is different:     public expect fun case_24(): Int ")!>internal<!> fun case_24() = 10

actual fun case_25() = 10
