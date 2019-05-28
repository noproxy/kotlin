package sample

expect var <T> Map<in T, <!REDUNDANT_PROJECTION("Map")!>out<!> T>.case_5: T

expect var Number.case_6: Int

// unexpected behaviour: KT-31464
<!INLINE_PROPERTY_WITH_BACKING_FIELD!>expect inline val <T> T.case_7: T<!>
