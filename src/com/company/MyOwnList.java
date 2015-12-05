package com.company;

/**
 * Created by Paula on 30.11.2015.
 */
public class MyOwnList
{
    public Object elements[];
    public int size, currentSize = 0;

    public MyOwnList(){
        this.elements = new Object[10];
        this.size = 10;
    }

    void addToList(Object element){
        if(this.currentSize >= this.size){
            Object newElements[] = new Object[size+10];
            System.arraycopy(this.elements, 0, newElements, 0, size);
            this.size += 10;
            this.elements = newElements;
        }
        this.elements[currentSize] = element;
        currentSize+=1;
    }

    Object getElement(int index){
        return this.elements[index];
    }

    int getSize(){
        return this.currentSize;
    }

    boolean isOnTheList(Object obj){
        int count = 0;
        for(int i = 0; i < this.currentSize; i++){
            if (this.elements[i] == obj)
                count += 1;
        }
        if(count > 0)
            return true;
        else
            return false;
    }

    void printElements(){
        for(int i = 0; i < this.currentSize; i++){
            if (this.elements[i] != null) {
                System.out.println("Element " + i + ":\t" + this.elements[i]);
            }
        }
    }

    void deleteElement(int index){
        this.elements[index] = null;
        Object newElements[] = new Object[size-1];
        int k = 0;
        for (int i = 0; i < size; i++){
            if(this.elements[i] != null){
                newElements[k] = this.elements[i];
                k++;
            }
        }
        this.currentSize -= 1;
        this.elements = newElements;
    }

}
