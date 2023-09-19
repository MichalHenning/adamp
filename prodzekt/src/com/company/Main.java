package com.company;


public class Main {

    public static void main(String[] args) {
        LiczbaHolder lh1 = new LiczbaHolder(19);
        LiczbaHolder lh2 = new LiczbaHolder(44  );
        System.out.println(lh1.getA());
        lh1.setA(10);
        System.out.println(lh1.getA());

        GenericHolder<Integer> gh1 = new GenericHolder(12);
        System.out.println(gh1.getA());
        gh1.setA(2);
        System.out.println(gh1.getA());


        ObjectHolder oh1 = new ObjectHolder(new Car());
        System.out.println(oh1.getA());
        oh1.setA(new Car()  );
        System.out.println((int)oh1.getA()+1);
    }
}
