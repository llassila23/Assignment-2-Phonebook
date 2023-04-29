// Author: Lucas Lassila
// Class: CS 145
// Assingment : Phonebook
// 4/27/23
// This is the Manager file, it will contain the methods for the program that will be acted on ListNode.java 
// and be called by PBTest.java

import java.util.LinkedList; // import linked list utility
import java.util.Scanner;

public class PBManager{

    private int index; // this will be used for sorting the groups of data by person using modulus
    private String entry; // data from scanner

    Scanner input = new Scanner(System.in);


    LinkedList<String> pBook = new LinkedList <String>(); 
    
    public PBManager(){ // constructor class
         pBook.add("welcome");
        
    }

    public void add(String data){ // this will add a new element to the linked list with string data
        pBook.add(data);

    }
    public LinkedList<String> print(){ // this returns the phone book to be printed to console
        return pBook;
    }

    public void newEntry(){
        System.out.println("Enter a First Name");
            add(input.next());
        System.out.println("Enter a Last Name");
            add(input.next());
        System.out.println("Enter a Phone Number with no spaces");
           add(input.next());
        System.out.println("Enter a Street Name");
            add(input.next());
        System.out.println("Enter a City");
            add(input.next());
            

    }


//add, delete, modify, or search for an entry 

/* 
// add method
    create a new element that has a name, address, number and city
// delete method
    find a node, delete it, and change the previous pointer to point to the node after the deleted node
// edit method
    find a node by search(), and then select what part of it needs to be edited, edit that
        user input for what search criteria, and what part of it to be editied
            input new value
            replace value
// search
    take user input
    elements will be in groups of 4
        ->> know that each data type (name, address, city ect.) will have a corresponding node index. 
            have user choose what type they want to seach by, then crawl each element at that node index. 
            
        do a while loop to seach for it
            return the values of the elements that contains the search criteria
*/
}