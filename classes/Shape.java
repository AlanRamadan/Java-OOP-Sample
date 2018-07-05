package com.test.classes;

public class Shape {

    int mArea;
    int mCorner;
    int mRadius;

    public Shape() {

    }

    public int getmArea() {
        return mArea;
    }

    public int getmCorner() {
        return mCorner;
    }

    public void setmArea(int area) {
        mArea = area;
    }

    public void setmCorner(int corner) {
        mCorner = corner;
    }

    public void calcArea(int x, int y) {
        mArea = 0;
    }
}
