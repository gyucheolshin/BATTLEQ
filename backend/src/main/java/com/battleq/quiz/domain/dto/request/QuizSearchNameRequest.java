package com.battleq.quiz.domain.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class QuizSearchNameRequest {
    private String name;
    private int limit;
    private int offset;
}