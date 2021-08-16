package com.amansingh;

/**
 *
 * @author Aman Singh
 */
public interface SingleLinearLinkedList<T> {

    /**
     * Append the Node to the List
     * @param record
     */
    public void append(final T record);

    /**
     * Returns true if the list is empty else returns false
     * @return Returns Boolean Value
     */
    public boolean isEmpty();

    /**
     * Prints the Nodes from the List
     */
    public void print();

    /**
     * Delete the Node from the List if the given position Returns true on
     * success else throw std::range_error
     * @return Returns Boolean Value
     */
    public boolean remove(int position);

    /**
     * Delete the Node from the List by comparing the record
     * @return Returns Boolean Value
     */
    public boolean remove(final T record);

    /**
     * Search for the record in the list.On success returns raw pointer Pointing
     * to the record and on failure returns null
     * @return return T
     */
    public T search(final T record);

    /**
     * Reset the List making it empty
     */
    public void reset();
}
