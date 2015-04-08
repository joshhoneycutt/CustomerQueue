/* 
* Date: 24 September 2013
* Programmer: Joshua Honeycutt
* Program: Write a Program That Creates A Queue and Uses The Customer Class
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueLine 
{
   public static void main(String[] args) 
   {
      Queue<Customer> line = new LinkedList<Customer>();
      Random rand = new Random();
      int customersFinished = 0;   // Keeps track of customers finished
      int QueueLength = 0;          // Keeps track of the max length of the queue
      Customer frontOfQueue = new Customer(); // Keeps track of the customer that's in the front of the queue
      System.out.println("Starting Hour of Work!");
      
      for (int i = 0; i <60; i++)  
      {
         if((rand.nextInt(4) + 1) == 1)//Check to see if a person should be added to queue
         {
            Customer newCustomer = new Customer(); // Creates the customer object, only used when it's a NEW customer
            line.add(newCustomer); // Adds the customer object to the line
            System.out.println("A new customer appears! Queue length is now "+line.size());
         }
         
         frontOfQueue = line.peek(); // Places the result of peek in frontOfQueue
         
         if (!line.isEmpty() && frontOfQueue.getServiceTime() == 0) //if true, the customer in the front of the queue gets remove.
         {  
            line.poll();
            customersFinished++;
            System.out.println("Customer has Finished! Queue length is now "+line.size());
         }
         
         if(!line.isEmpty()) // if the Queue isn't empty FrontOfQueue is subtracted by 1
         {
            frontOfQueue.decServiceTime();
         }
         
         System.out.println("------------------------------"); // to represent 1 run of the program
         
         if (line.size() > QueueLength)// Calculates the max length of the queue
         {
            QueueLength = line.size();
         }
      }
      System.out.println("Total # of Customers Served: "+customersFinished);
      System.out.println("Max Line Length: "+QueueLength);
    }
}
