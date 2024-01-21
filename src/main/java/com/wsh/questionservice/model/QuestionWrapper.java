package com.wsh.questionservice.model;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class QuestionWrapper {

        @NonNull
        private Integer id;

        @NonNull
        private String questionTitle;

        @NonNull
        private String option1;

        @NonNull
        private String option2;

        @NonNull
        private String option3;

        @NonNull
        private String option4;

        @NonNull
        private Integer points;
}
