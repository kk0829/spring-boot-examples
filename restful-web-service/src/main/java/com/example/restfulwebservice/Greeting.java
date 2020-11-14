package com.example.restfulwebservice;

/**
 * @author kk
 * @date 2020-11-14 10:50
 */
public class Greeting {
    private final long id;
    private final String name;

    public Greeting(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
