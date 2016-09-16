package com.practice.ds;

public class FindKLargestElementInBinarySearchTree {
    private Node rootNode;
    private static int counter;

    public static void main(String[] args) {
        new FindKLargestElementInBinarySearchTree();
    }

    public FindKLargestElementInBinarySearchTree() {
        addNode(rootNode, 40);
        addNode(rootNode, 20);
        addNode(rootNode, 60);
        addNode(rootNode, 10);
        addNode(rootNode, 30);
        addNode(rootNode, 50);
        addNode(rootNode, 70);

        printTreeInOrder(rootNode);
        System.out.println();

        Node kthLargestNode = findKthLargestItem(rootNode, 1);
        if (kthLargestNode != null) {
            System.out.println("Kth Largest Node is :" + kthLargestNode.data);
        } else {
            System.out.println("Kth Largest Node not found");
        }
    }

    private Node findKthLargestItem(Node rootNode, int k) {
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

    private void printTreeInOrder(Node rootNode) {
        if (rootNode == null)
            return;
        printTreeInOrder(rootNode.left);
        System.out.print(rootNode.data + " ");
        printTreeInOrder(rootNode.right);
    }

    private void addNode(Node rootNode, int data) {
        if (rootNode == null) {
            Node temp1 = new Node(data);
            this.rootNode = temp1;
        } else {
            addNodeInProperPlace(rootNode, data);
        }
    }

    private void addNodeInProperPlace(Node rootNode, int data) {
        if (data > rootNode.data) {
            if (rootNode.right != null) {
                addNode(rootNode.right, data);
            } else {
                Node temp1 = new Node(data);
                rootNode.right = temp1;
            }
        } else if (data < rootNode.data) {
            if (rootNode.left != null) {
                addNode(rootNode.left, data);
            } else {
                Node temp1 = new Node(data);
                rootNode.left = temp1;
            }
        }
    }

}