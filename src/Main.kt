fun main() {
    generateSequence {
        readln().split(" ").map{ it.toInt() }
    }
        .filter { it.size==2 }
        .takeWhile { (x, y) -> x > 0 && y > 0 }
        .forEach { (x, y) -> println(x * 2 + y * 2) }
}