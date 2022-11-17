public class Person {
    
    String name;
    String address;
    final String  country = "Indonesia";


    // This Keyword
    /*
     * Saat membuat kode di dalam block constructor atua methid di dalam class, kita bisa memnggunakan kata kunci this untuk mengakses object saat ini
     * Misal kadang kita butuh mengakses sebuah field yang  namanya sama dengan parameter method, hal ini tidak bisa dilakukan jika langsung  menyebut nama field, kita bisa mengakses nama field  tersebut dengan kata kunci this
     * This juga tidak hanya digunakan untuk mengakses field miliki object saat ini, namun juga bisa digunakan untuk mengakses method
     * This bisa digunakan  untuk mengatasi masalah variable shadowing
     */














   


    // CONSTRUCTOR
    Person(String name, String address){
    this.name = name;
    this.address = address;

    } 
    Person(String paramName){
        this(paramName, null);
    
        }
    
    Person(){
        this(null);

    }
    // Methos sayhello
    void sayHello(String name){
        System.out.println("Hello " + name + ", My name is " + this.name);

    }

    // Method sayGoodBye 
    void sayGoodBye(String name){
        System.out.println("Hello " + name + ", See you " + this.name);

    }

}
