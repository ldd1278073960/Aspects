package com.dp.demo.entity;

public class Msg {

    private String name;

    private Integer agr;

    private String sex;

    public Msg() {
    }

    public Msg(String name, Integer agr, String sex) {
        this.name = name;
        this.agr = agr;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAgr() {
        return agr;
    }

    public void setAgr(Integer agr) {
        this.agr = agr;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "name='" + name + '\'' +
                ", agr=" + agr +
                ", sex='" + sex + '\'' +
                '}';
    }
}
