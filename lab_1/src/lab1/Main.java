package lab1;

class Main {
    public static void main(String[] args) {
        Hero hero;
        hero = new Hero("Pavel");
        hero.move();

        hero.SetMoveStratagy(new HourseStratagy());
        hero.move();

        hero.SetMoveStratagy(new FlyStratagy());
        hero.move();

        hero.SetMoveStratagy(new WalkStratagy());
        hero.move();
    }
}

