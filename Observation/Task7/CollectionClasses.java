import java.util.*;

public class CollectionClassesDemo {
    public static void main(String[] args) {

        // 1. ArrayList
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C");
        list.add(1, "HTML");

        System.out.println("ArrayList: " + list);
        System.out.println("Element at index 1: " + list.get(1));

        list.set(1, "CSS");
        System.out.println("After set(): " + list);

        list.remove("C");
        System.out.println("After remove(): " + list);

        System.out.println("Contains Java: " + list.contains("Java"));
        System.out.println("Size: " + list.size());
        System.out.println("Index of Java: " + list.indexOf("Java"));

        list.sort(Comparator.naturalOrder());
        System.out.println("Sorted ArrayList: " + list);


        // 2. LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(20);
        linkedList.add(30);
        linkedList.addFirst(10);
        linkedList.addLast(40);

        System.out.println("\nLinkedList: " + linkedList);
        System.out.println("First Element: " + linkedList.getFirst());
        System.out.println("Last Element: " + linkedList.getLast());

        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println("After removing first and last: " + linkedList);

        linkedList.offer(50);
        System.out.println("After offer(): " + linkedList);
        System.out.println("Poll: " + linkedList.poll());
        System.out.println("Peek: " + linkedList.peek());


        // 3. Vector
        Vector<String> vector = new Vector<>();

        vector.add("A");
        vector.add("B");
        vector.addElement("C");

        System.out.println("\nVector: " + vector);
        System.out.println("Element at index 1: " + vector.get(1));

        vector.set(1, "X");
        vector.remove(0);

        System.out.println("After modifications: " + vector);
        System.out.println("Size: " + vector.size());
        System.out.println("Capacity: " + vector.capacity());
        System.out.println("Contains C: " + vector.contains("C"));


        // 4. Stack
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("\nStack: " + stack);
        System.out.println("Top Element: " + stack.peek());
        System.out.println("Popped Element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
        System.out.println("Position of 10: " + stack.search(10));
        System.out.println("Is Empty: " + stack.empty());


        // 5. HashSet
        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(10);
        hashSet.add(30);

        System.out.println("\nHashSet: " + hashSet);
        System.out.println("Contains 20: " + hashSet.contains(20));
        System.out.println("Size: " + hashSet.size());


        // 6. LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Java");
        linkedHashSet.add("Python");
        linkedHashSet.add("C");
        linkedHashSet.add("Java");

        System.out.println("\nLinkedHashSet: " + linkedHashSet);
        System.out.println("Contains Python: "
                + linkedHashSet.contains("Python"));
        System.out.println("Size: " + linkedHashSet.size());


        // 7. TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(40);

        System.out.println("\nTreeSet: " + treeSet);
        System.out.println("First: " + treeSet.first());
        System.out.println("Last: " + treeSet.last());
        System.out.println("Higher than 20: " + treeSet.higher(20));
        System.out.println("Lower than 20: " + treeSet.lower(20));
        System.out.println("Ceiling of 25: " + treeSet.ceiling(25));
        System.out.println("Floor of 25: " + treeSet.floor(25));
        System.out.println("Poll First: " + treeSet.pollFirst());
        System.out.println("Poll Last: " + treeSet.pollLast());


        // 8. PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(30);
        priorityQueue.add(10);
        priorityQueue.offer(20);

        System.out.println("\nPriorityQueue: " + priorityQueue);
        System.out.println("Peek: " + priorityQueue.peek());
        System.out.println("Poll: " + priorityQueue.poll());
        System.out.println("After Poll: " + priorityQueue);
        System.out.println("Contains 20: "
                + priorityQueue.contains(20));
        System.out.println("Size: " + priorityQueue.size());


        // 9. ArrayDeque
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(20);
        deque.addLast(30);
        deque.offerFirst(10);
        deque.offerLast(40);

        System.out.println("\nArrayDeque: " + deque);
        System.out.println("First: " + deque.peekFirst());
        System.out.println("Last: " + deque.peekLast());

        System.out.println("Poll First: " + deque.pollFirst());
        System.out.println("Poll Last: " + deque.pollLast());
        System.out.println("After removals: " + deque);


        // 10. HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "Java");
        hashMap.put(2, "Python");
        hashMap.put(3, "C");

        System.out.println("\nHashMap: " + hashMap);
        System.out.println("Value for key 2: " + hashMap.get(2));
        System.out.println("Contains key 1: "
                + hashMap.containsKey(1));
        System.out.println("Contains value Java: "
                + hashMap.containsValue("Java"));
        System.out.println("Keys: " + hashMap.keySet());
        System.out.println("Values: " + hashMap.values());
        System.out.println("Entries: " + hashMap.entrySet());
        System.out.println("Default value: "
                + hashMap.getOrDefault(5, "Not Found"));


        // 11. LinkedHashMap
        LinkedHashMap<Integer, String> linkedHashMap =
                new LinkedHashMap<>();

        linkedHashMap.put(1, "Java");
        linkedHashMap.put(2, "Python");
        linkedHashMap.put(3, "C");

        System.out.println("\nLinkedHashMap: " + linkedHashMap);
        System.out.println("Value for key 2: "
                + linkedHashMap.get(2));
        System.out.println("Keys: " + linkedHashMap.keySet());
        System.out.println("Values: " + linkedHashMap.values());
        System.out.println("Entries: " + linkedHashMap.entrySet());


        // 12. TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(30, "C");
        treeMap.put(10, "Java");
        treeMap.put(20, "Python");
        treeMap.put(40, "HTML");

        System.out.println("\nTreeMap: " + treeMap);
        System.out.println("First Key: " + treeMap.firstKey());
        System.out.println("Last Key: " + treeMap.lastKey());
        System.out.println("Higher Key than 20: "
                + treeMap.higherKey(20));
        System.out.println("Lower Key than 20: "
                + treeMap.lowerKey(20));
        System.out.println("Ceiling Key of 25: "
                + treeMap.ceilingKey(25));
        System.out.println("Floor Key of 25: "
                + treeMap.floorKey(25));
        System.out.println("Entries: " + treeMap.entrySet());


        // 13. Hashtable
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        hashtable.put(1, "Java");
        hashtable.put(2, "Python");
        hashtable.put(3, "C");

        System.out.println("\nHashtable: " + hashtable);
        System.out.println("Value for key 2: "
                + hashtable.get(2));
        System.out.println("Contains key 1: "
                + hashtable.containsKey(1));
        System.out.println("Contains value Java: "
                + hashtable.containsValue("Java"));
        System.out.println("Keys: "
                + Collections.list(hashtable.keys()));
        System.out.println("Values: "
                + Collections.list(hashtable.elements()));
        System.out.println("Size: " + hashtable.size());
        System.out.println("Is Empty: " + hashtable.isEmpty());
    }
}
