class AllOne {
    private val root = Node()
    private val nodes = mutableMapOf<String, Node>()

    init {

        root.next = root
        root.prev = root
    }

    fun inc(key: String) {

        if (!nodes.containsKey(key)) {

            if (root.next == root || root.next!!.cnt > 1) {
                nodes[key] = root.insert(Node(key, 1))
            } else {
                root.next!!.keys.add(key)
                nodes[key] = root.next!!
            }
        } else {
            val current = nodes[key]!!
            val next = current.next!!
            if (next == root || next.cnt > current.cnt + 1) {
                nodes[key] = current.insert(Node(key, current.cnt + 1))
            } else {
                next.keys.add(key)
                nodes[key] = next
            }
            current.keys.remove(key)
            if (current.keys.isEmpty()) {
                current.remove()
            }
        }
    }

    fun dec(key: String) {
        val current = nodes[key]!!
        if (current.cnt == 1) {

            nodes.remove(key)
        } else {
            val prev = current.prev!!
            if (prev == root || prev.cnt < current.cnt - 1) {
                nodes[key] = prev.insert(Node(key, current.cnt - 1))
            } else {
                prev.keys.add(key)
                nodes[key] = prev
            }
        }

        current.keys.remove(key)
        if (current.keys.isEmpty()) {
            current.remove()
        }
    }

    fun getMaxKey(): String {

        return if (root.prev == root) "" else root.prev!!.keys.first()
    }

    fun getMinKey(): String {

        return if (root.next == root) "" else root.next!!.keys.first()
    }
}

class Node {
    var prev: Node? = null
    var next: Node? = null
    var cnt: Int = 0
    val keys: MutableSet<String> = mutableSetOf()

    constructor() : this("", 0)

    constructor(key: String, cnt: Int) {
        this.cnt = cnt
        keys.add(key)
    }

    fun insert(node: Node): Node {
        node.prev = this
        node.next = this.next
        node.prev!!.next = node
        node.next!!.prev = node
        return node
    }

    fun remove() {
        this.prev!!.next = this.next
        this.next!!.prev = this.prev
    }
}
