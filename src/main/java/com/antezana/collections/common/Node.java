package com.antezana.collections.common;

/**
 * Node class.
 *
 * @param <T> The type
 * @author jantezana
 * @since 2022/07/19
 */
public class Node<T> {

    private T data;
    private Node<T> next;

    /**
     * Builds an instance of {@link Node}
     */
    public Node() {
    }

    /**
     * Builds an instance of {@link Node}
     *
     * @param data The value of data
     */
    public Node(T data) {
        this.data = data;
    }

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    /**
     * Gets the value of data
     *
     * @return The value of data
     */
    public T getData() {
        return data;
    }

    /**
     * Sets the value of data.
     *
     * @param data The new value of data
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * Gets the next node.
     *
     * @return The next node
     */
    public Node<T> getNext() {
        return next;
    }

    /**
     * Sets the value of next node
     *
     * @param next The new next node
     */
    public void setNext(final Node<T> next) {
        this.next = next;
    }
}
