package practic19_11_2018;

import java.util.Scanner;

/*
* Замовник хоче отримати сайт для розмішення постів. Пости розміщуються
звичайними юзерами.
Пости поділяются на два типи:
 ті хто шукає роботу
 ті хто пропонує роботу
Поля постів:
 Заголовок
 опис
 країна(роботи)
 місто(роботи)
 телефон
 ім'я автора поста
один автор може розмітити багато різних типів постів.
Створити меню:
  - створити пост
  - переглянути всі пости
  - переглянути пости по пипах
  - видалити пост
  - знайти пост певного типу в певному місті
* */
public class Main {
    public static void main(String[] args) {
        ManagerPost managerPost = new ManagerPost();
        Scanner sc = new Scanner(System.in);

        while (true) {
            menu();
            String chosen = sc.next();
            switch (chosen) {
                case "1":
                    managerPost.addPost();
                    break;
                case "2":
                    managerPost.printPosts();
                    break;
                case "3":
                    managerPost.printPostsByType();
                    break;
                case "4":
                    managerPost.delPost();
                    break;
                case "5":
                    managerPost.findPost();
                    break;
                default:
                    return;
            }
        }
    }


    public static void menu() {
        System.out.println("        ***********************************");
        System.out.println("        *             -- Menu --          *");
        System.out.println("        ***********************************");
        System.out.println("          1 - add new post");
        System.out.println("          2 - list posts");
        System.out.println("          3 - list posts by type");
        System.out.println("          4 - delete post");
        System.out.println("          5 - find specific post in specific city");
        System.out.println("          EXIT - press any key");
    }
}
