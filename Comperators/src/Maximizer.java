import org.eclipse.jetty.server.RequestLog;

public class Maximizer {

    public static Comparable max(Comparable[] items){
        int maxDex = 0;
        for(int i = 0; i < items.length; i++){
            int cmp = items[i].compareTo(items[maxDex]);
            if(cmp > 0){
                maxDex = i;
            }
        }
        return items[maxDex];
    }

    public static void main(String[] args) {
        Dog d1 = new Dog(45, "Dexy");
        Dog d2 = new Dog(25, "Rrexy");
        Dog d3 = new Dog(15, "Toxy");
        Dog[] dogs = new Dog[]{d1,d2,d3};
        Dog maxDog = (Dog) max(dogs);
        System.out.println(maxDog.getName());
    }
}
