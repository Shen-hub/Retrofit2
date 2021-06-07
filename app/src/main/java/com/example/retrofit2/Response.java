package com.example.retrofit2;

public class Response {
    int total;
    Hit[] hits;

    @Override
    public String toString() {
        return "totalHits = " + total;
    }
}
