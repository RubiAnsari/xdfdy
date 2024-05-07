class Animal {
    public void displayInfo() {
        System.out.println("I am  an Animal");
        
    }
}
class Dog extends Animal{
    public void displayInfo() {
        super.dispalyInfo();
        System.out.println("I am a dog");
        
    }
}
class Main() {
    public  void (String[]args) {
        Dog d1=new Dog();
        d1.displayInfo();
    }
}