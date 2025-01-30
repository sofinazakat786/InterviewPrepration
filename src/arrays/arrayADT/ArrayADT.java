package arrays.arrayADT;

public class ArrayADT {

    private int[] array;    //array: to store data
    private int index;       //size: size of the array
    private int size;   //capacity: total capacity of the array

    //constructor to initialize the array
    public ArrayADT(int size){
        this.size = size;
        this.array = new int[this.size];
        this.index = 0;
    }

    //insert element at the end of the array
    public void insert(int element){
        if(this.index == this.size){
            System.out.println("Can't insert as Array is full");
        }
        else{
            this.array[this.index] = element;
            this.index++;
        }
    }
    //delete element at index
    public void delete(int deleteIndex){
        if(deleteIndex < 0 || deleteIndex >= this.index){
            System.out.println("Invalid index");
        }
        else{
            for(int i = deleteIndex; i < this.index-1; i++){
                this.array[i] = this.array[i+1];
            }
            System.out.println("Element deleted at index: " + deleteIndex);
            this.index--;
        }

    }
    //search element in the array
    public int search(int element){
        for(int i = 0; i < this.index; i++){
            if(this.array[i] == element){
                return i;
            }
        }
        return -1;
    }
    //update element at index
    public void update(int updateIndex, int element){
        if(updateIndex < 0 || updateIndex >= this.index){
            System.out.println("Invalid index");
        }
        else{
            this.array[updateIndex] = element;
            System.out.println("Element updated");
        }
    }
    //get element at index
    public int getElement(int index){
        if(index < 0 || index >= this.index){
            System.out.println("Invalid index");
            return -1;
        }
        else{
            return this.array[index];
        }
    }
    //display the array
    public void display(){
        System.out.print("Array elements: ");
        for(int i = 0; i < this.index; i++){
            System.out.print(this.array[i] + " ");
        }
        System.out.println();
    }
    //Get size
    public void getSize(){
        System.out.println("Size of the array: " + this.size);
    }



}
