package com.dkey.ancestor;

public class Department {

    private String depId;
    private String name;

    public Department() {
    }

    public Department(String depId, String name) {
        this.depId = depId;
        this.name = name;
    }

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
