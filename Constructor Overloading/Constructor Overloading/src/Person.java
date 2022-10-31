public class Person {
    

    // Constructor overloading

    /**
     * sama seperti di method, di constructpr pun kkta bisa melakukan overloading
     * kita bisa membuat constructor lebih dari satu, dengan syarat tipe data parameter harus berbeda, atua jumlah parameter harus berbeda.
     * 
     */

    /*
     * Memanggil Constructor lain
     * 
     * 1. Constructor bisa memanggil constructor lain
     * 2. hal ini memudahkan saat kita butuh menginisialisasi data dengan berbagao kemungkinann
     * 3. cara untuk memanggil constructor lain, kita hanya perlu memanggil seperti memanggiil method, namun dengan kata kunci tis
     */

    String name;
    String address;
    final String  country = "Indonesia";


    // CONSTRUCTOR
    Person(String paramName, String paramAddress){
    name = paramName;
    address = paramAddress;

    }
    Person(String paramName){
        this(paramName, null);
    
        }
    
    Person(){
        this(null);

    }
    // Methos sayhello
    void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", My name is " + name);

    }

    // Method sayGoodBye 
    void sayGoodBye(String paramName){
        System.out.println("Hello " + paramName + ", See you " + name);

    }
}
