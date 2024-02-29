interface Numbers  {

    fun sum(): Int
    fun difference(): Int

    class Base(private val number1: Int,
               private val number2: Int
    ): Numbers{
        override fun sum(): Int {
            return number1 + number2
        }

        override fun difference(): Int {
            return number1 - number2
        }
    }
    class ThreeNumber(
        private val number1: Int,
        private val number2: Int,
        private val number3: Int
    ):Numbers{

        override fun sum(): Int {
         return number1 + number2 + number3
        }

        override fun difference(): Int {
          return number1 - number2 - number3
        }
    }
}