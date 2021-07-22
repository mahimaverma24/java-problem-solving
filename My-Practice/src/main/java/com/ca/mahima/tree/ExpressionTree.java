package com.ca.mahima.tree;

public class ExpressionTree {
    static TreeNodeString node;
    public static void main(String[] args) {
        node  = new TreeNodeString("+");
        node.left = new TreeNodeString("*");
        node.left.left = new TreeNodeString("5");
        node.left.right = new TreeNodeString("-4");
        node.right  =new TreeNodeString("-");
        node.right.left = new TreeNodeString("100");
        node.right.right = new TreeNodeString("20");
    }
}
