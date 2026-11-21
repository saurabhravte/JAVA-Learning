interface Actor {
    void performScene(String line);
}

class BatmanRole implements Actor {
    String actorName;

    BatmanRole(String actorName) {
        this.actorName = actorName;
    }

    @Override
    public void performScene(String line) {
        System.out.println("I am Batman, played by " + actorName + ": \"" + line + "\"");
    }
}

class AmericanPsycho implements Actor {
    String actorName;

    AmericanPsycho(String actorName) {
        this.actorName = actorName;
    }

    @Override
    public void performScene(String line) {
        System.out.println("I am Patrick Bateman, played by " + actorName + ": \"" + line + "\"");
    }
}

public class ActorPoly {

    static void directScene(Actor actor, String line) {
        actor.performScene(line);   // polymorphism: the right version runs at runtime
    }

    public static void main(String[] args) {
        Actor batman = new BatmanRole("Christian Bale");
        Actor bateman = new AmericanPsycho("Christian Bale");

        directScene(batman, "I am vengeance");
        directScene(bateman, "I have to return some videotapes");
    }
}