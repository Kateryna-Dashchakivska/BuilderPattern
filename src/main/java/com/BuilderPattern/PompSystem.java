package com.BuilderPattern;

public class PompSystem {

    private PompSize size;
    private double power;
    private double pressure;
    private boolean warranty;
    private String producer;
    private String type;

    public double getPower() {
        return power;
    }
    public PompSize getSize() {
        return size;
    }
    public double getPressure() {
        return pressure;
    }
    public boolean isWarranty() {
        return warranty;
    }
    public String getProducer() {
        return producer;
    }
    public String getType() {
        return type;
    }

    public void setPower(double power) {
        this.power = power;
    }
    public void setSize(PompSize size) { this.size = size; }
    public void setPressure(double pressure) {
        this.pressure = pressure;
    }
    public void setWarranty(boolean warranty) {
        this.warranty = warranty;
    }
    public void setProducer(String producer) { this.producer = producer; }
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "PompSystem{" +
                "size=" + size +
                ", power=" + power +
                ", pressure=" + pressure +
                ", warranty=" + warranty +
                ", producer='" + producer + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}