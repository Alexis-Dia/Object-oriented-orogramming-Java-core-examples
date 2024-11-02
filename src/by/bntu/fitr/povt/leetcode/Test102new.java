package by.bntu.fitr.povt.leetcode;

import by.bntu.fitr.povt.leetcode.base.TreeNode;

import java.util.*;

public class Test102new {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3, new TreeNode(9, new TreeNode(1), null), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        TreeNode treeNode2 = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), null),
                null);
        List<Integer> list = width(treeNode);
        System.out.println(list);
    }

    public static List<Integer> width(TreeNode treeNode) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(treeNode);
        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }

            list.add(node.val);
        }
        return list;
    }

    public static List<Integer> depth(TreeNode treeNode) {
        Stack<TreeNode> queue = new Stack<>();
        queue.add(treeNode);
        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode node = queue.pop();
            if (node.right != null) {
                queue.push(node.right);
            }
            if (node.left != null) {
                queue.push(node.left);
            }

            list.add(node.val);
        }
        return list;
    }

}
