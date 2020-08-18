package by.bntu.fitr.povt.graphTheory.case1.dataStructures.tree;

/**
 * @author Alexey Druzik on 18.08.2020
 */
public class Tree {
    int value;
    Tree left;
    Tree right;

    public Tree(int value, Tree left, Tree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Tree(int value) {
        this.value = value;
    }
}