package com.example.demo.nationalize;

public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.printf("Usage: java %s <name>%n", Main.class.getName());
            System.exit(1);
        }
        var client = NationalizeClient.newInstance();
        var nationality = client.getNationality(args[0]);
        System.out.println(nationality);
    }

}
