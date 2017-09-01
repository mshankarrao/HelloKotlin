fun main(args: Array<String>) {
    var lists = listOf(1,2,3,4,5);

    println(lists[0])

    //lists[0] = 7 can't change the existing value in lists

    var arrays = arrayOf(1,2,3,4,5);

    arrays[0] = 7

    println(arrays[0])

    var mutableLists = mutableListOf(1,2,3,4,5)

    println(mutableLists)
    mutableLists.add(0,7)

    println(mutableLists)


}