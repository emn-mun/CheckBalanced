public class Main {

    public static void main(String[] args) {
//        Node nMinus1 = new Node(-1);
//        Node n0 = new Node(0, nMinus1, null);
//        Node n1 = new Node(1, n0, null);
        Node n1 = new Node(1);
        Node n3 = new Node(3);
        Node n7 = new Node(7);
        Node n9 = new Node(9);
        Node n2 = new Node(2, n1, n3);
        Node n8 = new Node(8, n7, n9);
        Node n5 = new Node(5, n2, n8);

        // Comment n1 and uncomment from the top to get a false result scenario
        System.out.println(CheckBalanced.checkBalanced(n5));
    }
}