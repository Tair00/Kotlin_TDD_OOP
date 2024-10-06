interface Question {
    fun nextQuestion()
    fun previousQuestion()
    fun newQuestion(q: String)
    fun deleteQuestion(q: String)
    fun displayQuestion()
    fun displayAllQuestions()
}
