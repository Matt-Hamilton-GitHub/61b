public class ArraySet<T> {
    private T[] items;
    private int size;

    public ArraySet() {
        items = (T[]) new Object[100];
        size = 0;
    }

    public static void main(String[] args) {

        ArraySet<String> s = new ArraySet<>();

        s.add(null);
        s.add("horse");
        s.add("fish");

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


}
