
package practice;
import java.util.Scanner;
public class movie extends MovieTheater
        {
public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        MovieTheater m=new MovieTheater();
        
        System.out.print("Enter number of movies :");
        int n=sc.nextInt();
        m.addmovies(n);

        System.out.println("The movies are : ");
        m.show();

        System.out.println("Which movie would you like to watch ");
        String show=sc.next();
        m.searchMovie(show);

        System.out.println("Which movie would you like to Delete ");
        String del=sc.next();
        m.DeleteMovie(del);
        m.show();
        }
        }