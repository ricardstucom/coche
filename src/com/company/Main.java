package com.company;import java.util.ArrayList;import java.util.List;public class Main {    public static void main(String[] args) {	// write your code here        System.out.println("Hello World");        coche jaguar = new coche("Jaguar", "XF", "3554WRD", 4000,80000.0);        coche bmw = new coche("Bmw", "M7", "3756DTG", 8000,100000.0);        coche audi = new coche("Audi", "Q7", "9231BGJ", 7000,90000.0);        List<coche> cocheList = new ArrayList<>();        cocheList.add(jaguar);        cocheList.add(bmw);        cocheList.add(audi);        System.out.println("Muestro el Jaguar: "+cocheList.get(0));        System.out.println("Muestro el Jaguar: "+cocheList.get(1));        System.out.println("Muestro el Jaguar: "+cocheList.get(3));    }}