class KotlinNativeFramework {
    var listener: KotlinNativeFrameworkListener? = null

    fun giveMeDoubles() {
        while (true) {
            val myList = DoubleArray(100) { 1.0 }.toList()
            listener?.listenToDoubles(myList) // If this line is commented, the leak stops.
        }
    }
}

interface KotlinNativeFrameworkListener {
    fun listenToDoubles(list: List<Double>)
}
