package com.practice.ds;

public class FindKthLargestElement {
    public static Node root;
    private static int counter;
    public FindKthLargestElement() {
        this.root = null;
    }
    public void insert(int id) {
        Node newNode = new Node(id);
        if (root == null) {
            root = newNode;
            return;
        }
        Node current = root;
        Node parent = null;
        while (true) {
            parent = current;
            if (id < current.data) {
                current = current.left;
                if (current == null) {
                    parent.left = newNode;
                    return;
                }
            } else {
                current = current.right;
                if (current == null) {
                    parent.right = newNode;
                    return;
                }
            }
        }
    }

    private static Node findKthLargestItem(Node rootNode, int k) {
        if (rootNode == null) {
            return null;
        }

        // Instead of Left to Right, we will traverse in Right to Left fashion
        // because largest element
        // are present of Right side of Root Node.
        Node node = findKthLargestItem(rootNode.right, k);

        // If counter is not equal to K, then only increment the counter.
        // Once counter is equal to K, it means we have found the desired
        // largest element and no need to increment further,
        // Take the back up of the current node as it might be the Kth largest
        // element we are looking for.
        if (counter != k) {
            counter++;
            node = rootNode;
        }

        // This is the place where actual check is going to happen between
        // counter and K,
        // If counter matched K, it means we found the node and no need to find
        // further so simply return the found node.
        if (counter == k) {
            return node;
        } else {
            return findKthLargestItem(rootNode.left, k);
        }
    }

    public void display(Node root) {
        if (root != null) {
            display(root.left);
            System.out.print(" " + root.data);
            display(root.right);
        }
    }

    public static void main(String arg[]) {
        FindKthLargestElement b = new FindKthLargestElement();
        b.insert(3);
        b.insert(8);
        b.insert(1);
        b.insert(4);
        b.insert(6);
        b.insert(2);
        b.insert(10);
        b.insert(9);
        b.insert(20);
        b.insert(25);
        b.insert(15);
        b.insert(16);

        System.out.println("Original Tree : ");
        b.display(b.root);

        Node kthLargestNode = findKthLargestItem(root, 5);
        if (kthLargestNode != null) {
            System.out.println(" Kth Largest Node is :" + kthLargestNode.data);
        } else {
            System.out.println("Kth Largest Node not found");
        }

    }
}

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
