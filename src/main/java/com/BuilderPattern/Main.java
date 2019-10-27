package com.BuilderPattern;

public class Main {

    public static void main (String [] args){
        System.out.println("!!!!!!!");
        CustomerDirector romario = new CustomerDirector();
        System.out.println(romario.getIndustrialPomp());
        System.out.println("_______________________");
        System.out.println(romario.getPersonalPomp());
    }
}
