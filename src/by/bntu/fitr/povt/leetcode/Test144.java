package by.bntu.fitr.povt.leetcode;

import by.bntu.fitr.povt.leetcode.base.TreeNode;

import java.util.*;

/**
 * Depth-First Search - поиск в глубину
 */
class Test144 {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3, new TreeNode(9, new TreeNode(1), null), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        TreeNode treeNode2 = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), null),
                null);
        List<Integer> lists2 = dfsPreOrderTraversal(treeNode); //DFS
        System.out.println(lists2);
    }







    private static List<Integer> dfsPreOrderTraversal(TreeNode treeNode) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(treeNode);
        List<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            TreeNode pop = stack.pop();
            list.add(Integer.valueOf(pop.val));
            if (pop.right != null) {
                stack.push(pop.right);
            }
            if (pop.left != null) {
                stack.push(pop.left);
            }
        }
        return list;
    }

    private static List<Integer> preOrder(TreeNode treeNode) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(treeNode);
        List<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            TreeNode pop = stack.pop();
            if (pop.right != null) {
                stack.push(pop.right);
            }
            if (pop.left != null) {
                stack.push(pop.left);
            }
            list.add(Integer.valueOf(pop.val));
        }

        return list;
    }




































}

