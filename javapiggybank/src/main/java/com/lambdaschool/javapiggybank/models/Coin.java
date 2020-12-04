package com.lambdaschool.javapiggybank.models;

import javax.persistence.*;

@Entity
@Table(name = "coins")
public class Coin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long coinid;

    private int countcount;
    private int facevalue;
    private String name;
    private String pluralname;

    public Coin() {
    }

    public Coin(int countcount, int facevalue, String name, String pluralname) {
        this.countcount = countcount;
        this.facevalue = facevalue;
        this.name = name;
        this.pluralname = pluralname;
    }

    public long getCoinid() {
        return coinid;
    }

    public void setCoinid(long coinid) {
        this.coinid = coinid;
    }

    public int getCountcount() {
        return countcount;
    }

    public void setCountcount(int countcount) {
        this.countcount = countcount;
    }

    public int getFacevalue() {
        return facevalue;
    }

    public void setFacevalue(int facevalue) {
        this.facevalue = facevalue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPluralname() {
        return pluralname;
    }

    public void setPluralname(String pluralname) {
        this.pluralname = pluralname;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "coinid=" + coinid +
                ", countcount=" + countcount +
                ", facevalue=" + facevalue +
                ", name='" + name + '\'' +
                ", pluralname='" + pluralname + '\'' +
                '}';
    }
}
