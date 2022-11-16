public class PolymorphismApp {
    // Polymorphism

    /*
     * Polymorphism berasal dari bahasa Yunani yang berarti banyak bentuk 
     * Dalam OOP, Polymorphism adalah kemampuan sebuah object berubah bentuk menjadi bentuk lain
     * Polymorphism erat hubungannya dengan Inheritance
     * Polymorphism bisa kita set didalam parameter yang ada di dalam metod
     */

     public static void main(String[] args) {
        
         Employee employee = new Employee("Eko");
         employee.sayHelloo("Budi");


         employee = new Manager("Syahrul");
         employee.sayHelloo("Dadang");

         employee = new vicePresident();
         employee.sayHelloo("Andi");

        sayHelloo(new Employee("Rehan"));
        sayHelloo(new Manager("Satrio"));
        sayHelloo(new Employee("Rawr"));
     }


     static void sayHelloo(Employee employee){
        System.out.println("Hello " + employee.name);

     } 

}
