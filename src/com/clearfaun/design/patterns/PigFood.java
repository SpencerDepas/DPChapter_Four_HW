package com.clearfaun.design.patterns;

import javax.print.DocFlavor;

/**
 * Created by SpencerDepas on 3/26/16.
 */
public class PigFood{

    FarmFactory farmFactory;
    String tomato;
    String corn;
    String water;

    PigFood(FarmFactory farmFactory){
        this.farmFactory = farmFactory;
    }



    public void makePigFood(){
        tomato = farmFactory.tomato();
        corn = farmFactory.corn();
        water = farmFactory.water();
        System.out.println("My pig food is made with " + tomato + ", " + corn +
        ", " + water);
    }


}
