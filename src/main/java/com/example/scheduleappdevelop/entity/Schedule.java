package com.example.scheduleappdevelop.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "schedule_board")
@Getter
public class Schedule extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long scheduleId;
    private String userName;
    private String title;
    private String contents;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Schedule(String userName, String title, String contents) {
        this.userName = userName;
        this.title = title;
        this.contents = contents;
    }

    public Schedule() {

    }

    public void update(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }
}
