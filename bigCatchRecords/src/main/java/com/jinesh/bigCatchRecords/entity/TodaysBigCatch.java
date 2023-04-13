package com.jinesh.bigCatchRecords.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "FISHING_CATCH_RECORDS")
public class TodaysBigCatch {
    @Id
    private int id;
    private String fisherman;
    private String fishname;
    private float recordWeight;
}
