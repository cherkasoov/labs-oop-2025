package lab1;

public class FlyStratagy implements MoveStratagy{
    @Override
    public void move(String a, String b){
        System.out.println("flying from " + a + " to " + b);
    }
}
