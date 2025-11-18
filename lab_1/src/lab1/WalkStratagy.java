package lab1;

public class WalkStratagy implements MoveStratagy {
    @Override
    public void move(String a, String b) {
        System.out.println("walking from " + a + " to " + b);
    }
}
