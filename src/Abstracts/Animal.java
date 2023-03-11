package Abstracts;

public abstract class Animal {
    /*   Define  speak, eat methods carate 3 subclasses and override the speak eat methods*/

public  void speak(){
    System.out.println("Animals make noises");


}
public  void eat(){
   // System.out.println("eat pet foods");
}
}
class cat extends Animal{
    public void speak(){
        System.out.println("Meow meow");


    }
    public void eat(){
        System.out.println("eat pet foods");
}
class  dog   extends Animal{
    public void speak(){
        System.out.println("Dogs barks");


    }
    public  void eat(){
        System.out.println("eat pet foods");
    }
}
class hamster extends Animal{

    public void speak(){
        System.out.println("Animals make noises");


    }
    public void eat(){
        System.out.println("eat pet foods");}
}}