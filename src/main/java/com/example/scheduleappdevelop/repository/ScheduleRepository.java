package com.example.scheduleappdevelop.repository;

import com.example.scheduleappdevelop.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {

    default Schedule findScheduleById(Long id) {

        return findById(id).orElseThrow(() -> new IllegalArgumentException("잘못된 입력입니다."));
    }
}
