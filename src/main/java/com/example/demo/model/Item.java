package com.example.demo.model;

public class Item {
    private Long id;
    private String name;

    public Long getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }

    public void setId(Long id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }

    public boolean equals(Long id) {
        if (this.id == id) return true;
        return false;
    }
}
