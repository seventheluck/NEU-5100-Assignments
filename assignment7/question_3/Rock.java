package assignments.assignment7.question_3;

/* Implement class Rock */
public class Rock extends Tool {

    public Rock(int strength) {
        super.strength = strength;
        super.type = 'r';
    }

    public boolean fight(Tool tool) {
        if (tool.type == 'p') {
            return this.strength - 2 * tool.strength > 0;
        } else if (tool.type == 's') {
            return this.strength * 2 - tool.strength > 0;
        } else {
            return true;
        }
    }
}