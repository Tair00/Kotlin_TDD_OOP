class Person(private val myMoveLogic: MoveLogic) : Animal() {
    override fun howDoIMove() {
        myMoveLogic.move()
    }
}
