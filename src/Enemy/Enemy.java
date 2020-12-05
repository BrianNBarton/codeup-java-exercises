package Enemy;

public class Enemy {
    private int health;

    public void Move(){
        System.out.println("this enemy can move once direction");
    }
    public void Wings(){
        System.out.println("Now I can Fly");
    }

    public void getHealth(){
        System.out.println(health);
    }
    public void setHealth(int x){
        health = x;
    }
}
