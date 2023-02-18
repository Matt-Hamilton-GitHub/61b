import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ArraySet<T> implements Iterable<T>{
    private T[] items;
    private int size;

    public ArraySet() {
        items = (T[]) new Object[100];
        size = 0;
    }

    public Iterator<T> iterator(){

        return new ArraySetIterator();
    }

    private class ArraySetIterator implements  Iterator<T>{
        private int wizPos;
        public ArraySetIterator(){
            wizPos = 0;
        }

        public boolean hasNext(){
            return wizPos < size;
        }
        public T next(){
            T returnItem = items[wizPos];
            wizPos++;
            return returnItem;
        }

    }
    public static void main(String[] args) {

        ArraySet<String> s = new ArraySet<>();
        Set<Integer> javaset = new HashSet<>();

        s.add(null);
        s.add("horse");
        s.add("fish");

        javaset.add(5);
        javaset.add(23);
        javaset.add(42);

        Iterator<Integer> seer = javaset.iterator();

        while (seer.hasNext()){
            int i = seer.next();
            System.out.println(i);
        }
        Iterator<String> aseer = s.iterator();

        while (aseer.hasNext()){
            String i = aseer.next();
            System.out.println(i);
        }

        for(String i : s){
            System.out.println(i);
        }

        System.out.println(s.toString());
    }

    public boolean contains(T x) {
        for (int i = 0; i < size; i++) {
            if (items[i].equals(x)) {
                return true;
            }
        }
        return false;
    }

    public void add(T x) {
//        if (x == null) {
//            throw new IllegalArgumentException("can't add null to an ArraySet");
//        }

        if (contains(x) || x == null) {
            return;
        }
        items[size] = x;
        size++;
    }

    @Override
    public String toString(){
        StringBuilder returnSb = new StringBuilder("{");
        for (T item : this){
            returnSb.append(item);
            returnSb.append(", ");
        }
        returnSb.append("}");
        return returnSb.toString();
    }

}
