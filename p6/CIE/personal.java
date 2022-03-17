package CIE;
import java.util.*;
public class personal {
Scanner sc = new Scanner(System.in);
public String name,usn,sem;

public void accept() {
System.out.println("Enter usn");
usn = sc.next();
System.out.println("Enter name");
name = sc.next();
System.out.println("Enter sem");
sem = sc.next();
}
public void display() {
System.out.println("Usn = "+usn);
System.out.println("Name = "+name);
System.out.println("Sem = "+sem);
}
}