package com.scaler.lld.pengc.models;

import com.scaler.lld.pen.strategies.WritingStrategy;

public abstract class Pen {
    private String name;
    private String brand;
    private Double price;
    private WritingStrategy writingStrategy;

    public abstract void write();
}
