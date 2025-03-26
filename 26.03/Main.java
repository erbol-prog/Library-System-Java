import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.NavigableMap;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
 

public class Main {
    
    public static void main(String[] args) {
        //ArrayLists
        //first task
        ArrayList<String> colors = new ArrayList<>();
        
         colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
         System.out.println("Colors: " + colors);


        //second task
        for (String color : colors){
            System.out.println(color);
        }

        //17 task 
        colors.removeAll(colors);
        System.out.println("Colors: " + colors);
        //18 task
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println("Colors: " + colors);
        //19 task
        System.out.println("Colors before" + colors);
        colors.trimToSize();
        System.out.println("Colors: " + colors);
        //20 task
        colors.ensureCapacity(10); 
        System.out.println("Increased capacity of colors list");

        //21 task
        colors.set(1, "Yellow"); 
        System.out.println("Colors after replacement: " + colors);

        //22 task
        for (int i = 0 ; i < colors.size(); i++) {
            System.out.println("Element at position " + i + ": " + colors.get(i));
        }


        //LinkedLists
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Element1");
        linkedList.add("Element2");
        linkedList.add("Element3");

        //21 task
        String lastElement = linkedList.peekLast();
        System.out.println("Last element: " + lastElement);

        //22 task
        System.out.println("Element2 exists: " + linkedList.contains("Element2"));

        //23  task 
        ArrayList<String> arrayList = new ArrayList<>(linkedList);
        System.out.println("ArrayList: " + arrayList);

        //24 task 
        LinkedList<String> anotherList = new LinkedList<>();
        anotherList.add("Element1");
        anotherList.add("Element2");
        anotherList.add("Element3");
        boolean areEqual = linkedList.equals(anotherList);
        System.out.println("Linked lists are equal: " + areEqual);

        //25 task
        System.out.println("Linked list is empty: " + linkedList.isEmpty());

        //26 task 
        linkedList.set(1, "Element4");
        System.out.println("Linked list after replacement: " + linkedList);

        //7 task
        HashSet<String> newSet = new HashSet<>();
        newSet.add("Element1");
        newSet.add("Element2");
        newSet.add("Element3");
        String[] array = newSet.toArray(new String[linkedList.size()]);
        System.out.println("Array: " + Arrays.toString(array));

        //8 task
        TreeSet<String> treeSet = new TreeSet<>(linkedList);
        System.out.println("TreeSet: " + treeSet);

        //9 task
        System.out.println("Elements less than 7: " + treeSet.headSet("7"));

        //10 task
        HashSet<String> hashSet = new HashSet<>(linkedList);
        boolean Equals = hashSet.equals(new HashSet<>(treeSet));
        System.out.println("HashSet and TreeSet are equal: " + Equals);

        //11 task
        hashSet.retainAll(treeSet);
        System.out.println("HashSet after retainAll: " + hashSet);

        //12 task
        hashSet.clear();
        System.out.println("HashSet after clear: " + hashSet);

        //TreeSets
        TreeSet<String> treeSet1 = new TreeSet<>(linkedList);
        
        //11 task
        String lower = treeSet1.lower("Element2");
        System.out.println("Element less than Element2: " + lower);

        //12 task
        String higher = treeSet1.higher("Element2");
        System.out.println("Element greater than Element2: " + higher);

//13 task
        String lower1 = treeSet1.lower("Element2");
        System.out.println("Element strictly less than Element2: " + lower1);

        //14 task
        String firstElement = treeSet1.pollFirst();
        System.out.println("First element: " + firstElement);

        //15 task
        String lastElement1 = treeSet1.pollLast();
        System.out.println("Last element: " + lastElement1);

        //16 task
        boolean isRemoved = treeSet1.remove("Element2");
        System.out.println("Element2 removed: " + isRemoved);


        // 7. Compare two priority queues
        PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<>(Arrays.asList(1, 2, 3));
        PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>(Arrays.asList(1, 2, 3));
        System.out.println("Priority queues are equal: " + priorityQueue1.equals(priorityQueue2));

        // 8. Retrieve the first element of the priority queue
        System.out.println("First element of the priority queue: " + priorityQueue1.peek());

        // 9. Retrieve and remove the first element of the priority queue
        Integer removedElement = priorityQueue1.poll();
        System.out.println("Removed first element: " + removedElement);

        // 10. Convert a priority queue to an array
        Object[] array2 = priorityQueue1.toArray();
        System.out.println("Priority queue as an array: " + Arrays.toString(array2));

        // 11. Convert a Priority Queue element to string representations
        String queueAsString= priorityQueue1.toString();
        System.out.println("Priority queue as a string: " + queueAsString);


        //hashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // 8. Test if a map contains a mapping for the specified value
        boolean containsValue = map.containsValue(2);
        System.out.println("Map contains value 2: " + containsValue);

        // 9. Create a set view of the mappings contained in a map
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println("Map entries: " + entries);

        // 10. Get the value of a specified key in a map
        Integer value = map.get("Two");
        System.out.println("Value for key Two: " + value);

        // 11. Get a set view of the keys contained in this map
        Set<String> keySet = map.keySet();
        System.out.println("Map keys: " + keySet);

        // 12. Get a collection view of the values contained in this map
        Collection<Integer> values = map.values();
        System.out.println("Map values: " + values);

        // 22. Get the portion of a map whose keys range from a given key (inclusive) to another key (exclusive)
        NavigableMap<String, Integer> navigableMap = new TreeMap<>(map);
        Map<String, Integer> subMap = navigableMap.subMap("One", false, "Three", true);
        System.out.println("Sub map: " + subMap);

        // 23. Get the portion of a map whose keys range from a given key to another key
        subMap = navigableMap.subMap("One", "Three");
        System.out.println("Sub map: " + subMap);

        // 24. Get a portion of a map whose keys are greater than or equal to a given key
        subMap = navigableMap.tailMap("Two", true);
        System.out.println("Sub map: " + subMap);

        // 25. Get a key-value mapping associated with the least key greater than or equal to the given key. Return null if there is no such key
        Map.Entry<String, Integer> entry = navigableMap.ceilingEntry("Two");
        System.out.println("Ceiling entry: " + entry);

        // 26. Get the least key greater than or equal to the given key. Returns null if there is no such key
        String ceilingKey = navigableMap.ceilingKey("Two");
        System.out.println("Ceiling key: " + ceilingKey);



    }
    
}