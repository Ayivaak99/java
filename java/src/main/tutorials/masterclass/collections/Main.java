package main.tutorials.masterclass.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);

        seatCopy.get(1).reserve();
        if (theatre.reserveSeat("A02")) {
            System.out.println("Please pay");
        }
        else {
            System.out.println("Sorry, this seat is taken!");

        }

        Collections.shuffle(seatCopy);
        System.out.println("Printing seatCopy");
        printList(seatCopy);
        System.out.println("Printing theatre.seats");
        printList(theatre.seats);

        sortList(seatCopy);
        System.out.println("Printing sorted seatCopy");
        printList(seatCopy);

//        theatre.getSeats();
//        if (theatre.reserveSeat("B14")) {
//            System.out.println("Please pay");
//        }
//        else {
//            System.out.println("Sorry, this seat is taken!");
//        }
//
//        if (theatre.reserveSeat("D12")) {
//            System.out.println("Please pay");
//        }
//        else {
//            System.out.println("Sorry, this seat is taken!");
//        }
    }

    public static void printList(List<Theatre.Seat> list) {
        System.out.println("#########################################");
        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("#########################################");
    }

    public static void sortList(List<? extends Theatre.Seat> list) {
        for (int i = 0; i< list.size() - 1; i++){
            for (int j= i+1; j< list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    Collections.swap(list, i, j);
                }
            }
        }
    }
}
