package com.example.tracking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tracking.model.TrackingNumberRecord;

@Repository
public interface TrackingRecordRepository extends JpaRepository<TrackingNumberRecord, Integer> {

}
