package com.example.scheduleappdevelop.dto;

import com.example.scheduleappdevelop.entity.Schedule;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class ScheduleResponseDto {

    private final Long id;
    private final String title;
    private final String contents;
    //private final String userName;
    private final LocalDateTime createAt;
    private final LocalDateTime modifiedAt;

    public static ScheduleResponseDto toDto(Schedule schedule) {

        return new ScheduleResponseDto(schedule.getScheduleId(), schedule.getTitle(), schedule.getContents(), schedule.getCreatedAt(), schedule.getModifiedAt());
    }
}