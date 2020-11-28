package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Iterator;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        
        //Map<Integer, Integer> map = new HashMap<>();
        
        //MÉTODO 1
        //for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        //    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        //}
        
        //Método2
        //iterar solo sobre claves
        //for (Integer key : map.keySet()) {
        //    System.out.println("Key = " + key);
        //}
        
        //iterar solo sobre valores
        //for (Integer value : map.values()) {
        //    System.out.println("Value = " + value);
        //}
        
        //for (int i = 0; i < data.length; i++) {
        //    if(histogram.containsKey(data[i])) {
        //        histogram.put(data[i], histogram.get(data[i])+1);
        //    } else {
        //        histogram.put(data[i], 1);
        //    }
        //}
        
        //Método 3 A (Generics)
        //Iterator<Map.Entry<Integer, Integer>> entries = map.entrySet().iterator();
        //while (entries.hasNext()) {
        //    Map.Entry<Integer, Integer> entry = entries.next();
        //    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        //}
        
        //Método 3 B (Sin generics)
        //Map map = new HashMap();
        //Iterator entries = map.entrySet().iterator();
        //while (entries.hasNext()) {
        //    Map.Entry entry = (Map.Entry) entries.next();
        //    Integer key = (Integer) entry.getKey();
        //    Integer value = (Integer) entry.getValue();
        //    System.out.println("Key = " + key + ", Value = " + value);
        //}
        
        //Método 4
        //for (Integer key : map.keySet()) {
        //    Integer value = map.get(key);
        //    System.out.println("Key = " + key + ", Value = " + value);
        //}
        
        
        //KATA 2 VERSION 1
        
        Integer[] data = {1, 8, 4, 9, 0, 6, 2, 3, 1, 1, 4, 6, 5, 8, 9};
        
        //Map<Integer, Integer> histogram = new HashMap<> ();
        //
        //for (int i = 0; i < data.length; i++) {
        //    if(histogram.containsKey(data[i])) {
        //        histogram.put(data[i], histogram.get(data[i])+1);
        //    } else {
        //        histogram.put(data[i], 1);
        //    }
        //}
        //
        //Iterator<Map.Entry<Integer, Integer>> iter = histogram.entrySet().iterator();
        //
        //while(iter.hasNext()) {
        //    Map.Entry<Integer, Integer> entry = iter.next();
        //    System.out.println(entry.getKey() + "==>" + entry.getValue());
        //}
        
        
        //KATA VERSION 2   
        
        //for (int key : data) {
        //    histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        //}
        //
        //Iterator<Map.Entry<Integer, Integer>> iter = histogram.entrySet().iterator();
        //
        //while(iter.hasNext()) {
        //    Map.Entry<Integer, Integer> entry = iter.next();
        //    System.out.println(entry.getKey() + "==>" + entry.getValue());
        //}
        
        //KATA 2 VERSION 3 y 4
        
        Histogram histo = new Histogram(data);
        
        Map<Integer, Integer> histogr = histo.getHistogram();
        
        for (Integer key : histogr.keySet()) {
            System.out.println(key + " ==> " + histogr.get(key));
        }
        
    }
    
}
