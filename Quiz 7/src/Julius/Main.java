package Julius;

public class Main {

    public static void main(String[] args) {
	    Tree tree = new Tree();

	    tree.insert(32);
        tree.insert(89);
        tree.insert(18);
        tree.insert(76);
        tree.insert(69);
        tree.insert(42);

        System.out.println("Original Order:");
        tree.traverseInOrder();

        System.out.println("\nIn Reverse:");
        tree.traverseInReverse();

        System.out.println("\nGet Min:");
        System.out.println(tree.getMin());

        System.out.println("\nGet Max:");
        System.out.println(tree.getMax());
    }
}
