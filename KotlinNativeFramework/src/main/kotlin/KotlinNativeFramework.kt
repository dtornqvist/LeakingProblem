import kotlin.native.ref.WeakReference
import kotlinx.cinterop.autoreleasepool

class KotlinNativeFramework {
    private var listenerRef: WeakReference<KotlinNativeFrameworkListener>? = null

    var listener: KotlinNativeFrameworkListener?
        get() = listenerRef?.get()
        set(value) {
            if (value != null)
                listenerRef = WeakReference(value)
            else
                listenerRef = null
        }

    fun giveMeDoubles() {
        while (true) {
            val myList = DoubleArray(100) { 1.0 }.toList()
            autoreleasepool {
                listener?.listenToDoubles(myList)
            }
        }
    }
}

interface KotlinNativeFrameworkListener {
    fun listenToDoubles(list: List<Double>)
}
