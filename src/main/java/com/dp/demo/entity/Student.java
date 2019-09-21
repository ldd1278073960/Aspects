package com.dp.demo.entity;

public class Student {

    private Double higer;

    private Msg msg;

    public Student() {
    }

    public Student(Double higer, Msg msg) {
        this.higer = higer;
        this.msg = msg;
    }

    public Student(Msg msg) {
        this.msg = msg;
    }

    public Double getHiger() {
        return higer;
    }

    public void setHiger(Double higer) {
        this.higer = higer;
    }

    public Msg getMsg() {
        return msg;
    }

    public void setMsg(Msg msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Student{" +
                "higer=" + higer +
                ", msg=" + msg +
                '}';
    }
}
