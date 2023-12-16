
import java.util.Scanner;

public class Ketabkhaneh {

	public Ketabkhaneh() {

	}

	public static void main(String[] args) {

		int usernum = 1;
		int booknum = 1;
		int state = 0;
		int uid;//Indicates userID for comparition in switches
		int bid;//Indicates bookID for comparition in switches
		Scanner Scanner = new Scanner(System.in);

		System.out.println("\n Welcome to the Library Management System \n");

		//definition of an array for users
		User[] users = new User[10000];
		for (int j = 0; j < 10000; j++) {
			users[j] = new User();
		}
		//definition of an array for books
		Book[] books = new Book[10000];
		for (int j = 0; j < 10000; j++) {
			books[j] = new Book();
		}
		while (true) {

			if (state != 9) {
				System.out.println("1) Add a new member\n"
						+ "2) View a member info\n"
						+ "3) Edit a member\n"
						+ "4) Delete a member\n"
						+ "5) Add a new book\n"
						+ "6) View a book info\n"
						+ "7) Edit a book\n"
						+ "8) Delete a book\n"
						+ "9) Exit\n"
						+ "\n Please Enter a number:\n");

				state = Scanner.nextInt();
				switch (state) {
					case 1 -> {

						System.out.println("Enter the name:");
						String name;
						name = Scanner.next();
						users[usernum].setUserName(name);
						System.out.println("Enter the age:");
						int age;
						age = Scanner.nextInt();
						users[usernum].setUserAge(age);
						System.out.println("Please select one number: (1)Male , (2)Female");
						int gen = Scanner.nextInt();
						if (gen == 1) {
							users[usernum].setUserGender(User.Gender.MALE);
						}
						if (gen == 2) {
							users[usernum].setUserGender(User.Gender.FEMALE);
						}
						System.out.println("Enter the user NationalID:");
						String nid = Scanner.next();
						users[usernum].setNationalID(nid);
						users[usernum].setUserId(100 + usernum);
						System.out.println("The UserID is: " + (100 + usernum));
						usernum++;

					}
					case 2 -> {
						System.out.println("Enter the user ID:\n");
						uid = Scanner.nextInt();
						Integer Userid;
						for (int j = 0; j < 10000; j++) {
							Userid = users[j].getUserId();
							if ((Userid != null) && (Userid == uid)) {
								if ((users[j].getUserName() != null) && (users[j].getUserGender() != null) && (users[j].getUserAge() != null) && (users[j].getNationalID() != null)) {

									System.out.println("Name:\t\t\t" + users[j].getUserName());
									System.out.println("Gender:\t\t\t" + users[j].getUserGender());
									System.out.println("Age:\t\t\t" + users[j].getUserAge());
									System.out.println("NationalID:\t\t" + users[j].getNationalID() + "\n");
								} else
									System.out.println("There isn't any User with this user ID!!\n");
							}
						}
					}
					case 3 -> {
						System.out.println("Enter the user ID:\n");
						uid = Scanner.nextInt();
						Integer Userid;
						for (int j = 0; j < 10000; j++) {
							Userid = users[j].getUserId();
							if ((Userid != null) && (Userid == uid)) {
								//new Name
								System.out.println("Please Enter new name:");
								String newName = Scanner.next();
								users[j].setUserName(newName);
								//new Age
								System.out.println("Please Enter new age:");
								Integer newAge = Scanner.nextInt();
								users[j].setUserAge(newAge);
								//new Gender
								System.out.println("Please Enter new gender: (1)Male , (2)Female");
								Integer newGender = Scanner.nextInt();
								if (newGender == 1) {
									users[j].setUserGender(User.Gender.MALE);
								}
								if (newGender == 2) {
									users[j].setUserGender(User.Gender.FEMALE);
								}
								//new National ID
								System.out.println("Please Enter new National ID:");
								String newNationalID = Scanner.next();
								users[j].setNationalID(newNationalID);
							}
						}
					}
					case 4 -> {
						System.out.println("Enter the user ID:\n");

						uid = Scanner.nextInt();
						Integer Userid;
						for (int j = 0; j < 10000; j++) {
							Userid = users[j].getUserId();
							if ((Userid != null) && (Userid == uid)) {
								users[j].setUserName(null);
								users[j].setUserAge(null);
								users[j].setUserGender(null);
								users[j].setNationalID(null);
							}
						}
					}
					case 5 -> {
						System.out.println("Enter the book title:");
						books[booknum].setTitle(Scanner.next());

						System.out.println("Enter the book author:");
						books[booknum].setAuthor(Scanner.next());

						System.out.println("Enter the book Pages:");
						books[booknum].setPages(Scanner.nextInt());

						System.out.println("The book ID is: " + (200 + booknum) + "\n");
						books[booknum].setBookId((200 + booknum));
						booknum++;
					}
					case 6 -> {
						System.out.println("Enter the book ID:");
						bid = Scanner.nextInt();
						Integer Bookid;
						for (int j = 0; j < 10000; j++) {
							Bookid = books[j].getBookId();
							if ((Bookid != null) && (Bookid == bid)) {
								if ( (books[j].getTitle() != null) && (books[j].getAuthor() != null) && (books[j].getPages() != null)) {
									System.out.println("Book title is:\t " + books[j].getTitle());
									System.out.println("Book author is:\t " + books[j].getAuthor());
									System.out.println("Book pages are:\t " + books[j].getPages() + "\n");
								}
								else
									System.out.println("There isn't any book with this BOOK ID !!\n");
							}
						}
					}
					case 7 -> {
						System.out.println("Enter the book ID:");
						bid = Scanner.nextInt();
						Integer Bookid;
						for (int j = 0; j < 10000; j++) {
							Bookid = books[j].getBookId();
							if ((Bookid != null) && (Bookid == bid)) {
								System.out.println("Please enter new book title: ");
								books[j].setTitle((Scanner.next()));
								System.out.println("Please enter new book author: ");
								books[j].setAuthor((Scanner.next()));
								System.out.println("Please enter new book pages: ");
								books[j].setPages((Scanner.nextInt()));
							}
						}
						//else
						//exit from program
					}

					case 8 -> {
						System.out.println("Enter the book ID:");
						bid = Scanner.nextInt();
						Integer Bookid;
						for (int j = 0; j < 10000; j++) {
							Bookid = books[j].getBookId();
							if ((Bookid != null) && (Bookid == bid)) {
								books[j].setTitle(null);
								books[j].setAuthor(null);
								books[j].setPages(null);
							}
						}
						//else
						//exit from program
					}
				}
			}

		}
	}
}