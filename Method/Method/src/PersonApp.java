public class PersonApp {

    // Method
    /**
     * Selain menambahkan field kita juga bisa menambahkan method ke object
     * Cara dengan mendeklarasikan method tersebut di dalam block class
     * Sama seperetei method biasanya, kkta juga bisa menambahlan return value, parameter dan  method overloading di nmodel yang ada di dalam block class
     * Untuk mengakses method tersebut kita bisa menggunakan tanda titik(.) dan diikuti dengan nama methodnya. Sama seperti mengakses field
     */

     public static void main(String[] args) {
        
        var person1 = new Person();
        person1.name = " Syahrul";
        person1.address = "Subang";
        // person1.country = "Amerika"; //Error

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello(" Budi");

        Person person2 = new Person();
        Person person3;
        person3 = new Person();
        // Karena tipe data obje kalo belum dideklarasikan akan bernilai null
        person3.name = "Joko";
        person3.sayHello(" Budi");

        Person person4 = new Person();
        person4.name = "Ridwan";
        person4.sayHello(" Romy");
       
     }
    
}
