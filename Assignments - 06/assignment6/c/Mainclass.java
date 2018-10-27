package assignments.assignment6.c;

public class Mainclass {

    public static void main(String[] args) {

        //dog
        System.out.println("\n====== DOG =========");
        Dog penpen = new Dog("Penpen", "Ma", "Yellow", "30");
        Dog meimei = new Dog("Meimei", "Ma", "Yellow", "27");
        Dog wanzi = new Dog("Wanzi", "Ma", "Yellow", "25");

        penpen.setSex(Pet.MALE);
        meimei.setSex(Pet.FEMALE);
        wanzi.setSex(Pet.FEMALE);
        System.out.println("======get size=========");
        System.out.println(penpen.getSize());
        System.out.println(meimei.getSize());
        System.out.println(wanzi.getSize());
        System.out.println("\n======to string=========");
        System.out.println(penpen.toString());
        System.out.println(meimei.toString());
        System.out.println(wanzi.toString());
        System.out.println("\n======bording or not=========");

        penpen.setBoardStart(7, 10, 2018);
        penpen.setBoardEnd(7, 20, 2018);

        meimei.setBoardStart(7, 11, 2018);
        meimei.setBoardEnd(8, 11, 2018);

        wanzi.setBoardStart(2, 29, 2018);// Wrong date;
        wanzi.setBoardEnd(3, 2, 2018);

        System.out.println(penpen.boarding(7, 11, 2018));
        System.out.println(meimei.boarding(8, 11, 2018));
        System.out.println(meimei.boarding(8, 12, 2018));
        System.out.println(wanzi.boarding(3, 1, 2018));
        System.out.println(wanzi.boarding(3, 3, 2018));
        System.out.println(wanzi.boarding(2, 28, 2018));


        //cat
        System.out.println("\n====== CAT =========");
        Cat nini = new Cat("Nini", "Ma", "Yellow", "5");
        Cat huahua = new Cat("Huahua", "Ma", "White", "3");
        Cat honghong = new Cat("Honghong", "Ma", "Red", "2");

        nini.setSex(Pet.MALE);
        huahua.setSex(Pet.FEMALE);
        honghong.setSex(Pet.FEMALE);
        System.out.println("======get Hair Length=========");
        System.out.println(nini.getHairLength());
        System.out.println(huahua.getHairLength());
        System.out.println(honghong.getHairLength());
        System.out.println("\n======to string=========");
        System.out.println(nini.toString());
        System.out.println(huahua.toString());
        System.out.println(honghong.toString());
        System.out.println("\n======bording or not=========");

        nini.setBoardStart(7, 10, 2018);
        nini.setBoardEnd(7, 20, 2018);

        huahua.setBoardStart(7, 11, 2018);
        huahua.setBoardEnd(8, 11, 2018);

        honghong.setBoardStart(2, 28, 2018);
        honghong.setBoardEnd(3, 2, 2018);

        System.out.println(nini.boarding(7, 11, 2018));
        System.out.println(huahua.boarding(8, 11, 2018));
        System.out.println(huahua.boarding(8, 12, 2018));
        System.out.println(honghong.boarding(3, 1, 2018));
        System.out.println(honghong.boarding(3, 3, 2018));
        System.out.println(honghong.boarding(2, 28, 2018));

    }
}
