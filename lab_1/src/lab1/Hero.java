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

    public void move(String a, String b) {
        System.out.print(name + " is ");
        stratagy_.move(a, b);
    }
}


