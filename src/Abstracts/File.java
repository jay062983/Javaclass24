package Abstracts;

public abstract class File {

   abstract void open();



    void Edit() {
        System.out.println("implemented");
    }

    void close() {
        System.out.println("Implemented");
    }

}
//abstract class JavaFile extends File {
  //  abstract void open();
   // {System.out.println("Need notepad++ or sublime text");}

  class JavaFile extends File {
     void open()
    {System.out.println("Need notepad++ or sublime text");}

    void close() {
        System.out.println("implemented");
    }

    void Edit() {
        System.out.println("implemented");
    }
}
class WordFile extends File{
    void open() {
        System.out.println("Microsoft word to be installed");
    }



    void close() {
        System.out.println("implemented");
    }

    void Edit() {
        System.out.println("implemented");
}}
class PdfFile extends File{
    void open() {
        System.out.println("Opening the file in adobe reader");
    }



    void close() {
        System.out.println("implemented");
    }

    void Edit() {
        System.out.println("implemented");
    }
}
