fun main() {
    val list1 = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val list2 = mutableListOf<String>()
    list1.forEach { list2.add(it.toString()) }

    println("in the list1 the member of the list are integer(the syntax it + it is used as sum \n" +
            "and not as concatenation of strings):")
    list1.forEach { println(it + it) }

    println("in the list2 the member of the list are Strings(they aren't added as integer):")
    list2.forEach { println(it + it) }

}

