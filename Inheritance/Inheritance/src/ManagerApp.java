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

     
        var Manager = new Manager();
        Manager.name = "Eko";
        Manager.sayHelloo("Budi");
        

        var vp = new vicePresident();
        vp.name = "Joko";
        vp.sayHelloo("Budi");

    }
    
}
