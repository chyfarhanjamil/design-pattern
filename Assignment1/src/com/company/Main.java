package com.company;

public class Main {

    public static void main(String[] args) {
        ClassData classdata = new ClassData();

        ObserverInterface s1 = new StudentDisplay();
        classdata.registerObserver(s1);

        ObserverInterface s2 = new StudentDisplay();
        classdata.registerObserver(s2);

        classdata.removeObserver(s2);

        ObserverInterface t1 = new TeacherDisplay();
        classdata.registerObserver(t1);

        classdata.assignNewClass("SWE-4501", "10/07/2021, 23:57", "Observer Pattern", "abc");


    }
}
