package org.mjjaniec.tplinkWhip.model;


public abstract class Entity {
    private String name;
    private String ip;

    public Entity() {
    }

    public Entity(String name, String ip) {
        this.name = name;
        this.ip = ip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
