package Abstracts;

public  abstract class Phone {
    /* 1)create a phone class lets create abstract methods like displayPictures
     unlockPhone, SendText.
    2 child classes Iphone Samsung Google and provide specific implementation
    lets write code to achieve runtime polymorphism */

abstract void displayPictures();



abstract void unlockPhone();


abstract void SendText();



}

class  Iphone extends Phone {

    void displayPictures() {
        System.out.println("display pictures");
    }

    void unlockPhone() {
        System.out.println("Unlock the phone");
    }

    void SendText() {
        System.out.println(" texting");
    }
}
class Samsung extends Phone {
    void displayPictures() {
        System.out.println("display all pictures");
    }

    void unlockPhone() {
        System.out.println(" unlock the phone");
    }

    void SendText() {
        System.out.println(" Send unlimited text");
    }
}