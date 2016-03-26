package com.clearfaun.design.patterns;

/**
 * Created by SpencerDepas on 3/26/16.
 */
public class NewYorkFarmFactory extends FarmFactory {
    @Override
    String tomato() {
        return "Heirloom tomatos";
    }

    @Override
    String corn() {
        return "Yello corn on the cob";
    }

    @Override
    String water() {
        return "Hard water";
    }
}
