package com.commend.demo;

public class Room {
    private final long id;
    private final String name;
    private final long roomno;
    private final String content;

    public Room(long id, long roomno, String name, String content) {
        this.id = id;
        this.roomno = roomno;
        this.name = name;
        this.content = content;

    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public long getRoomno() {
        return roomno;
    }

    public String getName() {
        return name;
    }
}