package com.jinesh.bigCatchRecords.repository;

import com.jinesh.bigCatchRecords.entity.TodaysBigCatch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BigCatchRepository extends JpaRepository<TodaysBigCatch, Integer> {
    TodaysBigCatch findByFisherman(String fisherman);

    TodaysBigCatch findByFishname(String fishname);
}
