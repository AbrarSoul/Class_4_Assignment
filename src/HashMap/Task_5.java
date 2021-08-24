package HashMap;

import java.util.HashMap;

public class Task_5 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> note = new HashMap<Integer, Integer>();
        note.put(0, 2);
        note.put(1, 5);
        note.put(2, 10);
        note.put(3, 20);
        note.put(4, 50);
        note.put(5, 100);
        note.put(6, 200);
        note.put(7, 500);
        note.put(8, 1000);

        int key1 = (int) (Math.random()*9);
        int key2 = (int) (Math.random()*9);
        int key3 = (int) (Math.random()*9);

        int randomnote1 = note.get(key1);
        int randomnote2 = note.get(key2);
        int randomnote3 = note.get(key3);
        System.out.println("Random notes: "+randomnote1+" "+randomnote2+" "+randomnote3);
        System.out.println("Total Tk. = "+(randomnote1+randomnote2+randomnote3));
    }
}
