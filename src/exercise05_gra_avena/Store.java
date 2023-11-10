/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise05_gra_avena;
import java.util.ArrayList;
/**
 *
 * @author Haisuri
 */

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
      // Initialization of instance
      this.name = name;
      this.earnings = 0;
      // Creates new array 'itemList' with datatype 'Item'
      itemList = new ArrayList();
      /* 
      Adds 'this' to the array storeList
      'this' being the object/instance itself
      We can do this because storeList accepts the data type 'Store' or the current class.
      */
      storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
      /* 
      itemList.size() returns the size of the array itemList
      If the array had 3 elements, its size would be 3.
      */
      int arraySize = itemList.size();
      // Check if the index parameter passed is less than the array size of itemList.
      if (index < arraySize) {
          // If it is, add itemCost to the earnings of the store and report through console.
          double itemCost = itemList.get(index).getCost();
          String itemName = itemList.get(index).getName();
          this.earnings += itemCost;
          System.out.printf("[%s] %s was sold for %s.%n", this.name,itemName, itemCost);
      } else {
          System.out.printf("[%s] There are %d item/s in the store. Index %d is not valid.%n",this.name, arraySize, index);
      }
  }
  public void sellItem(String name){
      for (Item item : itemList) {
          String itemName = item.getName();
          double itemCost = item.getCost();
          /* 
          Check if the current elements 'name' is equal to the argument passed.
          equalsIgnoreCase used to compare strings
          */    
          if (itemName.equalsIgnoreCase(name)) {
              this.earnings += itemCost;
              System.out.printf("[%s] %s was sold for %.2f.%n", this.name,itemName, itemCost);
              // Return statement to break out of the method early
              return;
          }
      }
      /* 
      If no match was found in the for loop, the return statement is not called and so
      this error message is printed out. */
      System.out.printf("[%s] %s is not an item in the store.%n", this.name,name);
  }
  public void sellItem(Item i){
      for (Item item : itemList) {
          if (item == i) {
              /* 
              Scans the array itemList and compares if the current element is the same object as
              the argument passed.
              
              If they match, get the data of the field 'name' from the current element and pass
              it as an argument to sellItem(String name)
              
              This is so code does not have to be reused.
              */
              String itemName = i.getName();
              sellItem(itemName);
              // Return statement is to break out of the for loop when a match is found.
              return;
          }
      }
      // If no match is found, the return statement will be skipped and will print out the error message.
      System.out.printf("[%s] %s is not an item in the store.%n", this.name, i.getName());
  }
  public void addItem(Item i){
      itemList.add(i);
  }
  public void filterType(String type){
    System.out.printf("[%s] Items with type '%s': %n", this.name,type);
    for (Item item : itemList) {
        String itemType = item.getType();
        String itemName = item.getName();
        double itemCost = item.getCost();
        /* Gets the data from field 'type' and compares it to the argument passed.
         equalsIgnoreCase is used to compare two strings.
        */
        if (itemType.equalsIgnoreCase(type)) {
            System.out.printf("%-11.30s - %.2f%n", itemName,itemCost);
        }
    }
    System.out.println();
  }
  public void filterCheap(double maxCost){
    System.out.printf("[%s] Items that cost less than %.2f: %n", this.name,maxCost);
    for (Item item : itemList) {
        String itemName = item.getName();
        double itemCost = item.getCost();
        /* 
        Scan each element and compare if the cost of the element is less than the maxCost.
        The cost of the scanned element is stored in itemCost.
        */
        if (itemCost < maxCost) {
            System.out.printf("%-11.30s - %.2f%n", itemName, itemCost);
        }
    }
    System.out.println();
  }
  public void filterExpensive(double minCost){
      System.out.printf("[%s] Items that cost more than %s: %n", this.name,minCost);
      for (Item item : itemList) {
          String itemName = item.getName();
          double itemCost = item.getCost();
          // Scan each element and compare if the cost of the element is more than minCost.
          if (itemCost > minCost) {
              System.out.printf("%-11.30s - %.2f%n",itemName,itemCost);
          }
      }
      System.out.println();
  }
  public static void printStats(){  
      System.out.println("\nStores in storeList and their earnings:");
      /* 
      Loop through each element in sotreList and print out the data in its fields.
      Prints out its 'name' and 'earnings' 
      */
      for (Store store : storeList) {
          String storeName = store.getName();
          double storeEarnings = store.getEarnings();
          System.out.printf("%-10.30s - %.2f%n",storeName,storeEarnings);
      }
  }
}

