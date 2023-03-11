package Abstracts;

public class PhoneTester {

    public static void main(String[] args) {
        Phone []phones={new Iphone(),new Samsung() };
        for(Phone ph:phones){
            ph.displayPictures();
            ph.unlockPhone();
            ph.SendText();
        }
    }
}
