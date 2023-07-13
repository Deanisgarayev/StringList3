package org.example;

public interface IntegerList {

    Integer add(Integer item);

    Integer add(int index, Integer item);

    Integer set(int index, Integer item);

    Integer remove(Integer item);

    Integer remove(int index);

    boolean contains(Integer item);

    int indexOF(Integer item);

    int lastIndexOF(Integer item);

    Integer get(int index);

    boolean equals(IntegerList otherList);

    int size();

    boolean isEmpty();

    void clear();

    Integer[] toArray();

    void sort(Integer[] arr);

    boolean binaryResearch(Integer[] arr, Integer item);
}
