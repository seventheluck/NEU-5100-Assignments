package assignments.assignment7.question_3;

/* Implement class Scissors */
public class Scissors extends Tool {

    public Scissors(int strength) {
        super.strength = strength;
        super.type = 's';
    }

    public boolean fight(Tool tool) {
        if (tool.type == 'r') {
            return this.strength - 2 * tool.strength > 0;
        } else if (tool.type == 'p') {
            return this.strength * 2 - tool.strength > 0;
        } else {
            return true;
        }
    }
}
