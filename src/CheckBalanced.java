public class CheckBalanced {
    public static boolean checkBalanced(Node root) {
        return getBalanced(root) != Integer.MIN_VALUE;
    }

    private static int getBalanced(Node root) {
        if (root == null) return -1;
        int leftMaxHeight = getBalanced(root.left);
        if (leftMaxHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;

        int rightMaxHeight = getBalanced(root.right);
        if (rightMaxHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;

        int diff = Math.abs(leftMaxHeight - rightMaxHeight);
        int height = Math.max(leftMaxHeight, rightMaxHeight) + 1;
        return (diff < 2) ? height : Integer.MIN_VALUE;
    }
}
