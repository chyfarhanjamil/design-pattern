package com.company;

public class StudentDisplay implements ObserverInterface{

    @Override
    public void update(String courseNo,  Time time, String topicName, String teacherName) {

        System.out.println("Student Display");
        System.out.println("Course No: " + courseNo);
        System.out.println("Topic Name: " + topicName);
        System.out.println("Teacher: " + teacherName);
        System.out.println("Time: " + time.timeFormat12hrs());
    }

}
