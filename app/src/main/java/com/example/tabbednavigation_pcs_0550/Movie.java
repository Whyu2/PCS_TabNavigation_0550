package com.example.tabbednavigation_pcs_0550;

public class Movie {

    private String tittle;
    private String year;
    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Movie(String tittle, String year) {
        this.tittle = tittle;
        this.year = year;
    }


}
