package com.company;

import com.company.creat.Staff;
import com.company.structural.Management;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        Staff[] listStaff = new Staff[2];
        // write your code here
        Management management = new Management();
        management.addStaff(listStaff);
        management.showInfo(listStaff);
    }
}
