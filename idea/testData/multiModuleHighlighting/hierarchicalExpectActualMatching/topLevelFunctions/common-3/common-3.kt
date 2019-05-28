package sample

actual <!NOTHING_TO_INLINE("public actual inline fun Number.case_5(): Int defined in sample in file common-3.kt")!>inline<!> fun Number.case_5() = 10

interface I

expect fun case_10(): I

expect fun <T> T.case_11(): I

expect fun case_12(): <!NO_ACTUAL_FOR_EXPECT("function 'case_12'", "js-3 for JS", " The following declaration is incompatible because return type is different:     public actual fun case_12(): Case9 "), NO_ACTUAL_FOR_EXPECT("function 'case_12'", "js-4 for JS", " The following declaration is incompatible because return type is different:     public actual fun case_12(): Case12 "), NO_ACTUAL_FOR_EXPECT("function 'case_12'", "jvm-3 for JVM", " The following declaration is incompatible because return type is different:     public actual fun case_12(): Case12 "), NO_ACTUAL_FOR_EXPECT("function 'case_12'", "jvm-4 for JVM", " The following declaration is incompatible because return type is different:     public actual fun case_12(): Case12 ")!>I<!>

expect fun case_13(): <!NO_ACTUAL_FOR_EXPECT("function 'case_13'", "js-3 for JS", " The following declaration is incompatible because return type is different:     public actual fun case_13(): Int "), NO_ACTUAL_FOR_EXPECT("function 'case_13'", "js-4 for JS", " The following declaration is incompatible because return type is different:     public actual fun case_13(): Int "), NO_ACTUAL_FOR_EXPECT("function 'case_13'", "jvm-3 for JVM", " The following declaration is incompatible because return type is different:     public actual fun case_13(): Int "), NO_ACTUAL_FOR_EXPECT("function 'case_13'", "jvm-4 for JVM", " The following declaration is incompatible because return type is different:     public actual fun case_13(): Int ")!>Number<!>

actual <!NOTHING_TO_INLINE("public actual inline fun <T> T.case_14(): T defined in sample in file common-3.kt")!>inline<!> fun <T> T.case_14() = 10 <!UNCHECKED_CAST("Int", "T")!>as T<!>

expect suspend fun case_15(): Int

expect suspend inline fun <T> (suspend T.(T) -> T).case_16(crossinline x: (T) -> T): T

expect suspend inline fun <T> (T.(T) -> T).case_17<!NO_ACTUAL_FOR_EXPECT("function 'case_17'", "js-3 for JS", " The following declaration is incompatible because parameter types are different:     public actual suspend inline fun <T> (suspend T.(T) -> T).case_17(crossinline x: (T) -> T): T "), NO_ACTUAL_FOR_EXPECT("function 'case_17'", "js-4 for JS", " The following declaration is incompatible because parameter types are different:     public actual suspend inline fun <T> (suspend T.(T) -> T).case_17(crossinline x: (T) -> T): T "), NO_ACTUAL_FOR_EXPECT("function 'case_17'", "jvm-3 for JVM", " The following declaration is incompatible because parameter types are different:     public actual suspend inline fun <T> (suspend T.(T) -> T).case_17(crossinline x: (T) -> T): T "), NO_ACTUAL_FOR_EXPECT("function 'case_17'", "jvm-4 for JVM", " The following declaration is incompatible because parameter types are different:     public actual suspend inline fun <T> (suspend T.(T) -> T).case_17(crossinline x: (T) -> T): T ")!>(crossinline x: (T) -> T)<!>: T

expect suspend inline fun <T> (suspend T.(T) -> T).case_18(crossinline x: (T) -> T): T

expect suspend fun <T> (suspend T.(T) -> T).case_19(x: (T) -> T): T

actual fun case_7() = 10

