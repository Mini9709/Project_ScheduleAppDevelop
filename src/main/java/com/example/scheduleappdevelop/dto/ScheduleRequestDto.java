package com.example.scheduleappdevelop.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ScheduleRequestDto {
    private final String userName;
    private final String title;
    private final String contents;

}
