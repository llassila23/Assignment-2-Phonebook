// Author: Lucas Lassila
// Class: CS 145
// Assingment : Phonebook
// 4/27/23
// This is the Manager file, it will contain the methods for the program that will be acted on PBObject.java 
// and be called by PBTest.java

import java.util.LinkedList; // import linked list utility

public class PBManager{
    LinkedList<String> pBook = new LinkedList <String>(); 

// make a linked list
    public PBManager(){ // constructor class
         pBook.add(
            newPB.strLastName = "Welcome";
            newPB.strFirstName = "to";
            newPB.strNumber = "the";
            newPB.strAddress = "phone";
            newPB.strCity = "book";
         )

       

    }


//add, delete, modify, or search for an entry 


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

}