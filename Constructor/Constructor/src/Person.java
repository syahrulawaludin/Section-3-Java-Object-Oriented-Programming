public class Person {
    
       // Constructor
    // Saat kita membuat object, amak kita seperti meanggil sebuah method karena kita menggunakan kurung()
    // Di dalam java kita bisa membuat contsructor, constructor adalah method yang  kana dipanggil saat  pertama kali object  dibuat.
    // Mirip seperti di method, kita bisa memberi parameter pada constutor
    // Nama constructor harus sama dengan nama class dan tidak membutuhkan kata kunci void atau return value
    

    // Constructor adalah method yang  pertama kali dipanggil saat object dibuat
    String name;
    String address;
    final String  country = "Indonesia";


    // CONSTRUCTOR
    Person(String paramName, String paramAddress){
    name = paramName;
    address = paramAddress;

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
