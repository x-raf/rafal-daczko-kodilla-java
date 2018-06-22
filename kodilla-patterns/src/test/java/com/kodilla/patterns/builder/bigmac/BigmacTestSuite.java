package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .setBun("Sesame")
                .setBurgers(2)
                .setSauce("1000 Islands")
                .setIngredient("Onion")
                .setIngredient("Chili peppers")
                .setIngredient("Mushrooms")
                .setIngredient("Cheese")
                .setIngredient("Pickles")
                .setIngredient("Lettuce")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(6, howManyIngredients);
    }
}
