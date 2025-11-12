package main.java.com.fezor.structural.adapter.fitSquareIntoRoundExample;

import main.java.com.fezor.structural.adapter.fitSquareIntoRoundExample.adapters.SquarePegAdapter;
import main.java.com.fezor.structural.adapter.fitSquareIntoRoundExample.round.RoundHole;
import main.java.com.fezor.structural.adapter.fitSquareIntoRoundExample.round.RoundPeg;
import main.java.com.fezor.structural.adapter.fitSquareIntoRoundExample.square.SquarePeg;

public class Main {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);

        if(hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSquarePeg = new SquarePeg(2);
        SquarePeg largeSquearePeg = new SquarePeg(20);

        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquearePeg);

        if(hole.fits(smallSquarePegAdapter)){
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if(!hole.fits(largeSquarePegAdapter)){
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}
