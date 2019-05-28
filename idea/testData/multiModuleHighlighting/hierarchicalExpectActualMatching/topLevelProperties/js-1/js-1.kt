package sample

actual val <T> T.case_1 by lazy { 10 <!UNCHECKED_CAST("Int", "T")!>as T<!> }

actual val case_2: List<Int> get() = listOf(1)

actual val case_3: Nothing = null!!

actual val <T> MutableList<out T>.case_4 get() = null <!UNCHECKED_CAST("Nothing?", "T")!>as T<!>

actual var <T> Map<in T, <!REDUNDANT_PROJECTION("Map")!>out<!> T>.case_5
    get() = null <!UNCHECKED_CAST("Nothing?", "T")!>as T<!>
    set(<!UNUSED_PARAMETER("value")!>value<!>) {}

actual inline var Number.case_6
    get() = 10
    set(<!UNUSED_PARAMETER("value")!>value<!>) {}

actual inline val <T> T.case_7 get() = 10 <!UNCHECKED_CAST("Int", "T")!>as T<!>

actual <!ACTUAL_WITHOUT_EXPECT("Actual property 'case_8'", " The following declaration is incompatible because property kinds are different (val vs var):     public expect var case_8: Int ")!>val<!> case_8 = 10

actual inline val <!ACTUAL_WITHOUT_EXPECT("Actual property 'case_9'", " The following declaration is incompatible because some type parameter is reified in one declaration and non-reified in the other:     public expect val <T> T.case_9: T ")!><reified T><!> T.case_9 get() = null as T
