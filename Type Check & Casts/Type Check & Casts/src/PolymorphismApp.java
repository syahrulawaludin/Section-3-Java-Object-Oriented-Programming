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

      // Type check & Casts
      /*
       * Sebelumnya kita sudah tau cara melalukan konversi tipe dara (cats) di tipe data  primitif
       * Casts juga  bisa digunakan untuk tipe data  bukan primitif
       * Namun agar aman, sebelum melakukan casts, pastikan kita melakukan type check (pengecekan type data), dengan menggunakan kata kunci instanceof
       * Hasil operator instanceof adalah boolean, terus jika tipe data sesuai, false jika tidak sesuai
       */
      if(employee instanceof vicePresident){
         vicePresident vicePresident = (vicePresident) employee;
         System.out.println("Hello VP" + vicePresident.name);
      }else if (employee instanceof Manager){
         Manager manager = (Manager) employee;
         System.out.println("Hello Manager " + manager.name);
      }else {
         System.out.println("Hello " + employee.name);
      }


     } 

}
