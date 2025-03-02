package com.test.pojo;

public class CangKu {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    private int call;

    public int getCall() {
        return call;
    }

    public void setCall(int call) {
        this.call = call;
    }

    private String manager;

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    private String lei;

    public String getLei() {
        return lei;
    }

    public void setLei(String lei) {
        this.lei = lei;
    }

    private String position;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    private String storage;

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "CangKu{" +
                "id=" + id +
                ", num='" + num + '\'' +
                ", call='" + call + '\'' +
                ", manager='" + manager + '\'' +
                ", lei='" + lei + '\'' +
                ", position='" + position + '\'' +
                ", storage='" + storage + '\'' +
                '}';
    }
}
