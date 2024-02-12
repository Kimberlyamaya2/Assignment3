
public class AList extends Generics {
    private final int maxSize = 10;
    private Book[] array;
    private int size;
    public AList() {
       array = new Book[maxSize];
       size = 0;
    }

    public void listAdd(Book p){
        if (size == array.length){
           int newCap = array.length * 2;
           Book [] newArray = new Book[newCap];
           System.arraycopy(array, 0, newArray, 0, size);
           array = newArray;
        }
        array[size++] = p;
    }

    public void listRemove(int pos){
        if (pos < 0 || pos >= size) {
            System.out.print("Invalid Position");
        }

        for(int i = pos; i < size - 1; i++){
            array[i] = array[i+1];
        }
        array[size - 1] = null;
        size --;
    }

    public String toString(){
        StringBuilder elements = new StringBuilder();

        for(int i = 0; i < size; i++){
            elements.append(array[i].toString()).append("\n");
        }

        return elements.toString();
    }
}
