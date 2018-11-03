package assignments.assignment7.question_3;

class Tool {
    protected int strength;
    protected char type;

    public void setStrength(int strength) {
        this.strength = strength;
    }
}







class RockPaperScissorsGame {
    public static void main(String args[]) {
        Scissors s = new Scissors(5);
        Paper p = new Paper(7);
        Rock r = new Rock(15);
        System.out.println(s.fight(p) + " , " + p.fight(s));
        System.out.println(p.fight(r) + " , " + r.fight(p));
        System.out.println(r.fight(s) + " , " + s.fight(r));
    }
}