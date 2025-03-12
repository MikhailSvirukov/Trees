interface BinaryTree {
    fun <K, T> insert(key: K, value: T)
    fun <K, T> delete(key: K): T
    fun <K> find(key: K): Boolean
    fun <K, T> peek(key: K): T
    fun <K> findParent(key: K): K
    fun <K> findSealing(key: K): K
    fun printNodes()
}