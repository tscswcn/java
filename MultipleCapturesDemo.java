package new1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MultipleCapturesDemo {
    public static void main(String[] args) {
        try {
            new FileInputStream("");
        } catch (FileNotFoundException e) {
            System.out.println("IO �쳣");
        } catch (Exception e) {
            System.out.println("�����쳣");
        }
    }
}