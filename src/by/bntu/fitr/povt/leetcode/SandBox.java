package by.bntu.fitr.povt.leetcode;

import by.bntu.fitr.povt.leetcode.base.TreeNode;

import java.util.*;


class SandBox {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3, new TreeNode(9, new TreeNode(1), null), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        TreeNode treeNode2 = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), null),
                null);
        List<List<Integer>> list = preOrder(treeNode);
        System.out.println(list);
    }

    private static List<List<Integer>> bfs(TreeNode treeNode) {
        List<List<Integer>> list = new ArrayList<>();
        List<TreeNode> queue = new LinkedList<>();
        queue.add(treeNode);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> subList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                if (queue.get(queue.size()-1).left != null) {
                    queue.add(queue.get(queue.size()-1).left);
                }
                if (queue.get(i).right != null) {
                    queue.add(queue.get(queue.size()-1).right);
                }
                int val = queue.remove(queue.size()-1).val;
                subList.add(val);
            }
            list.add(subList);
        }
        return list;
    }

    private static List<List<Integer>> preOrder(TreeNode treeNode) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(treeNode);
        List<List<Integer>> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            int size = stack.size();
            List<Integer> subList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode pop = stack.pop();
                if (pop.right != null) {
                    stack.push(pop.right);
                }
                if (pop.left != null) {
                    stack.push(pop.left);
                }
                subList.add(pop.val);
            }
            list.add(subList);
        }

        return list;
    }

}

