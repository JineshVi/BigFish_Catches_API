package com.jinesh.bigCatchRecords.controller;

import com.jinesh.bigCatchRecords.entity.TodaysBigCatch;
import com.jinesh.bigCatchRecords.service.BigCatchServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BigCatchController {
    @Autowired
    private BigCatchServices service;

    @PostMapping("/new-big-catch")
    public TodaysBigCatch storeBigCatch(@RequestBody TodaysBigCatch bigCatch){
        return service.saveBigCatch(bigCatch);
    }
    @PostMapping("/new-big-catches")
    public List<TodaysBigCatch> storeBigCatches(@RequestBody List<TodaysBigCatch> bigCatches){
        return service.saveBigCatches(bigCatches);
    }
    @GetMapping("/big-catches")
    public List<TodaysBigCatch> obtainBigCatches(){
        return  service.getBigCatches();
    }
    @GetMapping("/big-catch/{id}")
    public TodaysBigCatch obtainBigCatchById(@PathVariable int id){
        return  service.getBigCatchById(id);
    }
    @GetMapping("/big-catch/name/{fisherman}")
    public TodaysBigCatch obtainBigCatchByFisherman(@PathVariable String fisherman){
        return  service.getBigCatchByFisherman(fisherman);
    }
    @GetMapping("/big-catch/fish/{fishname}")
    public TodaysBigCatch obtainBigCatchByFishname(@PathVariable String fishname){
        return service.getBigCatchByFishname(fishname);
    }
    @PutMapping("/update-big-catch")
    public TodaysBigCatch updateBigCatch(@RequestBody TodaysBigCatch updateCatch){
        return service.updateBigCatch(updateCatch);
    }
    @DeleteMapping("/delete-big-catch/{id}")
    public String removeBigCatch(@PathVariable int id){
        return service.deleteBigCatch(id);
    }
}
