fun main() {
    val questions = QuestionFormat("Java Programming Language")
    questions.q = KotlinQuestions()

    questions.delete("What is class?")
    questions.display()

    questions.newOne("What is inheritance?")
    questions.newOne("How many types of inheritance are there in java?")

    questions.displayAll()
}
