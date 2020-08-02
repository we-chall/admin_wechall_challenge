package com.wechall.admin.common;

public enum Result {
    SUCCESS("SUCCESS"),
    FAIL("FAIL");

    private String result;

    private Result(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }
}