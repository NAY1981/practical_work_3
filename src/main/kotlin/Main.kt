fun main(args: Array<String>) {
    val list = mutableListOf<Int>()
    for (figure in 1..10) {
        list.add(figure)
    }
    printList(list)
}
fun printList(list: MutableList<Int>) {
    print(list)
}