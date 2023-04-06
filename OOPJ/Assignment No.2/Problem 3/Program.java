import java.util.Scanner;

class Inventory {
    String title, author, publisher, isbn;
    int year, quantity;
    double price;

    Inventory(){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.year = year;
        this.quantity = quantity;
        this.price = price;
    }
    void setTitle(String title){
        this.title = title;
    }
    void setAuthor(String author){
        this.author = author;
    }
    void setPublisher(String publisher){
        this.publisher = publisher;
    }
    void setIsbn(String isbn){
        this.isbn = isbn;
    }
    void setYear(int year){
        this.year = year;
    }
    void setQuantity(int quantity){
        this.quantity = quantity;
    }
    void setPrice(double price){
        this.price = price;
    }
    String getTitle(){
        return this.title;
    }
    String getAuthor(){
        return this.author;
    }
    String getPublisher(){
        return this.publisher;
    }
    String getIsbn(){
        return this.isbn;
    }
    int getYear(){
        return this.year;
    }
    int getQuantity(){
        return this.quantity;
    }
    double getPrice(){
        return this.price;
    }
    int increaseQuantity(){
        this.quantity++;
        return quantity;
    }
    int decreaseQuantity(){
        this.quantity--;
        return quantity;
    }
    double getInventoryValue(){
        double inventoryValue = price*quantity;
        return inventoryValue; 
    }
}

class InventoryTest{
        Inventory inv = new Inventory();
        static Scanner sc = new Scanner(System.in);
        void acceptRecord(){
        System.out.println("Enter Book Details");
        sc.nextLine();
        System.out.print("Title :");
        inv.setTitle(sc.nextLine());
        System.out.print("Author :");
        inv.setAuthor(sc.nextLine());
        System.out.print("Publisher :");
        inv.setPublisher(sc.nextLine());
        System.out.print("ISBN :");
        inv.setIsbn(sc.nextLine());
        System.out.print("Year :");
        inv.setYear(sc.nextInt());
        System.out.print("Price :");
        inv.setPrice(sc.nextDouble());
        System.out.print("Quantity :");
        inv.setQuantity(sc.nextInt());
        }        
        void printRecord(){
        System.out.println("Book Details");
        System.out.println("Title :"+inv.getTitle());
        System.out.println("Author :"+inv.getAuthor());
        System.out.println("Publisher :"+inv.getPublisher());
        System.out.println("ISBN :"+inv.getIsbn());
        System.out.println("Year :"+inv.getYear());
        System.out.println("Price :"+inv.getPrice());
        System.out.println("Quantity :"+inv.getQuantity());
        }
        static int menuList(){
            System.out.println("Enter Your choice  : ");
            System.out.println("1.Enter Book Details");
            System.out.println("2.Print Book Details");
            System.out.println("3.Increase Quantity");
            System.out.println("4.Decrease Quantity");
            System.out.print("0.Exit  : ");
            return sc.nextInt();
        }

        void increaseQty(){
            int qty = inv.increaseQuantity();
            System.out.println("Quantity : "+qty);
        }
        void decreaseQty(){
            int qt = inv.decreaseQuantity();
            System.out.println("Quantity : "+qt);
        }       
}
        
class Program{
    public static void main(String[] args){
        Inventory in = new Inventory();
        InventoryTest it = new InventoryTest();
        int choice;
        while( ( choice = InventoryTest.menuList( ) ) != 0 ){
        switch( choice ){
        case 1:
          it.acceptRecord();
          break;
        case 2:
            it.printRecord();
            break;
        case 3:
            it.increaseQty();
            break;
        case 4:
            it.decreaseQty();
            break;
        }   
        }
    }
}
