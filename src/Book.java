public class Book extends Generics {
        private String title;
        private String author;
        private double price;

        public Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        public static void main(String[] args) {
        Book book = new Book("Black Clover", "Yuki Tabata", 29.99);

        System.out.println("Book Title: " + book.getTitle());
        System.out.println("Book Author: " + book.getAuthor());
        System.out.println("Book Price: $" + book.getPrice());
    }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String toString() {
            return "{book" +
                    "Name: " + title +
                    ", author: " + author +
                    ", price: " + price +
                    '}';
        }
    }
