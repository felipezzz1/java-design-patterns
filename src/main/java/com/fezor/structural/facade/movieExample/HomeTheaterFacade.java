package main.java.com.fezor.structural.facade.movieExample;

public class HomeTheaterFacade {
    private Light light;
    private Sound sound;
    private TV tv;

    public HomeTheaterFacade() {
        light = new Light();
        sound = new Sound();
        tv = new TV();
    }

    public void watchMovie(){
        light.off();
        sound.on();
        tv.on();
        System.out.println("Watching a movie...");
    }

    public void stopWatchingMovie(){
        System.out.println("Stop Watching the Movie...");
        tv.off();
        sound.off();
        light.on();
    }
}
