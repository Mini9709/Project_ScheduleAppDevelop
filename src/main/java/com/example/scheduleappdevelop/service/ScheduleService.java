package com.example.scheduleappdevelop.service;

import com.example.scheduleappdevelop.dto.ScheduleRequestDto;
import com.example.scheduleappdevelop.dto.ScheduleResponseDto;
import com.example.scheduleappdevelop.entity.Schedule;
import com.example.scheduleappdevelop.repository.ScheduleRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;

    public ScheduleService(ScheduleRepository scheduleRepository) {

        this.scheduleRepository = scheduleRepository;
    }

    @Transactional
    public ScheduleResponseDto createSchedule(ScheduleRequestDto dto) {

        Schedule schedule = new Schedule(dto.getUserName(), dto.getTitle(), dto.getContents());

        return ScheduleResponseDto.toDto(scheduleRepository.save(schedule));
    }

    public List<ScheduleResponseDto> findAllSchedules() {

        return scheduleRepository.findAll().stream().map(ScheduleResponseDto::toDto).toList();
    }

    public ScheduleResponseDto findById(Long id) {

        return ScheduleResponseDto.toDto(scheduleRepository.findScheduleById(id));
    }


    @Transactional
    public ScheduleResponseDto updateSchedule(Long id, ScheduleRequestDto dto) {

        Schedule schedule = scheduleRepository.findScheduleById(id);
        schedule.update(dto.getTitle(), dto.getContents());

        return ScheduleResponseDto.toDto(scheduleRepository.save(schedule));
    }

    public void deleteSchedule(Long id) {

        scheduleRepository.deleteById(id);
    }
}
