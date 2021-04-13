package com.company.structural;

import com.company.creat.Staff;

import java.lang.reflect.Array;

public interface Action {
    double SALARY_BASE = 8 * 200000;
    double BONUS = 1000000;
    double FINED = 100000;

    void showInfo(Staff[] listStaff);

    void calWageFull();

    void calWagePart();

    Staff[] addStaff(Staff[] arrays);

    Staff inputInfo();

    double totalWageStaffPart(Staff[] arrays);

   Staff[] listedStaffFullWageDownMedium(Staff[] arrays);
}
