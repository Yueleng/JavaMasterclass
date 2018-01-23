package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");

        printList(placesToVisit);

        placesToVisit.add(1, "Alice Springs");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);


        LinkedList<String> placesToVisit2 = new LinkedList<String>();
        addInOrder(placesToVisit2, "Sydney");
        addInOrder(placesToVisit2, "Melbourne");
        addInOrder(placesToVisit2, "Brisbane");
        addInOrder(placesToVisit2, "Perth");
        addInOrder(placesToVisit2, "Canberra");
        addInOrder(placesToVisit2, "Adelaide");
        addInOrder(placesToVisit2, "Darwin");

        printList(placesToVisit2);
        addInOrder(placesToVisit2, "Sydney");
        printList(placesToVisit2);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next()); // i.next() gives the current location and move on to the next location.
        }
        System.out.println("==================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        // when stringListIterator is set up, it does not automatically point to the first element of linkedList,
        // it is the method .next() which point to.
        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                // equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0) {
                // new City should appear before this one
                // Brisbane -> Adelaide
                stringListIterator.previous(); // The linkList is actually a double linkList, it stores the reference of the next and the previous.
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {

            }
        }
        stringListIterator.add(newCity);
        return true;
    }



}
