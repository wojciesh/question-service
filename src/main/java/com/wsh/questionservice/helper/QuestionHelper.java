package com.wsh.questionservice.helper;

import com.wsh.questionservice.model.Question;
import com.wsh.questionservice.model.QuestionWrapper;

import java.util.List;

public class QuestionHelper {

    private QuestionHelper() {
        throw new IllegalStateException("Utility class");
    }

    public static List<QuestionWrapper> wrapQuestions(List<Question> questions) {
        return questions.stream().map(QuestionHelper::wrapQuestion).toList();
    }

    public static QuestionWrapper wrapQuestion(Question question) {
        return new QuestionWrapper(
                question.getId(),
                question.getQuestionTitle(),
                question.getOption1(),
                question.getOption2(),
                question.getOption3(),
                question.getOption4(),
                question.getPoints());
    }


}
