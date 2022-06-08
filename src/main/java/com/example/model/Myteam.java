package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Myteam {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private int id;
    private String name;
    private String vorname;
    private int groesse;
    private String club;
    private int alter;
    private String nationalitaet;


    public Myteam(int id, String name, String vorname, int groesse, String club, int alter, String nationalitaet) {
        this.id = id;
        this.name = name;
        this.vorname = vorname;
        this.groesse = groesse;
        this.club = club;
        this.alter = alter;
        this.nationalitaet = nationalitaet;

    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public int getGroesse() {
        return groesse;
    }

    public void setGroesse(int groesse) {
        this.groesse = groesse;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getNationalitaet() {
        return nationalitaet;
    }

    public void setNationalitaet(String nationalitaet) {
        this.nationalitaet = nationalitaet;
    }




}
