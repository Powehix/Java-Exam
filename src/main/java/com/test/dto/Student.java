package com.test.dto;

import java.time.LocalDate;

public class Student {
    String author;
    String groupNumber;
    String variant;
    LocalDate date = LocalDate.of(2020, 12, 11);

    public Student(String author, String groupNumber, String variant) {
        this.author = author;
        this.groupNumber = groupNumber;
        this.variant = variant;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
