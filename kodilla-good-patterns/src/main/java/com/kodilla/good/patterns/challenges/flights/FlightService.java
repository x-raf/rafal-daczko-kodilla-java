package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class FlightService {

    private List<Flight> getFlights() {
        List<Flight> flights = new ArrayList<>();

        flights.add(new Flight("Katowice", "Warszawa"));
        flights.add(new Flight("Lublin", "Warszawa"));
        flights.add(new Flight("Łódź", "Kraków"));
        flights.add(new Flight("Gdańsk", "Poznań"));
        flights.add(new Flight("Poznań", "Warszawa"));

        return flights;
    }

    public List<Flight> getFlightsFrom(String city) {
        return getFlights().stream()
                .filter(f -> f.getDeparture().equals(city))
                .collect(Collectors.toList());
    }

    public List<Flight> getFlightsTo(String city) {
        return getFlights().stream()
                .filter(f -> f.getArrival().equals(city))
                .collect(Collectors.toList());
    }

    public List<Flight> getFlightsVia(String from, String via, String to) {
        List<Flight> result = getFlights().stream()
                .filter(f -> f.getDeparture().equals(from))
                .filter(f -> f.getArrival().equals(via))
                .collect(Collectors.toList());
        result.addAll(getFlights().stream()
                .filter(f -> f.getDeparture().equals(via))
                .filter(f -> f.getArrival().equals(to))
                .collect(Collectors.toList()));
        return result;
    }
}
