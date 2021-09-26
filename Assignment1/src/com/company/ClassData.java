package com.company;
import java.util.ArrayList;

public class ClassData implements ClassDataInterface{
    private ArrayList<ObserverInterface> observerInterfaceList = new ArrayList<>();

    private Time time;
    private String courseNo, topicName, teacherName;


    public void registerObserver(ObserverInterface observerInterface){
        observerInterfaceList.add(observerInterface);
    }

    public void removeObserver(ObserverInterface observerInterface){
        observerInterfaceList.remove(observerInterface);
    }

    public void notifyObservers(){
        for(ObserverInterface observerInterface : observerInterfaceList){
            observerInterface.update(courseNo, time, topicName, teacherName);
        }
    }

    public void assignNewClass(String courseNo, String formattedTime, String topicName, String teacherName){
        time = new Time(formattedTime);
        this.courseNo = courseNo;
        this.topicName = topicName;
        this.teacherName = teacherName;

        notifyObservers();
    }
}
