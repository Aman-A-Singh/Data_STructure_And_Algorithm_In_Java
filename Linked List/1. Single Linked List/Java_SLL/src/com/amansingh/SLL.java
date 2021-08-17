/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amansingh;

/**
 *
 * @author Aman Singh
 */
public class SLL<T> implements SingleLinearLinkedList<T> {

    private class Node<T> {

        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }
    private Node root;

    @Override
    public void append(T record) {
        Node<T> newNode = new Node<T>(record);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node<T> ptr = root;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = newNode;
        }
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public void print() {
        Node<T> ptr = root;
        while(ptr!=null){
            System.out.println(ptr.data);
            ptr = ptr.next;
        }
    }

    @Override
    public boolean remove(int position) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(T record) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T search(T record) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reset() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
