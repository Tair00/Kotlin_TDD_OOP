open class QuestionManager(val catalog: String) {
    lateinit var q: Question

    fun next() {
        q.nextQuestion()
    }

    fun previous() {
        q.previousQuestion()
    }

    fun newOne(quest: String) {
        q.newQuestion(quest)
    }

    fun delete(quest: String) {
        q.deleteQuestion(quest)
    }

    fun display() {
        q.displayQuestion()
    }

    open fun displayAll() {
        println("Question Paper: $catalog")
        q.displayAllQuestions()
    }
}
