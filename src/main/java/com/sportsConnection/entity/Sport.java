package com.sportsConnection.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.sql.Time;

@Data
@RequiredArgsConstructor
public class Sport {

    private final int id;
    private final String name;
    private final String sportName;
    private final Location location;
    private final Time time;
}
