import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> collection = new ArrayList<>();

        Randoms randoms = new Randoms(90, 100);
        Iterator<Integer> iterator = randoms.getIterator();
        while (iterator.hasNext()) {
            if (iterator.next() == 100) {
                System.out.println("Выпало число 100, давайте на этом закончим");
                break;
            } else {
                collection.add(iterator.next());
            }
        }
        System.out.println(Arrays.toString(collection.toArray()));
        collection.clear();
    }
}
