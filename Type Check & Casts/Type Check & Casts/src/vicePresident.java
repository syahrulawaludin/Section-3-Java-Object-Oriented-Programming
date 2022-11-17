
// Class child dari class parent Manager
class vicePresident extends Manager{
    vicePresident(){
      super("rehan", "Google");  
    }
    void sayHelloo(String name){
        System.out.println("Hi " + name + ", My Name Is VP " + this.name);
    }
}
