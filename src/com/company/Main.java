package com.company;

public class Main {

    public static void main(String[] args) {
	Author fromm = new Author("Erich", "Fromm");
    Author huxley = new Author("Aldous", "Huxley");

    Book theSaneSociety = new Book("The Sane Society", fromm, 1955);
    Book braveNewWorld = new Book("Brave New World", huxley, 1932);

    braveNewWorld.setPublicationYear(2020);
        System.out.println(braveNewWorld.getTitle() + " " + braveNewWorld.getPublicationYear());
    }

}
