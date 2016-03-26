package com.clearfaun.design.patterns;

public class Main {

    public static void main(String[] args) {
	// write your code here


        System.out.println("hello world");



        //I run a farm
        //I have one in New York and one in California
        //I raise pigs
        //I have a great recpee for pig food
        //I grow all the ingrediants
        //on my two farms I grow the same items
        //becuase the farms are in diferent places the items are the same type but may be a little difrent
        //for example, I grow tomatoes but the two lots I grow are difrent sorts of tamatos



        //this is my new york farm
        //it specifies all my ingrediants
        FarmFactory nyFarm = new NewYorkFarmFactory();
        //I put my ingrediants into my pig food recepee
        //my pig food has the same ingrediants on  both farms but comes out
        //a little difrent
        //pig food remains the same but I can change it with FarmFactory
        //pig food has three ingrediants , tamotoes, corn and water
        PigFood nyPigFood = new PigFood(nyFarm);
        //here is me making my pig food
        nyPigFood.makePigFood();

        FarmFactory CaliFarm = new CalifornianFarmFactory();
        //pig food remains the same but I can change it with FarmFactory
        PigFood caliPigFood = new PigFood(CaliFarm);
        caliPigFood.makePigFood();









        //output
        //My pig food is made with Heirloom tomatos, Yello corn on the cob, Hard water
        //My pig food is made with Big Green tomatoes, Small red and black corn, Soft water
    }
}
