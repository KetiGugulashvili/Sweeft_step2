package sweeft.acceleration.task;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/**
 * Data structure with the operation in O(1) time complexity.
 *
 * @param <T> The type of elements to store in the data structure.
 */
public class DataStructure<T> {
    // To store data with the corresponding node
    private final Map<T, Node<T>> dataNodes;
    private Node<T> first;
    private Node<T> last;
    private int size;

    public DataStructure() {
        this.dataNodes = new HashMap<>();
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    /**
     * Adds an element to the end of the data structure.
     *
     * @param data The data to add.
     */
    public void add(T data) {
        Node<T> instance = new Node<>(data);
        if (this.first == null) {
            this.first = instance;
        } else {
            this.last.next = instance;
            instance.prev = this.last;
        }
        this.last = instance;
        this.dataNodes.put(data, instance);
        this.size++;
    }

    /**
     * Removes an element if it exists, or throws an error.
     *
     * @param data The data to remove.
     */
    public void remove(T data) {
        if (this.dataNodes.containsKey(data)) {
            Node<T> node = this.dataNodes.get(data);
            removeNode(node);
            this.dataNodes.remove(data);
        } else {
            throw new NoSuchElementException("Such element does not exist in the sequence.");
        }
    }

    /**
     * Returns the number of elements in the data structure.
     *
     * @return The size of the data structure.
     */
    public int size() {
        return this.size;
    }

    private void removeNode(Node<T> node) {
        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            this.first = node.next;
        }
        if (node.next != null) {
            node.next.prev = node.prev;
        } else {
            this.last = node.prev;
        }
        this.size--;
    }

    private static class Node<T> {
        private final T data;
        private Node<T> prev;
        private Node<T> next;

        private Node(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

    @Override
    public String toString() {
        return "DataStructure{" +
                "dataNodes=" + this.dataNodes +
                ", size=" + this.size +
                '}';
    }
}
