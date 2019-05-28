package sample

actual fun case_10() = object : I {}

actual <!NOTHING_TO_INLINE("public actual inline fun <T> T.case_11(): I defined in sample in file jvm-3.kt")!>inline<!> fun <T> T.case_11() = object : I {}

class Case12 : I {}

actual fun <!ACTUAL_WITHOUT_EXPECT("Actual function 'case_12'", " The following declaration is incompatible because return type is different:     public expect fun case_12(): I ")!>case_12<!>() = Case12()

actual fun <!ACTUAL_WITHOUT_EXPECT("Actual function 'case_13'", " The following declaration is incompatible because return type is different:     public expect fun case_13(): Number ")!>case_13<!>() = 10

actual suspend fun case_15() = 10

actual suspend inline fun <T> (suspend T.(T) -> T).case_16(crossinline x: (T) -> T): T = x(<!NO_VALUE_FOR_PARAMETER("p1")!>)<!>

actual suspend inline fun <T> (suspend T.(T) -> T).case_17<!ACTUAL_WITHOUT_EXPECT("Actual function 'case_17'", " The following declaration is incompatible because parameter types are different:     public expect suspend inline fun <T> (T.(T) -> T).case_17(crossinline x: (T) -> T): T ")!>(crossinline x: (T) -> T)<!>: T = x(<!NO_VALUE_FOR_PARAMETER("p1")!>)<!>

actual suspend inline fun <T> (suspend T.(T) -> T).case_18<!ACTUAL_WITHOUT_EXPECT("Actual function 'case_18'", " The following declaration is incompatible because some value parameter is noinline in one declaration and not noinline in the other:     public expect suspend inline fun <T> (suspend T.(T) -> T).case_18(crossinline x: (T) -> T): T ")!>(noinline x: (T) -> T)<!>: T = x(<!NO_VALUE_FOR_PARAMETER("p1")!>)<!>

<!ACTUAL_WITHOUT_EXPECT("Actual function 'case_19'", " The following declaration is incompatible because modifiers are different (suspend):     public expect suspend fun <T> (suspend T.(T) -> T).case_19(x: (T) -> T): T ")!>actual<!> fun <T> (suspend T.(T) -> T).case_19(x: (T) -> T): T = x(<!NO_VALUE_FOR_PARAMETER("p1")!>)<!>

actual fun <T> T.case_8() = null <!UNCHECKED_CAST("Nothing?", "T")!>as T<!>

actual fun case_9() = 10

actual fun <T> Map<in T, <!REDUNDANT_PROJECTION("Map")!>out<!> T>.case_4() = null <!UNCHECKED_CAST("Nothing?", "T")!>as T<!>
