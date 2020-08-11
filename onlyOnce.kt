fun main() {
    val word = readLine()!!
    var once = 0
    for (ch in word) {
        if (word.count{it == ch} == 1) once++
    }
    print(once)
}