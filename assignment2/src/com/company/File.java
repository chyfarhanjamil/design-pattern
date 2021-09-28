package com.company;

public class File implements Composite{
    String name;
    String type;

    File(String name,String type){
        this.name = name;
        this.type = type;
    }

    @Override
    public String showDetails() {
        return "Filename: " + this.name + " Type: " + this.type;
    }

    @Override
    public void singleClick() {
        System.out.println(this.showDetails());
    }

    @Override
    public void doubleClick() {
        System.out.println(this.name + " File is opened");
    }
}
