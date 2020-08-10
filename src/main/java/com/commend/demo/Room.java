package com.commend.demo;

public class Room {
    private final long id;
    private final String name;
    private final long roomnr;
    private final String content;

    public Room(long id, long roomnr, String name, String content) {
        this.id = id;
        this.roomnr = roomnr;
        this.name = name;
        this.content = content;

    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public long getRoomnr() {
        return roomnr;
    }

    public String getName() {
        return name;
    }
}