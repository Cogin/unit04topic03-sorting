import java.util.ArrayList;

public class StringListSort {

    public static void SelectionSort( ArrayList<String> list ){
        String temp;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(list.get(i-1)) > 0) {
                for (int j = i+1; j < list.size(); j++) {
                    if (list.get(i).compareTo(list.get(j)) > 0) {
                        System.out.println(list.toString());
                        temp = list.get(i);
                        list.set(i, list.get(j));
                        list.set(j, temp);
                    }
                }
            }
        }
    }

    public static void InsertionSort( ArrayList<String> list ) {
        String temp;
        for (int i = 1; i < list.size(); i++) {
            int j = i;
            while (j > 0 && list.get(j).compareTo(list.get(j-1)) < 0) {
                String tmp = list.get(j-1);
                list.set(j-1, list.get(j));
                list.set(j, tmp);
                j--;
            };
        }
    }
    
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("g");
        list.add("h");
        list.add("f");
        list.add("e");
        list.add("i");
        list.add("j");
        SelectionSort(list);
        System.out.println(list.toString());
    }
}