package assignments.assignment6.a;

public class Mainclass {

    public static void main(String[] args) {
        Mreview superman = new Mreview();
        Mreview superman2 = new Mreview();
        Mreview forrestGump = new Mreview("Forrest Gump");

        Mreview transformer = new Mreview("Transformer");
        Mreview transformer2 = new Mreview("Transformer 2");
        transformer.addRating(8);
        transformer.addRating(9);

        Mreview titanic = new Mreview("Titanic", 9);
        titanic.addRating(10);

        System.out.println("======== get title ========");
        System.out.println("superman: " + superman.getTitle());
        System.out.println("forrestGump: " + forrestGump.getTitle());
        System.out.println("transformer: " + transformer.getTitle());
        System.out.println("titanic: " + titanic.getTitle());

        System.out.println("======== addRating ========");
        System.out.println("Titanic before add rating: " + titanic.numRatings());
        titanic.addRating(10);
        System.out.println("Titanic after add rating: " + titanic.numRatings());

        System.out.println("======== aveRating ========");
        System.out.println(titanic.getTitle() + ": " + titanic.aveRating());
        System.out.println(forrestGump.getTitle() + ": " + forrestGump.aveRating());
        System.out.println(transformer.getTitle() + ": " + transformer.aveRating());
        System.out.println(superman.getTitle() + ": " + superman.aveRating());

        System.out.println("======= numRatings ========");
        System.out.println("transformer: " + transformer.numRatings());
        System.out.println("titanic: " + titanic.numRatings());
        System.out.println("forrestGump: " + forrestGump.numRatings());
        System.out.println("superman: " + superman.numRatings());

        System.out.println("======= compareTo =========");
        System.out.println("superman.compareTo(forrestGump): " + superman.compareTo(forrestGump));
        System.out.println("forrestGump.compareTo(superman): " + forrestGump.compareTo(superman));
        System.out.println("superman.compareTo(superman): " + superman.compareTo(superman));
        System.out.println("superman2.compareTo(superman): " + superman2.compareTo(superman));
        System.out.println("transformer2.compareTo(transformer): " + transformer2.compareTo(transformer));
        System.out.println("transformer2.compareTo(null): " + transformer2.compareTo(null));

        System.out.println("======= equals ========");
        System.out.println("superman.equals(forrestGump): " + superman.equals(forrestGump));
        System.out.println("superman2.equals(superman): " + superman2.equals(superman));
        System.out.println("forrestGump.equals(superman): " + forrestGump.equals(superman));
        System.out.println("forrestGump.equals(forrestGump): " + forrestGump.equals(forrestGump));
        System.out.println("transformer2.equals(transformer): " + transformer2.equals(transformer));
        System.out.println("transformer2.equals(null): " + transformer2.equals(null));

        System.out.println("======= toString ========");
        System.out.println(superman.toString());
        System.out.println(forrestGump.toString());
        System.out.println(transformer.toString());
        System.out.println(transformer2.toString());
        System.out.println(titanic.toString());
    }
}
