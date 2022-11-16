class Manager {
    String name;
    String company;

    Manager(String  name, String company){
        this.name = name;
        this.company = company;

    }

    void sayHelloo(String name){
        System.out.println("Hi " + name + ", My Name Is Manager " + this.name);
    }
    
}

