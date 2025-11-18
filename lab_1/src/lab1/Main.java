package lab1;

class Main {
    public static void main(String[] args) {
        Hero hero;
        hero = new Hero("Pavel");
        hero.move("home", "forest");

        hero.SetMoveStratagy(new HourseStratagy());
        hero.move("forest", "bar");

        hero.SetMoveStratagy(new FlyStratagy());
        hero.move("bar", "home");

    }
}

