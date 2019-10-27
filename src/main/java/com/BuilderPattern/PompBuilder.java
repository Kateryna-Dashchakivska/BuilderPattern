package com.BuilderPattern;

public abstract class PompBuilder {

    protected PompSystem pomp;

    public PompSystem build() {
        return new PompSystem();
    }




}
