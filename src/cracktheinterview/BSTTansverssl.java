package crackintreview;

import java.util.*;
import java.io.*;

class tNode {

    tNode left, right;
    int data;

    tNode(int data) {
        this.data = data;
        left = right = null;
    }
}

class BSTTranverssl {

    static void levelOrder(tNode root) {
        LinkedList<tNode> pila = new LinkedList<>();
        String lista = "";
        if (root != null) {
            pila.add(root);
            lista = new Integer(root.data).toString();
            lista = level(pila, lista);
        }

        
        System.out.print(lista);
        

    }

    static String level(LinkedList<tNode> pila, String lista) {
        while (!pila.isEmpty()) {
            tNode root = pila.getFirst();
            pila.removeFirst();
            if (root.left != null) {
                pila.add(root.left);
                lista += " " + root.left.data;
            }
            if (root.right != null) {
                pila.add(root.right);
                lista += " " + root.right.data;
            }
        }
        return lista;

    }

    public static tNode insert(tNode root, int data) {
        if (root == null) {
            return new tNode(data);
        } else {
            tNode cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        tNode root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);

    }
}
