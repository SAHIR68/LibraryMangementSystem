public class Book{
		//properties
		private String title;

		private String author;
		private Integer bookId;
		private Integer Pages;

        enum BookStatus{
                BORROWED,
                BINDING,
                READY
            }
		//constructor
		public Book(String t, int bi,int p){
			title = t;
			bookId = bi;
			Pages = p;
			//System.out.println("esme ketab shod " + title);
		}
    public Book(){

    }

		//setters
		public void setBookId(Integer b){
			bookId = b;
		}
		public void setTitle(String t) {

			//if (t.contains("!")){
			//	throw new RuntimeException("hoooooo !!!!!");
			//}else {
				title = t;
			//}
			//System.out.println("esme ketab shod "+ title);
		}
		public void setPages(Integer p) {
			Pages = p;
		}



		public void setAuthor(String author) {
			this.author = author;
		}
	//getter

		public String getAuthor() {
			return author;
		}
		public Integer getBookId() {
		return bookId;
	}

		public String getTitle() {
		return title;
		}

		public Integer getPages() {
			return Pages;
		}

		//Methods
			public void borrowed() {
				System.out.println("This  book is returned! ");
			}
			public void returned() {
				System.out.println("This  book is returned! ");
			}
			public void binding() {
				System.out.println("This book is in binding process!");
			}
		}