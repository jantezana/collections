package com.antezana.collections;

import com.antezana.collections.linkedlist.CustomLinkedList;

/**
 * Main class.
 *
 * @author jantezana
 * @since 2022.07/19
 */
public class Main {

    public static void main(final String[] args) {
        try {
            CustomLinkedList<Integer> integerCustomLinkedList = new CustomLinkedList<>();
            integerCustomLinkedList.push(1);
            integerCustomLinkedList.push(5);
            integerCustomLinkedList.push(7);
            integerCustomLinkedList.push(10);
            integerCustomLinkedList.push(15);

            for (Integer integer : integerCustomLinkedList) {
                System.out.println(integer);
            }

            Integer top = integerCustomLinkedList.top();
            System.out.println(String.format("Top: %d", top));

            Integer last = integerCustomLinkedList.last();
            System.out.println(String.format("Last: %d", last));

            integerCustomLinkedList.pop();
            integerCustomLinkedList.pop();
            integerCustomLinkedList.pop();
            integerCustomLinkedList.pop();
            integerCustomLinkedList.pop();

            for (Integer integer : integerCustomLinkedList) {
                System.out.println(integer);
            }

            top = integerCustomLinkedList.top();
            System.out.println(String.format("Top: %d", top));

            last = integerCustomLinkedList.last();
            System.out.println(String.format("Last: %d", last));

            integerCustomLinkedList.pop();
        } catch (RuntimeException runtimeException) {
            System.err.println(String.format("Exception: %s", runtimeException.getMessage()));
        }
    }
}
