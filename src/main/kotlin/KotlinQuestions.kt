class KotlinQuestions : Question {
    private val questions = mutableListOf(
        "What is class?",
        "What is interface?",
        "What is abstraction?",
        "How multiple polymorphism is achieved in java?",
        "How many types of exception handling are there in java?",
        "Define the keyword final for variable, method, and class in java?",
        "What is abstract class?",
        "What is multi-threading?"
    )
    private var current = 0

    override fun nextQuestion() {
        if (current < questions.size - 1) current++
        println(current)
    }

    override fun previousQuestion() {
        if (current > 0) current--
    }

    override fun newQuestion(quest: String) {
        questions.add(quest)
    }

    override fun deleteQuestion(quest: String) {
        questions.remove(quest)
    }

    override fun displayQuestion() {
        println(questions[current])
    }

    override fun displayAllQuestions() {
        questions.forEach { println(it) }
    }
}
