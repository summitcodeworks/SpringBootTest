package com.summit.codeworks.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "user_query")
@Getter
@Setter
public class UserQuery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String message;

    @Column(name = "create_on", nullable = false)
    private LocalDateTime createOn;

    @Column(name = "use_flag", nullable = false)
    private Boolean useFlag;

    @PrePersist
    protected void onCreate() {
        this.createOn = LocalDateTime.now();
        this.useFlag = true; // Set default value for useFlag when creating new entries
    }
}
