package com.BuilderPattern;

public class CustomerDirector {

    public PompBuilder pompBuilder;

    public PompSystem getIndustrialPomp(){
        pompBuilder = new IndustrialUsagePompBuilder();
        return pompBuilder.build();
    }

    public PompSystem getPersonalPomp(){
        pompBuilder = new PersonalPompBuilder();
        return pompBuilder.build();
    }



}
