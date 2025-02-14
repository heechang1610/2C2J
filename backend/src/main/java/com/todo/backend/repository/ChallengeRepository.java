package com.todo.backend.repository;

import com.todo.backend.entity.ChallengeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface ChallengeRepository extends JpaRepository<ChallengeEntity, Integer> {
    // 해당 날짜의 challenge 찾기(리스트로 반환)
     //List<ChallengeEntity> findByStartdateBetweenAndEnddateBetween(LocalDateTime startDate, LocalDateTime endDate);

    // 가장 최신 데이터 시간 찾기
    @Query("SELECT MAX(lastData) FROM ChallengeEntity ")
    LocalDateTime findLastData();
}
