//Написать программу, которая спрашивает имя пользователя, фамилию, личный код.
//Затем выводит эту информацию в виде: Иван Иванов родился 3 февраля 2004 года.
package task3jptv21;

import java.util.Scanner;

public class Task3JPTV21 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Write ur name: ");
        String name = scanner.nextLine ();
        System.out.print ("Rwite ur surname: ");
        String sername = scanner.nextLine ();
        System.out.print("Write month of birthday: ");
        String month = scanner.nextLine();
        System.out.print ("Write year of birthday: ");
        int year = scanner.nextInt();
        System.out.print("Write day of birthday: ");
        int days = scanner.nextInt();
        System.out.printf(name + " " +  sername + " was born " + days + " " + month + " " + year   + " year "); 
    }
    
}
