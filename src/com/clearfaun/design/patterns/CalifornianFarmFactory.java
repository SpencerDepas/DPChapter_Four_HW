package com.clearfaun.design.patterns;

/**
 * Created by SpencerDepas on 3/26/16.
 */
public class CalifornianFarmFactory extends FarmFactory {
    @Override
    String tomato() {
        return "Big Green tomatoes";
    }

    @Override
    String corn() {
        return "Small red and black corn";
    }

    @Override
    String water() {
        return "Soft water";
    }
}
