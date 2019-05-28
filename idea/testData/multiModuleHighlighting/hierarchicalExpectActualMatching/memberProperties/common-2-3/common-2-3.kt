package sample

expect sealed class Case7 {
    <!EXPECTED_LATEINIT_PROPERTY!>lateinit<!> var x: Any
}

expect sealed class Case8 {
    var x: Any
}

expect object Case9 : Comparable<Int> {
    <!EXPECTED_DECLARATION_WITH_BODY!>override fun compareTo(other: Int)<!> = <!UNRESOLVED_REFERENCE("TODO")!>TODO<!>()
    <!CONST_VAL_WITHOUT_INITIALIZER!>const<!> val x: Int
}
