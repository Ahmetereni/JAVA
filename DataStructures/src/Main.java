public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(5);
        list.insert(4);
        list.insert(2);
        list.insert(55);
        list.insert(7);

        list.insertAt(0, 87);
        list.show();

    }
}