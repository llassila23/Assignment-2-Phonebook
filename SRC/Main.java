// Author: Lucas Lassila
// Class: CS 145
// Assingment : Phonebook
// 5/1/23
// This is the Test file, it will create an instance of the Manager class to be acted upon
// the ListNode Object.
package SRC;

public class Main {
    public static void main(String[]args) throws java.lang.NullPointerException{

        Manager book = new Manager();
// basic header entry, keeps list from being empty -> simplifies later set/get caluclations
            book.add("Phone");
            book.add("Book");
            book.add("800-123-book");
            book.add("Bellingham");
            book.add("WA");

            book.menu(); // run user interaction loop

            book.print();
            //System.out.println(book.get(2));

    }
    
}
