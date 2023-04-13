package com.jinesh.bigCatchRecords.service;

import com.jinesh.bigCatchRecords.entity.TodaysBigCatch;
import com.jinesh.bigCatchRecords.repository.BigCatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BigCatchServices {
    @Autowired
    private BigCatchRepository repository;

    public TodaysBigCatch saveBigCatch(TodaysBigCatch bigCatch){
        return repository.save(bigCatch);
    }
    public List<TodaysBigCatch> saveBigCatches(List<TodaysBigCatch> bigCatches){
        return repository.saveAll(bigCatches);
    }
    public List<TodaysBigCatch> getBigCatches(){
        return repository.findAll();
    }
    public TodaysBigCatch getBigCatchById(int id){
        return repository.findById(id).orElse(null);
    }
    public TodaysBigCatch getBigCatchByFisherman(String fisherman){
        return repository.findByFisherman(fisherman);
    }
    public TodaysBigCatch getBigCatchByFishname(String fishname){
        return repository.findByFishname(fishname);
    }
    public String deleteBigCatch(int id){
        repository.deleteById(id);
        return "Deletion complete! ID - "+id;
    }
    public TodaysBigCatch updateBigCatch(TodaysBigCatch updateCatch){
        TodaysBigCatch existingBigCatch = repository.findById(updateCatch.getId()).orElse(null);
        if (existingBigCatch != null) {
            existingBigCatch.setFisherman(updateCatch.getFisherman());
            existingBigCatch.setFishname(updateCatch.getFishname());
            existingBigCatch.setRecordWeight(updateCatch.getRecordWeight());
        }
        return repository.save(existingBigCatch);
    }
}
