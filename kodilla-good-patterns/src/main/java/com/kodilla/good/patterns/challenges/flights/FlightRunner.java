package com.kodilla.good.patterns.challenges.flights;

public class FlightRunner {
    public static void main(String[] args) {
        FlightService flightService = new FlightService();
        flightService.getFlightsFrom("Warszawa").forEach(System.out::println);
        flightService.getFlightsTo("Katowice").forEach(System.out::println);
        flightService.getFlightsVia("Warszawa","Poznań","Gdańsk").forEach(System.out::println);
    }
}
