import java.util.Comparator;

public class Dog implements Comparable<Dog>{

    private int size;
    private String name;

    public Dog(int x, String  n){
        this.name = n;
        this.size = x;
    }


    public String getName(){
        return this.name;
    }
    public static Dog maxDog(Dog[] dogs){
        if(dogs == null || dogs.length == 0){
            return null;
        }
         Dog maxDog = dogs[0];
        for (Dog d: dogs){
            if(d.size > maxDog.size){
                maxDog = d;
            }
        }
        return maxDog;
    }

    public int compareTo(Dog uddaDog){
        return this.size - uddaDog.size;

    }

   private static class NameComparator implements Comparator<Dog>{
       public int compare(Dog a, Dog b){
            return a.name.compareTo(b.name);
        }
    }

    public static Comparator<Dog> getNameComparator(){
        return new NameComparator();
    }


}
