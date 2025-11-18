package lab1;

public class Hero {
    private final String name;
    private MoveStratagy stratagy_;

    public Hero(String name){
        this.name = name;
        this.stratagy_ = new WalkStratagy();
    }

    public void SetMoveStratagy(MoveStratagy stratagy) {
        this.stratagy_ = stratagy;
    }

    public void move() {
        System.out.println(name + " is " + stratagy_);
    }
}
