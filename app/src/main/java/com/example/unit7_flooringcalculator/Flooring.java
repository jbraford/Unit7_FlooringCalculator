package com.example.unit7_flooringcalculator;

public class Flooring {

    Double width;
    Double height;
    Double area;

    public Flooring(double width,double height) {
        this.height = height;
        this.width = width;

    }
    public double calculateArea(double width, double height){
        area = width * height;
        return area;
    }
    public double getWidth() { return width;}
    public void setWidth(double width) {this.width = width;}
    public double getHeight() {return height;}
    public void setHeight(double height) {this.height = height;}

}
