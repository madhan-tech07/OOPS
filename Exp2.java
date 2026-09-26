package currency; 

import java.util.*;
import java.text.DecimalFormat; 

public class CurrencyConvertor {
    double rupee, dollar, euro, yen;
    Scanner sc = new Scanner(System.in);
    DecimalFormat f = new DecimalFormat("##.###"); 

    public void convertInrToEuro() {
        System.out.println("Enter amount in rupees");
        rupee = sc.nextFloat();
        euro = rupee / 80;
        System.out.println("Euro : " + f.format(euro));
    } 

    public void convertEuroToInr() {
        System.out.println("Enter amount in Euro");
        euro = sc.nextFloat();
        rupee = euro * 80;
        System.out.println("Rupees : " + f.format(rupee));
    } 

    public void convertInrToDollar() {
        System.out.println("Enter amount in rupees");
        rupee = sc.nextFloat();
        dollar = rupee / 66;
        System.out.println("Dollar : " + f.format(dollar));
    } 

    public void convertDollarToInr() {
        System.out.println("Enter amount in Dollar");
        dollar = sc.nextFloat();
        rupee = dollar * 66;
        System.out.println("Rupees : " + f.format(rupee));
    } 

    public void convertInrToYen() {
        System.out.println("Enter amount in rupees");
        rupee = sc.nextFloat();
        yen = rupee / 0.61;
        System.out.println("Yen : " + f.format(yen));
    } 

    public void convertYenToInr() {
        System.out.println("Enter amount in Yen");
        yen = sc.nextFloat();
        rupee = yen * 0.61;
        System.out.println("Rupees : " + f.format(rupee));
    }
} 

package distance; 

import java.util.*;
import java.text.DecimalFormat; 

public class DistanceConvertor {
    double meter, km, miles;
    Scanner sc = new Scanner(System.in);
    DecimalFormat f = new DecimalFormat("##.###"); 

    public void convertMeterToKm() {
        System.out.println("Enter the meter");
        meter = sc.nextFloat();
        km = meter * 0.001;
        System.out.println("Kilometer : " + f.format(km));
    } 

    public void convertKmToMeter() {
        System.out.println("Enter the Kilometer");
        km = sc.nextFloat();
        meter = km / 0.001;
        System.out.println("Meter : " + f.format(meter));
    } 

    public void convertMilesToKm() {
        System.out.println("Enter the miles");
        miles = sc.nextFloat();
        km = miles * 1.6093;
        System.out.println("Kilometer : " + f.format(km));
    } 

    public void convertKmToMiles() {
        System.out.println("Enter the Kilometer");
        km = sc.nextFloat();
        miles = km / 1.6093;
        System.out.println("Miles : " + f.format(miles));
    }
} 

package time; 

import java.util.*;
import java.text.DecimalFormat; 

public class TimeConvertor {
    double hour, minute, second;
    Scanner sc = new Scanner(System.in);
    DecimalFormat f = new DecimalFormat("##.###"); 

    public void convertHourToMinute() {
        System.out.println("Enter the Hour");
        hour = sc.nextFloat();
        minute = hour * 60;
        System.out.println("Minutes : " + f.format(minute));
    } 

    public void convertMinuteToHour() {
        System.out.println("Enter the Minute");
        minute = sc.nextFloat();
        hour = minute / 60;
        System.out.println("Hours : " + f.format(hour));
    } 

    public void convertHourToSeconds() {
        System.out.println("Enter the Hour");
        hour = sc.nextFloat();
        second = hour * 3600;
        System.out.println("Seconds : " + f.format(second));
    } 

    public void convertSecondsToHour() {
        System.out.println("Enter the Seconds");
        second = sc.nextFloat();
        hour = second / 3600;
        System.out.println("Hours : " + f.format(hour));
    }
} 

import currency.*;
import distance.*;
import time.*;
import java.util.Scanner; 

public class Convertor {
    public static void main(String[] args) { 

        int code, currency_code, distance_code, time_code; 

        Scanner sc = new Scanner(System.in); 

        CurrencyConvertor currency = new CurrencyConvertor();
        DistanceConvertor distance = new DistanceConvertor();
        TimeConvertor time = new TimeConvertor(); 

        System.out.println("Enter the code");
        System.out.println("1: Currency");
        System.out.println("2: Distance");
        System.out.println("3: Time"); 

        code = sc.nextInt(); 

        if (code == 1) { 

            System.out.println("Enter the Currency code");
            System.out.println("1: Euro");
            System.out.println("2: Dollar");
            System.out.println("3: Yen"); 

            currency_code = sc.nextInt(); 

            if (currency_code == 1) {
                currency.convertInrToEuro();
                currency.convertEuroToInr();
            }
            else if (currency_code == 2) {
                currency.convertInrToDollar();
                currency.convertDollarToInr();
            }
            else if (currency_code == 3) {
                currency.convertInrToYen();
                currency.convertYenToInr();
            }
            else {
                System.out.println("Invalid Code");
            }
        } 

        else if (code == 2) { 

            System.out.println("Enter the Distance code");
            System.out.println("1: Meter to Kilometer");
            System.out.println("2: Miles to Kilometer");
            System.out.println("3: Kilometer to Meter");
            System.out.println("4: Kilometer to Miles"); 

            distance_code = sc.nextInt(); 

            if (distance_code == 1) {
                distance.convertMeterToKm();
            }
            else if (distance_code == 2) {
                distance.convertMilesToKm();
            }
            else if (distance_code == 3) {
                distance.convertKmToMeter();
            }
            else if (distance_code == 4) {
                distance.convertKmToMiles();
            }
            else {
                System.out.println("Invalid Code");
            }
        } 

        else if (code == 3) { 

            System.out.println("Enter the Time code");
            System.out.println("1: Hour to Minute");
            System.out.println("2: Hour to Seconds"); 

            time_code = sc.nextInt(); 

            if (time_code == 1) {
                time.convertHourToMinute();
                time.convertMinuteToHour();
            }
            else if (time_code == 2) {
                time.convertHourToSeconds();
                time.convertSecondsToHour();
            }
            else {
                System.out.println("Invalid Code");
            }
        } 

        else {
            System.out.println("Invalid Code");
        } 

        sc.close();
    }
}