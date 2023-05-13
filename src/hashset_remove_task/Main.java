package hashset_remove_task;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < 11; i++) {
            hashSet.add(i);
        }
        System.out.println(hashSet);


        var iterator = hashSet.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            iterator.next();
            if (count == 3) {
                iterator.remove();
            }
            count++;
        }

        System.out.println(hashSet);

    }
}
