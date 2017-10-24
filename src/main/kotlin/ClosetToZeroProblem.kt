fun main(args: Array<String>) {
    val inputString = "aabbddccca"
    isPalindromable(inputString)
}

fun isPalindromable(inputString: String): Boolean {
    println(inputString.toSet())

    return inputString.toSet().filter { c -> inputString.count { it == c } % 2 == 1 }.count() < 2

}

fun areEquallyStrong(yourLeft: Int, yourRight: Int, friendsLeft: Int, friendsRight: Int): Boolean = listOf(yourLeft, yourRight).sorted() == listOf(friendsLeft, friendsRight).sorted()


fun arrayMaximalAdjacentDifference(inputArray: MutableList<Int>) = (1 until inputArray.size).map{Math.abs(inputArray[it] - inputArray[it - 1])}.max()

fun isIPv4Address(inputString: String):Boolean {
    val tokens = inputString.split(".")
    return tokens.size == 4 && tokens.all{it.toIntOrNull() in 0..255}
}