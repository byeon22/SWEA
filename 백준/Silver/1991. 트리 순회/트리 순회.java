import java.io.*;
import java.util.*;

class Node {
    public String node;
    public String left;
    public String right;

    public boolean visited;

    public Node(String node, String left, String right) {
        this.node = node;
        this.left = left;
        this.right = right;
    }
}

public class Main {

    static TreeMap<String, Node> tree = new TreeMap<>();
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        visited = new boolean[N+1];

        String node;
        String left;
        String right;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            node = st.nextToken();
            left = st.nextToken();
            right = st.nextToken();

            tree.put(node, new Node(node, left, right));
        }

        preorder(tree.firstKey());
        System.out.println(sb);
        sb.setLength(0);

        inorder(tree.firstKey());
        System.out.println(sb);
        sb.setLength(0);

        postorder(tree.firstKey());
        System.out.println(sb);
        sb.setLength(0);
    }

    public static void preorder(String node) {
        sb.append(node);
        tree.get(node).visited = true;

        if (!Objects.equals(tree.get(node).left, ".") && !tree.get(tree.get(node).left).visited) {
            preorder(tree.get(node).left);
        }
        if (!Objects.equals(tree.get(node).right, ".") && !tree.get(tree.get(node).right).visited) {
            preorder(tree.get(node).right);
        }
    }

    public static void inorder(String node) {
        if (!Objects.equals(tree.get(node).left, ".")) {
            inorder(tree.get(node).left);
        }
        sb.append(node);
        if (!Objects.equals(tree.get(node).right, ".")) {
            inorder(tree.get(node).right);
        }
    }

    public static void postorder(String node) {
        if (!Objects.equals(tree.get(node).left, ".")) {
            postorder(tree.get(node).left);
        }
        if (!Objects.equals(tree.get(node).right, ".")) {
            postorder(tree.get(node).right);
        }
        sb.append(node);
    }
}