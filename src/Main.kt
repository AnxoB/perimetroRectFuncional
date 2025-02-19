fun main() {
    generateSequence {
        readln().split(" ")
            .map(String::toInt)
            .takeIf { (x, y) -> x >= 0 && y >= 0 }
    }.forEach { (x, y) ->
        println(x * 2 + y * 2)
    }
}