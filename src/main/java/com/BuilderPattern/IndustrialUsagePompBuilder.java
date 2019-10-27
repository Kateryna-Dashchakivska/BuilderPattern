package com.BuilderPattern;

public class IndustrialUsagePompBuilder extends PompBuilder{

    @Override
    public PompSystem build () {
        pomp = new PompSystem();
        pomp.setPower(5000);
        pomp.setProducer("Spain");
        pomp.setWarranty(true);
        pomp.setSize(new PompSize(200, 300, 400));
        return pomp;
    }







}
