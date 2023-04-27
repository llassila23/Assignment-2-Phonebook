// Author: Lucas Lassila
// Class: CS 145
// Assingment : Phonebook
// 4/27/23
// This is the Object file, it will create an instance of the phonebook object to be acted upon
// by the PBManager.java file
    
public class PBObject{

// use Strings for all of them, easier to seach, can use one method for all
private String lastName ;
private String firstName ;
private String pNumber ;
private String city ;
private String address ;

        PBObject next;
// constructor
    public PBObject(String strLastName, String strFirstName, String strNumber, String strAddress, String strCity ){
        this.lastName = strLastName;
        this.firstName = strLastName;
        this.pNumber = strNumber;
        this.address = strAddress;
        this.city = strCity;
        this.next = null;
    }


    public String toString(){
        
        return strLastName + strFirstName + strNumber + strAddress + strCity;
    }
}