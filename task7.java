1)Hash tables are useful in any situation where we have an unpredictable set of symbols (keys) and we want to associate some information with each one, in such a way that we can get at that information in O(1) time. We are assuming that the symbols don’t have any inherent ordering, or we don’t need any ordering-information (don’t need the “largest” or “smallest” symbol).
Hash functions are useful in any situation where we want to substitute a smaller, easier-to-manage proxy for some otherwise big/complex object. We can compare proxies to get a quick check for inequality, or use them to determine whether an object has changed.

2)A LinkedHashSet is an ordered version of HashSet that maintains a doubly-linked List across all elements. When the iteration order is needed to be maintained this class in used. When iterating through a HashSet the order is unpredictable, while a LinkedHashSet lets us iterate through the elements in the order in which they were inserted.when cycling through LinkedHashSet using an iterator, the elements will be returned in the order in which they were inserted.
HashSet internally stores values as part of HashMap's key and it puts a dummy value as value.
Syntax:

LinkedHashSet<String> hs = new LinkedHashSet<String>();
Contains unique elements only like HashSet. It extends HashSet class and implements Set interface.
Maintains insertion order.
// Dummy value to associate with an Object in the backing Map
private static final Object PRESENT = new Object();
private transient HashMap<E,Object> map;

public boolean add(E e) { 
 return map.put(e, PRESENT)==null;
}


3) TreeSet is implemented with a TreeMap. java.util.TreeSet is implementation class of SortedSet Interface. TreeSet has following important properties.
TreeSet implements the SortedSet interface so duplicate values are not allowed. TreeSet does not preserve the insertion order of elements but elements are sorted by keys. TreeSet does not allow to insert Heterogeneous objects. It will throw classCastException at Runtime if trying to add hetrogeneous objects.
TreeSet is basically implementation of a self-balancing binary search tree like Red-Black Tree. Therefore operations like add, remove and search take O(Log n) time. And operations like printing n elements in sorted order takes O(n) time.