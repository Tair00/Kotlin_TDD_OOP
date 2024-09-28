fun main() {
    val myCircularDeque = MyCircularDeque(3)
    println(myCircularDeque.insertFront(9)) // returns true
    println(myCircularDeque.getRear())      // returns 9
    println(myCircularDeque.insertFront(9)) // returns true
    println(myCircularDeque.getRear())      // returns 9
    println(myCircularDeque.insertLast(5))  // returns true
    println(myCircularDeque.getFront())     // returns 9
    println(myCircularDeque.getRear())      // returns 5
    println(myCircularDeque.insertLast(8))  // returns false (deque is full)
    println(myCircularDeque.deleteLast())   // returns true
    println(myCircularDeque.getFront())     // returns 9
}
