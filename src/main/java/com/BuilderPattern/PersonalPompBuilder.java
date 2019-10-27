package com.BuilderPattern;

public class PersonalPompBuilder extends PompBuilder{

    @Override
    public PompSystem build () {
        System.out.println("It's a pomp for personal usage!");
        pomp = new PompSystem();
        pomp.setPower(1000);
        pomp.setProducer("Italy");
        pomp.setWarranty(true);
        pomp.setSize(new PompSize(20, 30, 40));
        return pomp;
    }

}
