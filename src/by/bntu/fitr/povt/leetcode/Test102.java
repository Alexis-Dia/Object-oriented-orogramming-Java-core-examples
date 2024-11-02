package by.bntu.fitr.povt.leetcode;

import by.bntu.fitr.povt.leetcode.base.TreeNode;

import java.util.*;

/**
 * Breadth-First Search - Обход графа ширину
 */
class Test102 {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3, new TreeNode(9, new TreeNode(1), new TreeNode(1)), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        TreeNode treeNode2 = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), null),
                null);
        List<List<Integer>> list = bfs(treeNode); //BFS
        System.out.println(list);
    }
























    private static List<List<Integer>> bfs(TreeNode treeNode) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(treeNode);
        List<List<Integer>> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            List<Integer> subList = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                if (queue.peek().left != null) {
                    queue.add(queue.peek().left);
                }
                if (queue.peek().right != null) {
                    queue.add(queue.peek().right);
                }
                int val = queue.remove().val;
                subList.add(val);
            }
            list.add(subList);
        }
        return list;
    }

    public static List<Integer> width(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.peek();
            if (treeNode.left != null) {
                queue.add(treeNode.left);
            }
            if (treeNode.right != null) {
                queue.add(treeNode.right);
            }
            int val = queue.remove().val;
            list.add(Integer.valueOf(val));
        }
        return list;
    }





































}

