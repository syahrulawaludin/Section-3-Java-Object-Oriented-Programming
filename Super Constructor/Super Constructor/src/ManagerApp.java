import java.util.jar.Attributes.Name;

public class ManagerApp {

    public static void main(String[] args) {
        

    //  Inheritance
    /* Iheritance atau pewarisan adalah kemampuan untuk menurunkan sebuah class ke class lain
    dalam artian, kita bisa membuat class Parent dan class Child
     * Class child , hanya bisa punya satu class paent, namun satu class parent bisa punya banyak class child
     * Saat sebuah class diturunkan, maka semua field dan method yang ada di class Parent, secara otomatis akan dimiliki oleh class Child
     * Untuk melakukan pewarisan di class child kita harus mengggunakan kata kunci extends lalu diikuti dengan nama class parent nya.
     * 
     */
 


    //  Super Constructor
    /*
     * Tidak hanya untuk mengakses method atau field yang  ada di parent class, kata kuinci super juga bisa digunakan untuk mengakses constructor
     * Namun syaratnya untuk mengakses parent class constructor, kita harus mengaksesnya di dalam class child constructor
     * Jika sebuah parent tidak memiliki constructor yang tidak ada parameternya(tidak memiliki default constructor), maka class child wajib mengakses constructor class parent tersebut.
     */

     
        var Manager = new Manager("EKO", null);
        Manager.sayHelloo("Budi");
        

        var vp = new vicePresident();
        vp.sayHelloo("Budi");

    }
    
}
