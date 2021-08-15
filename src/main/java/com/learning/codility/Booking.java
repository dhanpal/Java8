package com.learning.codility;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Booking {
/*
2 50
3
10 7.8
15 6.4
12 8.111
3
25 7.8
19 6.4
50 8.1

15.91

 */


    public static void main(String[] args) {
        int noOfCities, budget, noOfHotels;
        List<String> inputs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String in = scanner.nextLine();
            if (in.isEmpty()) {
                break;
            }
            inputs.add(in);
        }

        noOfCities = Integer.parseInt(inputs.get(0).split(" ")[0]);
        budget = Integer.parseInt(inputs.get(0).split(" ")[1]);

        System.out.println("noOfCities " + noOfCities);
        System.out.println("budget " + budget);
        List<City> cities = new ArrayList<>();

        for (int i = 1; i < inputs.size(); ) {
            City city = new City();
            noOfHotels = Integer.parseInt(inputs.get(i));
            city.setNoOfHotels(noOfHotels);
            List<Hotel> hotels = new ArrayList<>();
            for (int j = i + 1; j < i + 1 + noOfHotels; j++) {
                Hotel hotel = new Hotel();
                hotel.setPrice(Integer.parseInt(inputs.get(j).split(" ")[0]));
                hotel.setRating(Double.parseDouble(inputs.get(j).split(" ")[1]));
                hotels.add(hotel);
            }
            city.setHotel(hotels);
            System.out.println(city);
            i = i + 1 + noOfHotels;
            cities.add(city);
        }

        calculate(cities, budget);

    }

    private static Double calculate(List<City> cities, int budget) {
        AtomicReference<Double> rating1 = null;
        AtomicReference<Double> rating2 = null;
        AtomicInteger price1 = new AtomicInteger(Integer.MIN_VALUE);
        AtomicInteger price2 = new AtomicInteger(Integer.MIN_VALUE);

        for (City city : cities) {
            city.getHotel().forEach(hotel -> {
                if(price1.addAndGet(price2.get()) < budget){
                    price2.set(price1.get());
                    price1.set(hotel.getPrice());

                    rating2.set(rating1.get());
                    rating1.set(hotel.getRating());

                }
            });
        }

        return Double.sum(rating1.get(), rating2.get());
    }
}


@Getter
@Setter
@ToString
class Hotel {
    private Double rating;
    private Integer price;
}

@Getter
@Setter
@ToString
class City {
    private Integer noOfHotels;
    private List<Hotel> hotel;
}