package assignments.assignment6.c;

public class Pet {

    public static final int MALE = 1;
    public static final int FEMALE = 2;
    public static final int SPAYED = 3;
    public static final int NEUTERED = 4;
    protected int sex;
    private String petName;
    private String ownerName;
    private String color;

    public Pet(String name, String ownerName, String color) {
        this.petName = name;
        this.ownerName = ownerName;
        this.color = color;
    }

    public String getPetName() {
        return this.petName;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public String getColor() {
        return this.color;
    }

    public String getSex() {
        if (this.sex == 1) {
            return "MALE";
        } else if (this.sex == 2) {
            return "FEMALE";
        } else if (this.sex == 3) {
            return "SPAYED";
        } else if (this.sex == 4) {
            return "NEUTERED";
        }
        return "";
    }

    public void setSex(int sexid) {
        this.sex = sexid;
    }

    public String toString() {
        String result = this.getPetName() + ", owned by " + this.getOwnerName() + "\n" + "Color: " + this.getColor() + "\nSex: " + this.getSex();
        //name, owner’s name, age, color, and gender (use getSex());
        return result;
    }
}
