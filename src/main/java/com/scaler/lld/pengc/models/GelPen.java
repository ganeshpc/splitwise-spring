package com.scaler.lld.pengc.models;

public class GelPen extends Pen {
    private Refill refill;

    @Override
    public void write() {
        System.out.println("Gel writes");
    }


}
