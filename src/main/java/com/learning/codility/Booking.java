package com.learning.codility;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        while (scanner.hasNext()){
            inputs.add(scanner.nextLine());
        }
        noOfCities = Integer.parseInt(inputs.get(0).split(" ")[0]);
        budget = Integer.parseInt(inputs.get(0).split(" ")[1]);
        List<City> cities = new ArrayList<>();
        for (int i = 1; i < inputs.size() ; i++){
            City city = new City();

            city.setNoOfHotels(Integer.parseInt(inputs.get(i)));
            while (city.getNoOfHotels() < 0){

            }
        }
    }
}
@Getter
@Setter
class Hotel{
    private int price;
    private double rating;
}
@Getter
@Setter
class City{
    private int noOfHotels;
    private Hotel hotel;
}