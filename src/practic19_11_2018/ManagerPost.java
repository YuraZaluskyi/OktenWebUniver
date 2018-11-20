package practic19_11_2018;

import java.util.Scanner;

public class ManagerPost {
    PostsCollection postsCollection = new PostsCollection();
    Scanner sc = new Scanner(System.in);

//    methods___________________________________________________________________________________________________

    //    1. add post
    public void addPost() {
        System.out.println("enter title");
        String title = sc.next();
        System.out.println("enter description");
        String descript = sc.next();
        System.out.println("enter first name");
        String firstName = sc.next();
        System.out.println("enter surname");
        String surname = sc.next();
        System.out.println("enter country");
        String country = sc.next();
        System.out.println("enter city");
        String city = sc.next();
        postsCollection.addPost(title, descript, firstName, surname, country, city);
    }

    //    2. print posts
    public void printPosts() {
        postsCollection.printPosts();
    }

    //    3. print posts by type
    public void printPostsByType() {
        System.out.println("enter type post would you like to print");
        String type = sc.next();
        postsCollection.prinPostsByType(type);
    }

    //    4. delete post
    public void delPost() {
        System.out.println("enter title");
        String title = sc.next();
        System.out.println("enter description");
        String descript = sc.next();
        System.out.println("enter first name");
        String firstName = sc.next();
        System.out.println("enter surname");
        String surname = sc.next();
        System.out.println("enter country");
        String country = sc.next();
        System.out.println("enter city");
        String city = sc.next();
        postsCollection.delPost(title, descript, firstName, surname, country, city);
    }

//    5. find specific post in specific city
    public void findPost(){
        System.out.println("enter title");
        String title = sc.next();
        System.out.println("enter description");
        String descript = sc.next();
        System.out.println("enter city");
        String city = sc.next();
        System.out.println(postsCollection.findPost(title, descript, city));
    }
}
