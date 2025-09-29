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
