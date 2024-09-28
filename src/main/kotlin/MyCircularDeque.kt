class MyCircularDeque(val k: Int) {
    private val deque: IntArray = IntArray(k)
    private var front: Int = 0
    private var rear: Int = 0
    private var size: Int = 0


    fun insertFront(value: Int): Boolean {
        if (isFull()) return false
        front = (front - 1 + k) % k
        deque[front] = value
        size++
        return true
    }

    fun insertLast(value: Int): Boolean {
        if (isFull()) return false
        deque[rear] = value
        rear = (rear + 1) % k
        size++
        return true
    }

    fun deleteFront(): Boolean {
        if (isEmpty()) return false
        front = (front + 1) % k
        size--
        return true
    }

    fun deleteLast(): Boolean {
        if (isEmpty()) return false
        rear = (rear - 1 + k) % k
        size--
        return true
    }

    fun getFront(): Int {
        return if (isEmpty()) -1 else deque[front]
    }

    fun getRear(): Int {
        return if (isEmpty()) -1 else deque[(rear - 1 + k) % k]
    }

    fun isEmpty(): Boolean {
        return size == 0
    }

    fun isFull(): Boolean {
        return size == k
    }
}
