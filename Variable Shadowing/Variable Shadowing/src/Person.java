public class Person {
    
    // Variable Shadowing

    /*
     * Variable shadowing  adalah kejadian ketika kita membuat nama variable dengan nama yang sma di scope yang menutupi variable dengan nama yang sama di scope diatasnya.
     * ini bisa terjadi seperti kita membuat nama parameter di method sama dnegan nama field di class
     * Saat terjadi seperti shadowing ,maka secara otomatis variable di scope diatasnya tidak bisa diakses.
     */

    String name;
    String address;
    final String  country = "Indonesia";


    // CONSTRUCTOR
    Person(String name, String address){
    name = name;
    address = address;

    }
    Person(String paramName){
        this(paramName, null);
    
        }
    
    Person(){
        this(null);

    }
    // Methos sayhello
    void sayHello(String paramName){
        System.out.println("Hello " + name + ", My name is " + name);

    }

    // Method sayGoodBye 
    void sayGoodBye(String paramName){
        System.out.println("Hello " + name + ", See you " + name);

    }
}
