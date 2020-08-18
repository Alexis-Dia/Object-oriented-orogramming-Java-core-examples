package by.bntu.fitr.povt.graphTheory.case1.dataStructures.stack;

/**
 * @author Alexey Druzik on 01.06.2020
 */
public interface Stack<T> {
    void push(T item);      //добавить элемент на вершину стека
    T pop();                //взять элемент с вершины стека

    boolean isEmpty();
}
