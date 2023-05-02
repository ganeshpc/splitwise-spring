package com.scaler.lld.parkinglotgc.models;

public class Invoice {
    private String id;
    private String exitTime;
    private ParkingTicket parkingTicket;
    private int amount;
    private Payment payment;
    private PaymentStatus paymentStatus;
}
