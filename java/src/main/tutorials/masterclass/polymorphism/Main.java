package main.tutorials.masterclass.polymorphism;

class Movie {
    private final String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    public String plot() {
        return "Alien attempt to take over planet earth";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    public String plot() {
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    public String plot() {
        return "Imperial forces try to take over the universe";
    }
}

class Forgettable extends Movie {
    public Forgettable() {
        super("Forgettable");
    }
}

public class Main {
    public static void main(String[] args) {
        for (int i=1; i<11; i++) {
            Movie movie = randomMovie();
            if (movie != null) {
                System.out.println("Movie #" + i + " : " + movie.getName() + "\n" +
                                    "Plot : " + movie.plot() + "\n");
            }
        }
        String x = "jha";
        String y = "abc";
        System.out.println(x.compareTo(y));
    }

    public static Movie randomMovie() {
        int random = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was : " + random);
        switch (random) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgettable();
        }
        return null;
    }
}