package com.ca.mahima.tree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class TopViewOfBST {
    public static Node root;

    public static void main(String[] args) {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);

        topView(root);

    }

    private static void topView(Node root) {
        class QueueObj {
            Node node;
            int hd;

            QueueObj(Node node, int hd) {
                this.node = node;
                this.hd = hd;
            }
        }
        Queue<QueueObj> q = new LinkedList<>();
        Map<Integer, Node> topViewMap
                = new TreeMap<>();

        if (root == null) {
            return;
        } else {
            q.add(new QueueObj(root, 0));
        }

        System.out.println(
                "The top view of the tree is : ");

        // count function returns 1 if the container
        // contains an element whose key is equivalent
        // to hd, or returns zero otherwise.
        while (!q.isEmpty()) {
            QueueObj tmpNode = q.poll();
            if (!topViewMap.containsKey(tmpNode.hd)) {
                topViewMap.put(tmpNode.hd, tmpNode.node);
            }

            if (tmpNode.node.left != null) {
                q.add(new QueueObj(tmpNode.node.left,
                        tmpNode.hd - 1));
            }
            if (tmpNode.node.right != null) {
                q.add(new QueueObj(tmpNode.node.right,
                        tmpNode.hd + 1));
            }
        }
        for (Map.Entry<Integer, Node> entry :
                topViewMap.entrySet()) {
            System.out.print(entry.getValue().data);
        }
    }

}
