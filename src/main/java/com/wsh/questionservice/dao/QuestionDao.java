package com.wsh.questionservice.dao;

import com.wsh.questionservice.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {

    List<Question> findByCategory(String category);

    @Query(value = "SELECT id FROM question WHERE category = :category ORDER BY RANDOM() LIMIT :numQ", nativeQuery = true)
    List<Integer> getRandomQuestionsByCategory(String category, Integer numQ);
}
