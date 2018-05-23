package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given

        //Europe
        Country poland = (new Country("Poland", new BigDecimal("38000000")));
        Country france = (new Country("France", new BigDecimal("67000000")));
        Country germany = (new Country("Germany", new BigDecimal("80000000")));
        //North America
        Country usa = (new Country("USA", new BigDecimal("326000000")));
        Country canada = (new Country("Canada", new BigDecimal("35000000")));
        Country mexico = (new Country("Mexico", new BigDecimal("124000000")));
        //South America
        Country argentina = (new Country("Argentina", new BigDecimal("44000000")));
        Country brazil = (new Country("Brazil", new BigDecimal("207000000")));
        Country chile = (new Country("Chile", new BigDecimal("17000000")));
        //Asia
        Country china = (new Country("China", new BigDecimal("1379000000")));
        Country india = (new Country("India", new BigDecimal("1281000000")));
        Country russia = (new Country("Russia", new BigDecimal("142000000")));
        //Africa
        Country nigeria = (new Country("Nigeria", new BigDecimal("190000000")));
        Country ethiopia = (new Country("Ethiopia", new BigDecimal("105000000")));
        Country kongo = (new Country("Kongo", new BigDecimal("83000000")));

        //When
        Continent europe = new Continent();
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);

        Continent northAmerica = new Continent();
        northAmerica.addCountry(usa);
        northAmerica.addCountry(canada);
        northAmerica.addCountry(mexico);

        Continent southAmerica = new Continent();
        southAmerica.addCountry(argentina);
        southAmerica.addCountry(brazil);
        southAmerica.addCountry(chile);

        Continent asia = new Continent();
        asia.addCountry(china);
        asia.addCountry(india);
        asia.addCountry(russia);

        Continent africa = new Continent();
        africa.addCountry(nigeria);
        africa.addCountry(ethiopia);
        africa.addCountry(kongo);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(northAmerica);
        world.addContinent(southAmerica);
        world.addContinent(asia);
        world.addContinent(africa);

        //Then
        BigDecimal totalPeople = world.getPeopleQuantity();
        Assert.assertEquals(new BigDecimal("4118000000"), totalPeople);
    }
}
