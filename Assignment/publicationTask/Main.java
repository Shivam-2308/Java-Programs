package Assignment.publicationTask;

import java.util.Scanner;

class Publication {
    private String title;
    private float price;

    public Publication(String title, float price) {
        this.title = title;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public float getPrice() {
        return price;
    }

    public void showDetails() {
        System.out.println("Title is: " + getTitle() + "\nprice is: " + getPrice());
    }
}

class Book extends Publication {
    int count;

    Book(String title, float price, int count) {
//        super.setTitle(title);
//        super.setPrice(price);
        super(title, price);
        this.count = count;
    }

    //        System.out.println(super.getTitle());
//    void bookDetails() {
//        System.out.print("Title of book is: " + super.getTitle() + "\nPrice of Book is: " + super.getPrice() + "\nPage count: " + count);
//    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Page count is: " + count);
    }
}

class Tape extends Publication {
    int playingTime;

    Tape(String title, float price, int playingTime) {
//        super.setTitle(title);
//        super.setPrice(price);
        super(title, price);
        this.playingTime = playingTime;
    }

    //    void tapeDetails() {
//        System.out.print("\n-------------\nTitle of Tape is: " + super.getTitle() + "\nPrice of Tape is: " + super.getPrice() + "\nPlaying Time: " + playingTime + " minutes");
//    }
    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Playing Time is: " + playingTime);
    }
}

public class Main extends Exception {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Title, Price and PageCount of Book: ");
            String title = sc.nextLine();
            float price = sc.nextFloat();
            int count = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Title, Price and PlayingTime of Tape: ");
            String title1 = sc.nextLine();
            float price1 = sc.nextFloat();
            int playingTime = sc.nextInt();
            Book bk = new Book(title, price, count);
            Tape tp = new Tape(title1, price1, playingTime);
            System.out.println("Book Details-------");
            bk.showDetails();
            System.out.println("Tape Details-------");
            tp.showDetails();
//            bk.bookDetails();
//            tp.tapeDetails();
        } catch (Exception e) {
            Book bk1 = new Book(null, 0, 0);
            Tape tp1 = new Tape(null, 0, 0);
            bk1.showDetails();
            tp1.showDetails();
            e.printStackTrace();

        }
    }

}
