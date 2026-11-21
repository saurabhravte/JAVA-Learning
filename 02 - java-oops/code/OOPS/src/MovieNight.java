interface Watchable {
    void watch();
}

abstract class Movie implements Watchable {
    String title;

    Movie(String title){
        this.title = title;
    }
}

class ActionMovie extends Movie {
    ActionMovie(String title){
        super(title);
    }

    @Override
    public void watch(){
        System.out.println("Watching movie " + title);
    }
}

class ComedyMovie extends Movie {
    ComedyMovie(String title){
        super(title);
    }

    @Override
    public void watch(){
        System.out.println("Watching movie " + title);
    }
}

public class MovieNight {
    static void main() {
        Movie action = new ActionMovie("Inception");
        Movie comedy = new ComedyMovie("Superbad");

        action.watch();
        comedy.watch();
    }
}
