package main.java.com.fezor.structural.facade.movieExample;

public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.watchMovie();

        homeTheaterFacade.stopWatchingMovie();
    }
}
