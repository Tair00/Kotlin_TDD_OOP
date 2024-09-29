fun main() {
    val allOne = AllOne() // Создаем объект AllOne

    // Пример ввода данных и вызова методов

    // Увеличиваем количество для ключей "hello", "goodbye", "hello", "hello"
    allOne.inc("hello")
    allOne.inc("goodbye")
    allOne.inc("hello")
    allOne.inc("hello")

    // Выводим ключ с максимальным количеством
    println("Max Key: " + allOne.getMaxKey()) // Ожидается "hello"

    // Увеличиваем количество для ключей "leet", "code", "leet"
    allOne.inc("leet")
    allOne.inc("code")
    allOne.inc("leet")

    // Уменьшаем количество для ключа "hello"
    allOne.dec("hello")

    // Увеличиваем количество для ключей "leet", "code", "code"
    allOne.inc("leet")
    allOne.inc("code")
    allOne.inc("code")

    // Выводим ключ с максимальным количеством после изменений
    println("Max Key: " + allOne.getMaxKey()) // Ожидается "leet"

    // Выводим ключ с минимальным количеством
    println("Min Key: " + allOne.getMinKey()) // Ожидается "goodbye"
}
