class personApp{

    public static void main(String[] args) {
        var person1 = new Person("Eko", "Subang");
        // person1.name = " Syahrul";
        // person1.address = "Subang";
        // person1.country = "Amerika"; //Error

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello(" Budi");

        Person person2 = new Person("Rizal");

        Person person3;
        person3 = new Person();
        person3.name =  "Amel";
        person3.sayHello(" Budi");
    
        // Karena tipe data obje kalo belum dideklarasikan akan bernilai null
    
       

        Person person4 = new Person("Umar", "jakarta");
       
        person4.sayHello(" Romy");



        // Method 2

        person1.sayGoodBye("Angga");
        person2.sayGoodBye("Rifqi");
        person3.sayGoodBye("Rigan");
        person4.sayGoodBye("Heiwa");

    }
    
}