package by.bntu.fitr.povt.graphTheory.case1.dataStructures.tree;

import by.bntu.fitr.povt.graphTheory.case1.dataStructures.queue.SimpleQueue;
import by.bntu.fitr.povt.graphTheory.case1.dataStructures.stack.SimpleStack;

/**
 * @author Alexey Druzik on 01.06.2020
 */
public class TreeSimmulator {
    public static void main(String[] params) {
        Tree root =
            new Tree(20,
                new Tree(7,
                    new Tree(4, null, new Tree(6)), new Tree(9)),
                new Tree(35,
                    new Tree(31, new Tree(28), null),
                    new Tree(40, new Tree(38), new Tree(52))));

        System.out.println("Сумма дерева: " + sumWide(root));
    }

    public static int sumRecursive(Tree root) {
        int summ = root.value;

        if (root.left != null) {
            summ += sumRecursive(root.left);
        }

        if (root.right != null) {
            summ += sumRecursive(root.right);
        }
        return summ;
    }

    public static int sumDeep(Tree root) {
        SimpleStack<Tree> stack = new SimpleStack<>();
        stack.push(root);

        int summ = 0;

        while (!stack.isEmpty()) {
            Tree node = stack.pop();

            System.out.println(node.value);

            summ = summ + node.value;

            if (node.right != null) {
                stack.push(node.right);
            }

            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return summ;
    }

    public static int sumWide(Tree root) {
        SimpleQueue<Tree> stack = new SimpleQueue<>();
        stack.add(root);

        int summ = 0;

        while (!stack.isEmpty()) {
            Tree node = stack.remove();

            System.out.println(node.value);

            summ = summ + node.value;

            if (node.left != null) {
                stack.add(node.left);
            }

            if (node.right != null) {
                stack.add(node.right);
            }
        }
        return summ;
    }
}
