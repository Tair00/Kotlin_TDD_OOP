class Bird(private val myMoveLogic: MoveLogic) : Animal() {
    override fun howDoIMove() {
        myMoveLogic.move()
    }
}
