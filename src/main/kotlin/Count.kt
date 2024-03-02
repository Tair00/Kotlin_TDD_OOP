interface Count {

    fun click()

    interface Callback{
        fun provide(value: String)
    }

    class Base(
        private val callbake: Callback
    ): Count {

        private var value = 0

        override fun click() {
            callbake.provide((++value).toString())

        }
    }
}