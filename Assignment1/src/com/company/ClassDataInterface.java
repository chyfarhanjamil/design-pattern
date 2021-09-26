package com.company;

public interface ClassDataInterface {
    void registerObserver(ObserverInterface observerInterface);

    void removeObserver(ObserverInterface observerInterface);

    void notifyObservers();

    void assignNewClass(String courseNo,  String formattedTime, String topicName, String teacherName);
}
