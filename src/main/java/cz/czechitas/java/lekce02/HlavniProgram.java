package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();

        for (int i = 0; i < 4; i++) {
            zofka.turnRight(90);
            zofka.move(100);
        }
        for (int i = 0; i < 2; i++) {
            zofka.turnRight(60);
            zofka.move(60);
        }

        zofka.turnLeft(30);
        zofka.penUp();
        zofka.move(200);
        zofka.penDown();



        for (int i = 0; i < 4; i++) {
            zofka.move(100);
            zofka.turnRight(90);
        }
        zofka.turnLeft(240);
        zofka.move(60);
        zofka.turnLeft(60);
        zofka.move(80);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnLeft(105);
        zofka.move(20);







    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
