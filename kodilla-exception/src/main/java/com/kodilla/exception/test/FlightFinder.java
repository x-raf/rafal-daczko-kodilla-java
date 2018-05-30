package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException{
        Map<String,Boolean> airports = new HashMap<>();

        airports.put("Paryż-PAR",true);
        airports.put("Warszawa-WAW", true);
        airports.put("Londyn-LCY",true);
        airports.put("Rzym-ROM",true);
        airports.put("Dublin-DUB",false);
        airports.put("Madryt-MAD",false);

        if (!airports.containsKey(flight.getArrivalAirport()))
            throw new RouteNotFoundException("Flight not found exception caught.");
        System.out.println("Lot z " + flight.getDepartureAirport() + " do " + flight.getArrivalAirport() + " znaleziony.");
    }

    public static void main(String[] args) {

        Flight flight = new Flight("Warszawa-WAW", "Wrocław-WRO");
        Flight flight1 = new Flight("Rzym-ROM", "Londyn-LCY");
        FlightFinder finder = new FlightFinder();

        try {
            finder.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Niestety brak takiego połączenia. " + e);
        }
    }
}
