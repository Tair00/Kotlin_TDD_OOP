class QuestionFormat(catalog: String) : QuestionManager(catalog) {
    override fun displayAll() {
        println("\n---------------------------------------------------------")
        super.displayAll()
        println("-----------------------------------------------------------")
    }
}
