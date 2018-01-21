package com.AlanWang;
import java.util.ArrayList;

public class GroceryList {
    // no constructor
    // private field
    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGrocerItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++){
            System.out.println((i+1) + "." + groceryList.get(i));
        }
    }

    private void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + "has been modified");
    }

    // Overloading
    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItemIndex(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    // Overloading
    public void removeGroceryItem(String item) {
        int position = findItemIndex(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    private String findItem(String searchItem){
//        boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if (position >= 0) {
            return groceryList.get(position);
        }

        return  null;
    }

    private int findItemIndex(String searchItem){
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItemIndex(searchItem);
        if (position >= 0) {
            return true;
        }

        return false;
    }
}
