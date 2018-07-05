package com.test.classes;

public class Rectangle extends Shape {

    int mWidth;
    int mHeight;

    public Rectangle(int sideLength) {
        mHeight = sideLength;
        mWidth = sideLength;
    }
    //overloading
    public Rectangle(int width, int height) {
        mWidth = width;
        mHeight = height;
    }

    public int getmHeight() {
        return mHeight;
    }

    public int getmWidth() {
        return mWidth;
    }

    public void setmHeight(int height) {
        mHeight = height;
    }

    public void setmWidth(int width) {
        mWidth = width;
    }

    @Override
    public void calcArea(int width, int height) {
        mArea = width * height;
    }
}
