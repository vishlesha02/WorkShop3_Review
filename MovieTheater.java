/*Write a Java program to create a class called "MovieTheater" with instance variables "movies" (a list of Movie objects) and "numMovies" (the number of movies in the list). Include the following methods:

    A method to add a movie to the list
    A method to remove a movie from the list
    A method to search for a movie by its title
    A method to sort the movies in the list by their rating (ascending or descending order)
    A method to calculate the average rating of all movies in the theater
    A method to print the details of all movies in the theater*/

package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieTheater {

    ArrayList<String> movies = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addmovies(int n) {
        System.out.println("Enter the Show Name");
        for (int i = 0; i <= n-1; i++) {
            String mo = sc.next();
            movies.add(mo);
        }
    }
    public void show() {
        System.out.println(movies);
    }

    public void searchMovie(String s) {
        if (movies.contains(s)) {
            System.out.println("Please wait movie is loading....");

        }
    }

    public void DeleteMovie(String s) {
        if (movies.contains(s)) {
            movies.remove(s);
            System.out.println("The Show is removed");

        }
    }

    }
