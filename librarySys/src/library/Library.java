package library;
import java.util.ArrayList;
import java.util.Scanner;
public class Library {
	    ArrayList<Book> books;
	    ArrayList<Student> students;
	    public Library() {
	        books = new ArrayList<>();
	        students = new ArrayList<>();
	    }
	    public void addBook(Book book) {
	        books.add(book);
	        System.out.println("Book added: " + book);
	    }

	    public void addStudent(Student student) {
	        students.add(student);
	        System.out.println("Student added: " + student);
	    }

	    public void issueBook(int bookId) {
	        for (Book book : books) {
	            if (book.getBookId() == bookId && book.isAvailable()) {
	                book.setAvailable(false);
	                System.out.println("Book issued: " + book);
	                return;
	            }
	        }
	        System.out.println("Book not available or does not exist.");
	    }

	    public void returnBook(int bookId) {
	        for (Book book : books) {
	            if (book.getBookId() == bookId && !book.isAvailable()) {
	                book.setAvailable(true);
	                System.out.println("Book returned: " + book);
	                return;
	            }
	        }
	        System.out.println("Book not found or is already available.");
	    }

	    public void showBooks() {
	        System.out.println("Available books:");
	        for (Book book : books) {
	            System.out.println(book);
	        }
	    }

	    public static void main(String[] args) {
	        Library library = new Library();
	        Scanner scanner = new Scanner(System.in);
	        library.addBook(new Book(1, "1984", "George Orwell"));
	        library.addBook(new Book(2, "To Kill a Mockingbird", "Harper Lee"));
	        library.addStudent(new Student(1, "Alice"));
	        library.addStudent(new Student(2, "Bob"));
	        while (true) {
	            System.out.println("\nLibrary Menu:");
	            System.out.println("1. Show Books");
	            System.out.println("2. Add Book");
	            System.out.println("3. Issue Book");
	            System.out.println("4. Return Book");
	            System.out.println("5. Exit");
	            System.out.print("Choose an option: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    library.showBooks();
	                    break;
	                case 2:
	                    System.out.print("Enter book ID: ");
	                    int bookId = scanner.nextInt();
	                    scanner.nextLine();
	                    System.out.print("Enter title: ");
	                    String title = scanner.nextLine();
	                    System.out.print("Enter author: ");
	                    String author = scanner.nextLine();
	                    library.addBook(new Book(bookId, title, author));
	                    break;
	                case 3:
	                    System.out.print("Enter book ID to issue: ");
	                    int issueBookId = scanner.nextInt();
	                    library.issueBook(issueBookId);
	                    break;
	                case 4:
	                    System.out.print("Enter book ID to return: ");
	                    int returnBookId = scanner.nextInt();
	                    library.returnBook(returnBookId);
	                    break;
	                case 5:
	                    System.out.println("Exiting...");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }
	        }
	    }
	}

