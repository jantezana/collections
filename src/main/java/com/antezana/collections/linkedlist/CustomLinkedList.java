package com.antezana.collections.linkedlist;

import com.antezana.collections.common.Node;
import com.antezana.collections.exceptions.CollectionException;

import java.util.Iterator;
import java.util.Objects;

/**
 * CustomLinkedList class.
 *
 * @param <T> The type
 * @author jantezana
 * @since 2022/07/19
 */
public class CustomLinkedList<T> implements Iterable<T>{

    private Node<T> top;
    private Node<T> bottom;

    /**
     * Builds an instance of {@link CustomLinkedList}
     */
    public CustomLinkedList() {
    }

    /**
     * Insert data in the top node.
     *
     * @param data The data to insert
     * @return The inserted data
     */
    public T push(T data) {
        Node<T> newNode = new Node<>(data);
        if (this.isEmpty()) {
            this.top = newNode;
            this.bottom = newNode;
        } else {
            Node<T> currentNode = new Node<>(this.top.getData(), this.top.getNext());
            newNode.setNext(currentNode);
            this.top = newNode;
        }

        return data;
    }

    /**
     * Removes The top data.
     *
     * @return The removed data
     */
    public T pop() {
        T result;
        if (this.isEmpty()) {
            throw new CollectionException("The collections is Empty");
        } else  {
            result = this.top.getData();
            this.top = this.top.getNext();

            if (Objects.isNull(this.top)) {
                this.bottom = null;
            }
        }

        return result;
    }

    /**
     * Checks if the collection is empty.
     *
     * @return True if the collection is empty
     */
    public boolean isEmpty() {
        return Objects.isNull(this.top) && Objects.isNull(this.bottom);
    }

    /**
     * Gets the top data.
     *
     * @return The top data
     */
    public T top() {
        return Objects.nonNull(this.top) ? this.top.getData() : null;
    }

    /**
     * Gets the last data.
     *
     * @return The last data
     */
    public T last() {
        return Objects.nonNull(this.bottom) ? this.bottom.getData() : null;
    }

    @Override
    public Iterator<T> iterator() {
        Iterator<T> iterator = new Iterator<T>() {

            private Node<T> currentValue = top;

            @Override
            public boolean hasNext() {
                return Objects.nonNull(currentValue);
            }

            @Override
            public T next() {
                T data = currentValue.getData();
                currentValue = currentValue.getNext();
                return data;
            }
        };

        return iterator;
    }
}
