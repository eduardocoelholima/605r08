# CSCI-605 Recitation - week 8

Here you will find a couple of code snippets as well
as some notes used in RIT course CSCI605's recitation
sessions.

---

### HW6.1: Solar System using multiple classes

- https://cs.rit.edu/~hpb/Lectures/2201/605/605-483.html
- Solution files are in lecture notes
- How about we draw a class/interface diagram?
- hw61.tiff
- Questions?

### HW6.2: Fixing our Solar System classes

- https://cs.rit.edu/~hpb/Lectures/2201/605/605-484.html
- Solution files are in lecture notes
- How about we draw a class/interface diagram?
- hw62.tiff
- Questions?

### HW6.3: Generic Expressions
- https://cs.rit.edu/~hpb/Lectures/2201/605/605-485.html
- hw63answers.txt
- Questions?

### Interfaces: a splittable interface

Task: code class SplitableList which implement interface Splitable and inherit
 Vector.

- SplitableListSolution.java (main)
- Splitable.java
- SplitableListSolution2.java (main)
- Splitable2.java

These 1st solution will show warnings compiling with -Xlint. Why is that?

2nd solution solves that, but then a new warning appears. How to fix the
 2nd warning?

### Interfaces 2: a comparable linked list

Task: Code class Person comprised of strings firstName, lastName and integer
 age. Person should implement the interface Comparable. A Person object
  should be considered greater, equal or lesser than other Person object
   according to the lexicographical order.  Create a Java API's LinkedList of
    Person objects and sort them using Java API provided methods. 
 
- https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/Comparable.html
- https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Collections.html#sort(java.util.List)
- Person.java (main)

### Interfaces 3: comparing a linked list without natural ordering

Task: previously implemented class Person is compared using a person's first
 name. But what if you wish to use the last name for ordering? Create class
  that implements the interface Comparator and compares Person objects by
   their last names.
- Nice reference: https://docs.oracle.com/javase/tutorial/collections/interfaces/order.html
- LastNamePersonComparator.java (main)

### Interfaces + Generics: our very own linked list

Task: Create a class Node, which should hold a reference to the next
 Node and have a variable referencing a generic-typed object. Use the class
  Node to implement a Linked List comprised of Node<Person> elements.
  Do not use the Java API provided Linked List. Keep track of the last
   inserted element to the list and implement add, remove and find().
- MyLinkedList.java (main)
- Node.java

### HW7.1: A comparable custom class
- https://cs.rit.edu/~hpb/Lectures/2201/605/605-487.html
- Questions?

### HW7.2: A generic BST
- https://cs.rit.edu/~hpb/Lectures/2201/605/605-488.html
- Questions?

### HW7.3: Exceptions
- https://cs.rit.edu/~hpb/Lectures/2201/605/605-489.html
- Questions?


---

Please let me know if you have any questions. You can
always use MyCourses discussion forum (good idea) or
email me or Professor Bischof. I will reply the questions
either to the discussion forum or will email everyone so
every student can benefit from the answers provided.

Cheers,
eduardo.lima at mail.rit.edu