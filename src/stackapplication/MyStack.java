/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package stackapplication;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Daniel García
 * 30 ene 2024
 */
public class MyStack implements StackInterface{
    
    ArrayList<Wagon> stackList;
    
    public MyStack() {
        stackList = new ArrayList<>();
    }

    @Override
    public void push(Object w) {
        stackList.add(0, (Wagon) w); //Add wagon to the first position of the list
    }

    @Override
    public Object pop() {
        if(isEmpty()){
            return null;
        }else{
            return stackList.remove(0); //Remove element on first position
        }
    }

    @Override
    public Object peek() {
        if(isEmpty()){
            return null;
        }else{
            return stackList.get(0); //Show element on first position
        }
    }

    @Override
    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    @Override
    public int size() {
        return stackList.size();
    }

    @Override
    public String displayStack() {
        String output = "";
        int counter = 0;
        if(isEmpty()){
            output += "There is no wagons attached to the train";
            return output;
        }else{
            Iterator it = stackList.iterator();
            while(it.hasNext()){
                output += "Element " + counter + ": " + (String)it.next().toString() + "\n";
                counter++;
            }
            return output;
        }
    }

    @Override
    public String emptyStack() {
        String output = "";
        if(isEmpty()){
            output += "Stack is empty now.";
            return output;
        }else{
            Iterator it = stackList.iterator();
            while(it.hasNext()){
                Wagon wagDel = (Wagon) pop();
                output += "\nWagon '" + wagDel.getWagonName() + "' was deleted";
            }
            return output;
        }
    }
}
