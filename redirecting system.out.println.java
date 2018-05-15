Redirecting System.out.println() output to a file in Java
System.out.println()  is used mostly to print messages to the console. However very few of us are actually aware of  its working mechanism.

System is a class defined in the java.lang package.
out is an instance of PrintStream  , which is a public and static member of the class System.
As all instances of PrintStream class have a public method println(), hence we can invoke the same on out as well. We can assume System.out  represents the standard Output Stream .
One interesting fact related to the above topic is, we can use System.out.println() to print messages to other sources too (and not just console) . However before doing so , we must reassign the standard output by using the following method of System class:

System.setOut(PrintStream p);
PrintStream can be used for character output to a text file. Below program creates the file A.txt and writes to the file using System.out.println(

// Java program to demonstrate redirection in System.out.println()
import java.io.*;
 
public class SystemFact
{
    public static void main(String arr[]) throws FileNotFoundException
    {
        // Creating a File object that represents the disk file.
        PrintStream o = new PrintStream(new File("A.txt"));
 
        // Store current System.out before assigning a new value
        PrintStream console = System.out;
 
        // Assign o to output stream
        System.setOut(o);
        System.out.println("This will be written to the text file");
 
        // Use stored value for output stream
        System.setOut(console);
        System.out.println("This will be written on the console!");
    }
}

In very similar fashion we can use System.out.println() to write to a Socket’s OutputStream as well.
