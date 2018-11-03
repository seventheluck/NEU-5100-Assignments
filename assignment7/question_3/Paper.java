package assignments.assignment7.question_3;

/* Implement class Paper */
public class Paper extends Tool {

    public Paper(int strength) {
        super.strength = strength;
        super.type = 'p';
    }

    public boolean fight(Tool tool) {
        if (tool.type == 's') {
            return this.strength - 2 * tool.strength > 0;
        } else if (tool.type == 'r') {
            return this.strength * 2 - tool.strength > 0;
        } else {
            return true;
        }
    }
}