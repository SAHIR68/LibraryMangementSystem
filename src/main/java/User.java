import java.util.Scanner;

public class User{
		//properties
		private String userName;
		private Integer userAge;
		private Integer userId;
		private String userGender;

		private String nationalID;

		private static int MAX_AGE = 150;

		enum UserStatus{
			BORROWED,
			RETURNED
		}

	//constructor

	public User(){

	}
		//setters
		public void setUserName(String n ){
			userName = n;
		}
		public void setUserAge(Integer a) {
		//FIXme(for deleting account I cant use null!!)
			//if (a < MAX_AGE)
				userAge = a;
		}
		public void setUserId(Integer id) {
			userId = id;
		}
		public void setUserGender(Gender g) {
			userGender = String.valueOf(g);
		}

		//getters

		public String getUserName() {
			return userName;
		}

		public Integer getUserAge() {
			return userAge;
		}

		public Integer getUserId() {
			return userId;
		}
		public void setNationalID(String nationalID) {
			this.nationalID = nationalID;
		}

		public String  getNationalID() {
			return nationalID;
		}

	public String getUserGender() {
			return userGender;
		}

		enum Gender{
			MALE(1),
			FEMALE(2);

			private int number;
			Gender(int i){
				number = i;
			}
			public int getNumber(){
				return number;
			}
		}

		//Methods
		public void borrow(Book b) {
			System.out.println("He/She borrowed " + b.getTitle() + " book");
		}
		public void giveback(Book b) {
			System.out.println("He/She returned" + b.getTitle() + "book");
		}
	}