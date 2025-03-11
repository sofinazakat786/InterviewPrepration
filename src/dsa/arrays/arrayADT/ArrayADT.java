package dsa.arrays.arrayADT;

public interface ArrayADT {
    //insert element at the end of the array
    void insert(int element);

    //delete element at index
    void delete(int deleteIndex);

    //search element in the array
    int search(int element);

    //update element at index
    void update(int updateIndex, int element);

    //get element at index
    int getElement(int index);

    //display the array
    void display();

    //Get size
    void getSize();
}
