package Interfacerules;

import Interfaces.HasName;

public class TrainerMain {

    public static void main(String[] args) {
        HasName hasName = new Trainer();
        hasName.getName();


        CanWork canwork = new Trainer();
        canwork.doWork();

        System.out.println(EmployeeType.FULL_TIME);
    }
}
