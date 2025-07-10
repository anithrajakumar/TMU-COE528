package lab3;

/**
 *
 * @Anith Rajakumar
 */
import java.util.ArrayList;
public class QueueOfDistinctStrings {
// Overview: QueueOfDistinctStrings are mutable, bounded
// collection of distinct strings that operate in
// FIFO (First-In-First-Out) order.
//
// The abstraction function is:
// a) Write the abstraction function here
// AF(c): A sequence of (a1, a2, ... an) where
// - a1 represents the front of the queue (first to get dequeued)
// - an represnets the end of the queue (last to get dequenced)
// - c.items[i] where i spans from 0 to the size of the arraylist, where each items 
//   represents a string that are order the way they were enqueued in
// 
    
// The rep invariant is:
// b) Write the rep invariant here
// RI(C): false if:
// - c[i] is null (empty list)
// - c[i] == c[j] where i and j are random integers from 0 to the length of the array
// - c[i] is not a string
// Otherwise this should return true
//
//
//the rep
    private ArrayList<String> items;
    // constructor
    public QueueOfDistinctStrings () {
        // EFFECTS: Creates a new QueueOfDistinctStrings object
        items = new ArrayList<String>();
    }
    // MODIFIES: this
    // EFFECTS: Appends the element at the end of the queue
    // if the element is not in the queue, otherwise
    // does nothing.
    public void enqueue(String element) throws Exception {
        if(element == null) throw new Exception();
        if(false == items.contains(element))
        items.add(element);
    }
    public String dequeue() throws Exception {
        // MODIFIES: this
        // EFFECTS: Removes an element from the front of the queue
        if (items.size() == 0) throw new Exception();
        return items.remove(0);
    }
    public boolean repOK() {
        // EFFECTS: Returns true if the rep invariant holds for this
        // object; otherwise returns false
        // c) Write the code for the repOK() here
        Boolean holds = true;
        
        if(items.isEmpty()){
            holds = false;
        }
        
        // Running through the array of strings
        for(int i = 0; i < items.size(); i++){
            // Running through the arrray to be able to compare each element
            for(int j = 0; j < items.size(); j++){
                //finding two elements equal to one another or
                //findning if any element is not a string or
                //finding if the list is null
                if(items.get(i).equals(items.get(j)) && j != i){
                    holds = false;
                }
                if(!(items.get(i) instanceof String)){
                    holds = false;
                }
            }
            
        }
        return holds; 
    }
    public String toString() {
        // EFFECTS: Returns a string that contains the strings in the
        // queue, the front element and the end element.
        // Implements the abstraction function.
        // d) Write the code for the toString() here
        String s = "";
        
        s += "Front element: " + items.get(0) + " \n";
        s += "End element: " + items.get(items.size()-1) + " \n";
        s += "Queue: ";
                
        for(int i = 0; i < items.size(); i++){
            s += items.get(i) + ", "; 
        }
        
        return s;
    }
    
    public static void main(String[] args){
        QueueOfDistinctStrings queue = new QueueOfDistinctStrings();
        
        System.out.println("Result of repOk function: " + queue.repOK());
        System.out.println();
        
        try{
            queue.enqueue("ab");
            queue.enqueue("cd");
            queue.enqueue("ef");
            queue.enqueue("gh");
            queue.enqueue("ij");
        }catch (Exception e){
            System.out.println("Invalid string");
        }
        
        System.out.println("Result of repOk function: " + queue.repOK());
        System.out.println(queue);
        System.out.println();
        
        try{ 
            queue.dequeue();
        }catch (Exception e){
            System.out.println("Queue is empty");
        }
        
        System.out.println("Result of repOk function: " + queue.repOK());
        System.out.println(queue);
    }
}
