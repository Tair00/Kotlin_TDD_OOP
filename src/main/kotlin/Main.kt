fun main() {
    val walk: MoveLogic = Walk()
    val fly: MoveLogic = Fly()

    val animalA: Animal = Person(walk)
    val animalB: Animal = Bird(fly)

    animalA.howDoIMove()
    animalB.howDoIMove()
}
