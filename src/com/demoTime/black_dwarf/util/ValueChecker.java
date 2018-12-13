package com.demoTime.black_dwarf.util;

public class ValueChecker {

    public boolean checkNullOrEmpty(String name) {
        return name != null && !name.trim().equals("");
    }

    public boolean checkNegVal(int val) {
        return val < 0;
    }
}
