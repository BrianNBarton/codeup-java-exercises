package Enemy;

public class main {
    public static void main(String[] args) {


        Goomba goomba = new Goomba();
        KoopaTroopa koopaTroopa = new KoopaTroopa();

//        ((Enemy) goomba).Move();
//        ((Enemy) koopaTroopa).Wings();

//        goomba.Move();
//        koopaTroopa.Move();


        //allow the user to set the health and by get it printing it out
        goomba.setHealth(2);
        goomba.getHealth();



        Enemy [] enemies = {goomba, goomba, goomba, koopaTroopa};
        enemies[0].Move();
        enemies[1].Wings();
        enemies[3].Wings();

    }
}