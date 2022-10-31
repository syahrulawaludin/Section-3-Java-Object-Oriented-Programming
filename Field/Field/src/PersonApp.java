public class PersonApp {
    public static void main(String[] args) {
        

        // Field

        // Fields/Properties/Attribut adalah data yaang  bisa kita sisipkan di dalam Object
        // Nmaun sebelum kita bisa memasukan data di field, kita  harus mendeklarasikan data  apa aja yangdimiliki objext tersebut di dalam deklarasi class-nya
        // Membuat field sama seperti membuat variable, namun ditempatkan di block class

        var person1 = new Person();
        person1.name = "Syahrul";
        person1.address = "Subang";
        // person1.country = "Amerika"; //Error

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

    }
    
}
