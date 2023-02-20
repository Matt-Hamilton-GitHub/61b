import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog(45, "Dexy");
        Dog d2 = new Dog(25, "Rrexy");
        Dog d3 = new Dog(15, "Toxy");
        Dog[] dogs = new Dog[]{d1,d2,d3};

        Comparator<Dog> nc = Dog.getNameComparator();
        if (nc.compare(d1,d3) > 0){
            System.out.printf(d1.getName());
        }else{
            System.out.printf(d3.getName());
        }

//        Dog largest = Collection.max(dogs);
//        System.out.println(largest.getName());
    }
}