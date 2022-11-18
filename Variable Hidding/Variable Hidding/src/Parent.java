class Parent {
  String name;
  void doit(){
    System.out.println("Do it in parent");
  }  
}

// Variable hiding

/*
 * Variable hiding merupakan masalah yang terjadi ketika kita membuat  nama field sama di class child dengan nama field di class parent
 * tidak ada yang  namanya field overriding, ketika kita buat ulangnama field di class class, itu berarti variable hiding
 * Untuk mengatasi variable hiding, caranya kita bisa menggunakan super keyword
 * Yang membedakan variavble hiding dan method overriding adalah ketika sebuah object  di casts
 * Saat object di casts, method akan tetap mengakses method overriding, namun variable akan mengakses variable yang ada di class nya.
 * 
 */

class Child extends Parent{
    String name;
    void doit(){
      System.out.println("Do it in Child");
      System.out.println("Parent name is " + super.name);
    }  
}