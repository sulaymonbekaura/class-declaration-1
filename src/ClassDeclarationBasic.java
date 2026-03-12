/**
 * class Car { } + new Car() — full introductory OOP example.
 * Shows class declaration, fields, constructors, methods, objects.
 */
public class ClassDeclarationBasic {

    // ─── Class Declaration ────────────────────────────────────────────
    static class Car {
        // Fields (attributes)
        String brand;
        String color;
        int    year;
        int    doors;

        // Constructor (called with 'new')
        Car(String brand, String color, int year, int doors) {
            this.brand = brand;
            this.color = color;
            this.year  = year;
            this.doors = doors;
        }

        // Methods (behaviors)
        void honk() {
            System.out.println(brand + ": Beep beep!");
        }

        void describe() {
            System.out.printf("🚗 %d %s %s (%d doors)%n", year, color, brand, doors);
        }

        int age() {
            return 2024 - year;
        }
    }

    // ─── Another class: Book ──────────────────────────────────────────
    static class Book {
        String title;
        String author;
        int    pages;
        double price;

        Book(String title, String author, int pages, double price) {
            this.title  = title;
            this.author = author;
            this.pages  = pages;
            this.price  = price;
        }

        void display() {
            System.out.printf("📚 "%s" by %s | %d pages | $%.2f%n",
                title, author, pages, price);
        }

        boolean isLongBook() { return pages > 400; }
        String  category()   { return pages <= 150 ? "Short" : pages <= 400 ? "Medium" : "Long"; }
    }

    public static void main(String[] args) {
        // Creating Car objects (instances)
        System.out.println("=== Car Objects ===");
        Car car1 = new Car("Toyota",  "White",  2020, 4);
        Car car2 = new Car("Ferrari", "Red",    2023, 2);
        Car car3 = new Car("Tesla",   "Black",  2022, 4);

        car1.describe();
        car2.describe();
        car3.describe();

        System.out.println("\n=== Honking ===");
        car1.honk();
        car2.honk();

        System.out.println("\n=== Ages ===");
        System.out.println(car1.brand + " is " + car1.age() + " years old");
        System.out.println(car2.brand + " is " + car2.age() + " years old");

        // Creating Book objects
        System.out.println("\n=== Book Objects ===");
        Book[] books = {
            new Book("Clean Code",      "Martin",  431, 35.99),
            new Book("Java in a Nutshell","Evans", 988, 59.99),
            new Book("Pragmatic Programmer","Hunt",352, 44.99)
        };
        for (Book b : books) {
            b.display();
            System.out.println("   Category: " + b.category());
        }
    }
}
