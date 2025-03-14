class BRNode<K: Comparator<K>, T>(override var key: K, override var value: T): Node<K, T, BSNode<K, T>>() {
    private var color: Byte=0
    private fun checkColors(): Byte {}
}