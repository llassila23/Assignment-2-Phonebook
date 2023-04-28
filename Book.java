// Author: Lucas Lassila
// Class: CS 145
// Assingment : Phonebook
// 4/27/23
// This is the Object file, it will create an instance of the phonebook object to be acted upon
// by the PBManager.java file
// https://www.youtube.com/watch?v=YQQio9BGWgs 
    
public class Book{

// use Strings for all of them, easier to seach, can use one method for all
    String data;
    Book next;
// constructor
     //first element which will be at the back of the list as more are added

    public Book(String data){
        this.data = data;
        this.next = null;
    }

    public Book(String data, Book next){ //second element with pointer
        this.data = data;
        this.next = next;
    }


    public String toString(String data){ // how the object is shown when printed
        
        return data + " ";
    }
}