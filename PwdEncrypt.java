/* 
 --------------------------------------------------------
  Assignment 2
  Written by: Lucas Catchlove id: 27145640
  For COMP 248 Section EE – Fall 2016

   ** Password Encrytper **

  This program receives a 5 character string from the 
  user and manipulates the order of the characters as well
  as their position in the ascii code index. This generates
  a new password for the user 
  
 --------------------------------------------------------
 */


// importing foreign classes



import java.util.Scanner; 


public class PwdEncrypt { // Main method. 



  public static void main(String[] args) {

    System.out.println("---------------------------------------------\n"    // Welcome message.
              + "             ** password Encrypt **\n" 
              + "---------------------------------------------");


    Scanner kb = new Scanner (System.in);
    System.out.print("Please enter a 5 character string: ");
    String word = kb.nextLine();
    int length = word.length();


    if (length != 5) {
        System.out.println("Woops! Your word is not 5 characters long." +
              " The program will terminate now.\n");
        return;
    }


    StringBuilder sb = new StringBuilder();
    // start from the end of the input string
    int i = length - 1;


    while (i >= 0) {
      // add the "next" character to the output
      int asciiSub = word.charAt(i) - 7;
      char pword = (char) asciiSub;
      sb.append(pword);
        // step 1 character back
      i--;
    }

    String pword = sb.toString(); 
    System.out.println("Your password is " + pword +
        "\nThank you for using Password Encrypt!\n");


  }     
}