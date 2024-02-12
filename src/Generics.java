public class Generics {
    public static void main(String [] args){
        AList booksList = new AList();
        Book book1 = new Book("wireless networks", "Anke Berr", 14.99);
        Book book2 = new Book("crème waffles for dummies", "Piro Lane", 24.79);

        booksList.listAdd(book1);
        booksList.listAdd(book1);
        booksList.listAdd(book2);
        booksList.listAdd(book1);

        System.out.println(booksList);

        booksList.listRemove(1);

        System.out.println(booksList);


    }
}
