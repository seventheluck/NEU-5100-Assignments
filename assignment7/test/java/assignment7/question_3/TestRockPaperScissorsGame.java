package assignment7.question_3;

import assignments.assignment7.question_3.Paper;
import assignments.assignment7.question_3.Rock;
import assignments.assignment7.question_3.Scissors;
import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRockPaperScissorsGame {

    @Test
    void scissorsTest1() {
        Scissors s = new Scissors(5);
        Paper p = new Paper(7);
        assertEquals(s.fight(p), true);
        assertEquals(p.fight(s), false);
    }

    @Test
    void scissorsTest2() {
        Paper p = new Paper(7);
        Rock r = new Rock(15);
        assertEquals(r.fight(p), true);
        assertEquals(p.fight(r), false);
    }

    @Test
    void scissorsTest3() {
        Scissors s = new Scissors(5);
        Rock r = new Rock(3);
        assertEquals(s.fight(r), false);
        assertEquals(r.fight(s), true);
    }

    @Test
    void scissorsTest4() {
        Scissors s = new Scissors(5);
        Paper p = new Paper(10);
        assertEquals(s.fight(p), false);
        assertEquals(p.fight(s), false);
    }

    @Test
    void scissorsTest5() {
        Paper p = new Paper(5);
        Rock r = new Rock(10);
        assertEquals(r.fight(p), false);
        assertEquals(p.fight(r), false);
    }

    @Test
    void scissorsTest6() {
        Scissors s = new Scissors(6);
        Rock r = new Rock(3);
        assertEquals(s.fight(r), false);
        assertEquals(r.fight(s), false);
    }
}
