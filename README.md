# ava-Collections-Framework-Showcase-or-Demo-for-a-Library-Management-System-LMS

```java
import java.util.*;

// Book class to represent a book in the library
class Book {
    int id;
    String title;
    String author;
    String genre;
    boolean available;

    Book(int id, String title, String author, String genre, boolean available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = available;
    }

    @Override
    public String toString() {
        return "[" + id + "] " + title + " by " + author + " (" + genre + ") - " +
               (available ? "Available" : "Borrowed");
    }
}

// Library Management System
class LMS {

    void reception() {
        // Java List (ArrayList, LinkedList, Sorting)
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(0, "The Quran", "Unknown", "Religion", true));
        books.add(new Book(1, "The Bible", "Various", "Religion", true));
        books.add(new Book(2, "The Lord of the Rings", "J.R.R. Tolkien", "Fantasy", true));
        books.add(new Book(3, "The Little Prince", "Antoine de Saint-Exupéry", "Fiction", true));
        books.add(new Book(4, "A Tale of Two Cities", "Charles Dickens", "Classic", true));
        books.add(new Book(5, "The Halloween", "Unknown", "Horror", true));
        books.add(new Book(6, "Xinhua Zidian", "Chinese Academy", "Reference", true));
        books.add(new Book(7, "Quotations from Mao Tse-Tung", "Mao Zedong", "Philosophy", true));

        // Borrow/return history in LinkedList
        LinkedList<Book> borrowHistory = new LinkedList<>();
        borrowHistory.add(books.get(1));
        borrowHistory.add(books.get(3));
        borrowHistory.add(books.get(5));

        // Sorting books alphabetically by title
        books.sort(Comparator.comparing(b -> b.title));
        System.out.println("📚 Sorted Books: " + books);

        // Java Set
        HashSet<String> genres = new HashSet<>();
        for (Book b : books) genres.add(b.genre);
        System.out.println("🎭 Genres: " + genres);

        TreeSet<String> users = new TreeSet<>();
        users.add("Maria");
        users.add("Nushi");
        users.add("Mohammed");
        users.add("Jose");
        users.add("Muhammad");
        users.add("Mohamed");
        users.add("Wei");
        System.out.println("👤 Users (sorted): " + users);

        LinkedHashSet<String> searchList = new LinkedHashSet<>();
        searchList.add("The Quran");
        searchList.add("The Bible");
        searchList.add("The Halloween");
        System.out.println("🔎 Recently searched: " + searchList);

        // Java Map
        HashMap<Integer, Book> bookMap = new HashMap<>();
        for (Book b : books) {
            bookMap.put(b.id, b);
        }
        System.out.println("📖 Book Map: " + bookMap);

        TreeMap<Integer, String> userList = new TreeMap<>();
        userList.put(1, "Maria");
        userList.put(2, "Nushi");
        userList.put(3, "Mohammed");
        userList.put(4, "Wei");
        userList.put(5, "Jose");
        System.out.println("📋 User List (TreeMap): " + userList);

        LinkedHashMap<Integer, String> transactions = new LinkedHashMap<>();
        transactions.put(1, "Maria borrowed The Quran");
        transactions.put(2, "Nushi borrowed The Bible");
        transactions.put(3, "Mohammed returned The Little Prince");
        System.out.println("💳 Transactions: " + transactions);

        // Iterator
        System.out.println("📚 Available Books:");
        Iterator<Book> it = books.iterator();
        while (it.hasNext()) {
            System.out.println(" - " + it.next());
        }

        // Removing overdue (demo: remove "Halloween")
        Iterator<Book> histIt = borrowHistory.iterator();
        while (histIt.hasNext()) {
            Book b = histIt.next();
            if (b.title.contains("Halloween")) {
                histIt.remove();
            }
        }
        System.out.println("📝 Borrow History (after overdue removed): " + borrowHistory);

        // Algorithms
        List<Integer> borrowCounts = Arrays.asList(5, 12, 7, 3, 9);
        System.out.println("🔥 Most borrowed count: " + Collections.max(borrowCounts));
        System.out.println("❄️ Least borrowed count: " + Collections.min(borrowCounts));
        System.out.println("🔢 Frequency of count 3: " + Collections.frequency(borrowCounts, 3));

        Collections.shuffle(books);
        System.out.println("🎲 Random Book Suggestion: " + books.get(0));
    }
}

public class Main {
    public static void main(String[] args) {
        LMS lms = new LMS();
        lms.reception();
    }
}
```
---
## 📚 Java Library Management System (LMS) with Custom Object

This project is a demonstration of the **Java Collections Framework** using a realistic, object-oriented approach. It simulates basic library operations by managing a collection of custom **`Book` objects** and utilizing various Java data structures to showcase their unique properties and use cases.

-----

## 💻 Project Structure

The project consists of two main classes:

1.  **`Book` Class:** A custom object used to model a book, including properties like `id`, `title`, `author`, `genre`, and `available`.
2.  **`LMS` Class:** Contains the core `reception()` logic where all library operations and data structure demonstrations are performed.

-----

## ✨ Features and Data Structure Showcase

The `LMS` class leverages the most common Java data structures, mapping them to specific library functions:

| Data Structure | Implementation | Library Functionality | Key DSA Concept Demonstrated |
| :--- | :--- | :--- | :--- |
| **`List`** | `ArrayList<Book>` | The main **book catalog**, used for storage and sorting. | Indexed access, dynamic resizing, and efficient sorting. |
| **`List`** | `LinkedList<Book>` | A log of **borrow/return history**. | Efficient insertions/removals (though used for simple storage here). |
| **`Set`** | `HashSet<String>` | Storing a unique list of all available **genres**. | **Unordered** storage and enforcement of **uniqueness** ($O(1)$ average time complexity for lookups). |
| **`Set`** | `TreeSet<String>` | Managing and displaying **users** in alphabetical order. | Automatic **natural sorting** ($O(\log N)$ operations). |
| **`Set`** | `LinkedHashSet<String>` | Tracking the order of **recent searches**. | Maintains **insertion order** while ensuring uniqueness. |
| **`Map`** | `HashMap<Integer, Book>` | A look-up index for books using the `Book`'s `id`. | Fast, **unordered** key-value lookup ($O(1)$ average time complexity). |
| **`Map`** | `TreeMap<Integer, String>` | Storing a sorted list of users, sorted by their **User ID**. | Keys are automatically **sorted** (by User ID). |
| **`Map`** | `LinkedHashMap<Integer, String>` | An audit trail of **transactions**, maintaining their chronological order. | Maintains the **insertion order** of key-value entries. |

-----

## ▶️ Execution

### Prerequisites

  * Java Development Kit (JDK) installed (version 8 or higher).

### How to Run

1.  Save the entire code block into a single file named `Main.java`.
2.  Compile the Java file:
    ```bash
    javac Main.java
    ```
3.  Execute the compiled program:
    ```bash
    java Main
    ```

### Expected Output

The program will print the results of various operations, including:

  * The initial book catalog **sorted alphabetically by title** using `Comparator.comparing()`.
  * The lists of genres, users, and search history demonstrating the different ordering behaviors of **`Set`** types.
  * The mapping of books by ID, and transactions in insertion order, showcasing **`Map`** properties.
  * A demonstration of safe removal from the `borrowHistory` using the **`Iterator.remove()`** method.
  * Results from **`Collections` algorithms** (max, min, frequency, and a random suggestion via shuffle).
