package com.company.structural;

import com.company.creat.Staff;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Management extends Staff implements Action {
    int quantity;

    @Override
    public void showInfo(Staff[] listStaff) {
        for (Staff s :
                listStaff) {
            System.out.println(s);
        }
    }

    @Override
    public void calWageFull() {
        double wageF = SALARY_BASE + (BONUS - FINED);
        System.out.println(wageF);
    }

    @Override
    public void calWagePart() {
        double wageP = this.getTimeWork() * 100000;
        System.out.println(wageP);
    }

    @Override
    public Staff[] addStaff(Staff[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Enter the index " + (i + 1));
            arrays[i] = inputInfo();
        }
        return arrays;
    }

    @Override
    public Staff inputInfo() {
        Staff newStaff = new Staff();

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the name");
        newStaff.setName(sc.nextLine());

        System.out.println("enter the id");
        newStaff.setId(Integer.parseInt(sc.nextLine()));

        System.out.println("enter the age");
        newStaff.setAge(Integer.parseInt(sc.nextLine()));

        System.out.println("enter the telephone");
        newStaff.setTelephone(sc.nextLine());

        System.out.println("enter the email");
        newStaff.setEmail(sc.nextLine());

        System.out.println("enter the timeWork");
        newStaff.setTimeWork(Double.parseDouble(sc.nextLine()));

        return newStaff;

    }

    @Override
    public double totalWageStaffPart(Staff[] arrays) {
        return 0;
    }

    @Override
    public Staff[] listedStaffFullWageDownMedium(Staff[] arrays) {
        return arrays;
    }

}
