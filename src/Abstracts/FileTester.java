package Abstracts;

public class FileTester {
    public static void main(String[] args) {
        File[]files={new JavaFile(),new PdfFile(),new WordFile()};
        for (File f : files) {
            f.Edit();
            f.open();
            f.close();
        }
    }
}
