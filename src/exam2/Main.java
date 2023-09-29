
package exam2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


  // Number 1
class Node {
    String name;
    Node next;

    public Node(String name) {
        this.name = name;
    }
}

class CircularLinkedList {
    Node head;

    public void insert(String name, int position) {
        Node newNode = new Node(name);
        
        if (head == null) {
            head = newNode;
            newNode.next = newNode;
            return;
        }

        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;

        if (current == head) {
            head = newNode;
        }
    }

    public void print() {
        if (head == null) {
            return;
        }

        Node current = head;
        do {
            System.out.print(current.name + " ");
            current = current.next;
        } while (current != head);

        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        Scanner scn = new Scanner(System.in);
       list.insert("Julius,", 0); 
        list.insert("Calyle,", 1);
        list.insert("Adam,", 2);
        list.insert("Kirk,", 3);
        list.insert("Alfred,", 4);
        list.insert("Vea,", 5);
        list.insert("Arnel,", 6);
        list.insert("Riza,", 7);
        list.insert("Jake,", 8);
        list.insert("Jeyk", 9);
        
        
       
       

        list.print();
        System.out.println("Enter a name to Add:");
        String nameToAdd = scn.nextLine();
        System.out.println("Enter where position to insert:");
        int position = scn.nextInt();
        list.insert(nameToAdd + ",", position);
        list.print();
    }
}




//Number 2
//public class Main {
//    private final String indayMapanira;
//    private final Map<String, Integer> products;
//
//    public Main(String ownerName) {
//        this.indayMapanira = ownerName;
//        this.products = new HashMap<>();
//        initializeProducts();
//    }
//
//    private void initializeProducts() {
//        products.put("Fita", 10);
//        products.put("Pride Power", 10);
//        products.put("Canola Oil", 10);
//        products.put("Nescafe Black Coffee", 10);
//        products.put("Ariel Powder", 10);
//        products.put("Rebisco", 10);
//        products.put("Steelwool", 10);
//        products.put("Head and Shoulders", 10);
//        products.put("Nova", 10);
//        products.put("Tanduay", 10);
//        products.put("Bearbrand", 10);
//        products.put("Nature Spring Mineral Water 400ml", 10);
//        products.put("Coke 1L", 10);
//        products.put("Sprite Kasalo", 10);
//        products.put("Royal 1L", 10);
//        products.put("Sugar", 10);
//    }
//
//    public boolean checkProduct(String productName) {
//        return products.containsKey(productName);
//    }
//
//    public void buyProduct(String productName) {
//        if (products.containsKey(productName)) {
//            int currentQuantity = products.get(productName);
//            if (currentQuantity > 0) {
//                products.put(productName, currentQuantity - 1);
//                System.out.println("Product " + productName + " bought successfully.");
//            } else {
//                System.out.println("Product " + productName + " wala nay nay stock bai.");
//            }
//        } else {
//            System.out.println("Product " + productName + "  not avaialble ug walay stock parehas ra.");
//        }
//    }
//}
//
