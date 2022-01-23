package com.example.quizapp

object Constants {

    const val USER_NAME : String = "User_name"
    const val TOTAL_QUESTIONS : String = "total questions"
    const val CORRECT_ANSWER : String = "correct Answer"

    fun qetQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val ques1 = Question(
            1, "What country does this belong to?",R.drawable.ic_flag_of_argentina,
            "Argentina","Australia","Armenia","Australia",1

        )
        questionList.add(ques1)

        val ques2 = Question(
            1, "What country does this belong to?",R.drawable.ic_flag_of_australia,
            "Argentina","Australia","Armenia","Australia",2

        )
        questionList.add(ques2)

        val ques3 = Question(
            1, "What country does this belong to?",R.drawable.ic_flag_of_belgium,
            "Bangladesh","Brazil","Belgium","Benin",3

        )
        questionList.add(ques3)

        val ques4 = Question(
            1, "What country does this belong to?",R.drawable.ic_flag_of_brazil,
            "Brazil","Bangladesh","Belgium","Benin",1

        )
        questionList.add(ques4)

        val ques5 = Question(
            1, "What country does this belong to?",R.drawable.ic_flag_of_denmark,
            "Dominican Republic","Australia","Switzerland","Denmark",4

        )
        questionList.add(ques5)

        val ques6 = Question(
            1, "What country does this belong to?",R.drawable.ic_flag_of_fiji,
            "Fiji","Australia","France","Finland",1

        )
        questionList.add(ques6)

        val ques7 = Question(
            1, "What country does this belong to?",R.drawable.ic_flag_of_germany,
            "Argentina","Ghana","Armenia","Germany",4

        )
        questionList.add(ques7)

        val ques8 = Question(
            1, "What country does this belong to?",R.drawable.ic_flag_of_india,
            "Iran","Indonesia","India","Italy",3

        )
        questionList.add(ques8)

        val ques9 = Question(
            1, "What country does this belong to?",R.drawable.ic_flag_of_kuwait,
            "Kazakhstan","Kuwait","Kyrgyzstan","Kenya",2

        )
        questionList.add(ques9)

        val ques10 = Question(
            1, "What country does this belong to?",R.drawable.ic_flag_of_new_zealand,
            "New Zealand","Nepal","Kyrgyzstan","Nigeria",1

        )
        questionList.add(ques10)

        return questionList
    }
}