package HeapsAndHashMaps;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception{
        Heaps<Integer> heap = new Heaps<>();

        heap.insert(22);
        heap.insert(31);
        heap.insert(11);
        heap.insert(27);
        heap.insert(73);

        System.out.println(heap.remove());

        ArrayList<Integer> list = heap.heapSort();
        System.out.println(list);
//
//        System.out.println("Kunal".hashCode());
//
//        KarpRabin algo = new KarpRabin();
//        algo.search("en", "AkshatHitenKshitiz");
//
//        String str = "Hiten";
//        HuffMannCoding hf = new HuffMannCoding(str);
//        String cs = hf.encode(str);
//        System.out.println(cs);
//        String dr = hf.decode(cs);
//        System.out.println(dr);

    }
}
