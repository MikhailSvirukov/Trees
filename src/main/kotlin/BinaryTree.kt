interface BinaryTree <K, T>{
    fun insert(key: K, value: T)
    fun delete(key: K): T
    fun find(key: K): Boolean
    fun peek(key: K): T
    fun findParent(key: K): K
    fun findSealing(key: K): K
    fun printNodes()
}