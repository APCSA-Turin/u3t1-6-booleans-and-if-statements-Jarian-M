public class Main3 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Spot", 10, false);
    Dog dog2 = new Dog("Petunia", 12, true);
    Dog dog3 = new Dog("Lucky", 3, false);
    Dog dog4 = new Dog("Spot", 5, true);
    Dog dog5 = new Dog("Petunia", 12, true);

    System.out.println("-- Set A --");
    System.out.println(dog1 == dog2);
    System.out.println(dog1 == dog3);
    System.out.println(dog1 == dog4);
    System.out.println(dog2 == dog5);

    // create reference variables dog6, dog7, dog8
    Dog dog6 = dog1;  
    Dog dog7 = dog2;
    Dog dog8 = dog6;

    System.out.println("-- Set B --");
    System.out.println(dog1 == dog6);
    System.out.println(dog2 == dog7);
    System.out.println(dog6 == dog8);
    System.out.println(dog1 == dog8);

    dog1 = null;
    System.out.println("-- Set C --");
    System.out.println(dog1 == dog6);
    System.out.println(dog2 == dog7);
    System.out.println(dog6 == dog8);
    System.out.println(dog1 == dog8);
    System.out.println(dog1 == null);
    System.out.println(dog6 != dog8);

    }
}
