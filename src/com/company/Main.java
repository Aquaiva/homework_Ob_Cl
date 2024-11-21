package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
	Author fromm = new Author("Erich", "Fromm");
    Author huxley = new Author("Aldous", "Huxley");

    Book theSaneSociety = new Book("The Sane Society", fromm, 1955);
        Book theSaneSociety1 = new Book("The Sane Society", fromm, 1955);
    Book braveNewWorld = new Book("Brave New World", huxley, 1932);

        System.out.println(theSaneSociety.equals(theSaneSociety1));
        System.out.println(theSaneSociety.equals(braveNewWorld));

    braveNewWorld.setPublicationYear(2020);
        System.out.println(braveNewWorld.getTitle() + " " + braveNewWorld.getPublicationYear());

        System.out.println(theSaneSociety);
        System.out.println(theSaneSociety.hashCode());
        System.out.println(fromm);


    }


}
