package com.company;

import java.util.ArrayList;

public class Folder implements Composite{
    private final String name;
    private final String type;

    ArrayList<Composite> compositeList = new ArrayList<Composite>();

    Folder(String name, String type){
        this.name = name;
        this.type = type;
    }

    public String showDetails() {
        return "Name: " + this.name + " Type: " + this.type;
    }

    public String showAllDetails(){
        StringBuilder str = new StringBuilder("Contents: \n");
        for (Composite composite: compositeList) {
            str.append(composite.showDetails()).append(", ");
        }
        return str.toString();
    }

    public void add(Composite file) {
        compositeList.add(file);
    }

    public void remove(Composite file) {
        compositeList.remove(file);
    }

    @Override
    public void singleClick() {
        System.out.println(this.showDetails());
    }

    @Override
    public void doubleClick() {
        System.out.println(this.name + " Folder is opened\n"+this.showAllDetails());
    }
}
