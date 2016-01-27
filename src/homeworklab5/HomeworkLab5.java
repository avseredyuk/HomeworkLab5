/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworklab5;

import java.lang.reflect.Method;

/**
 *
 * @author lenfer
 */
public class HomeworkLab5 {

    public static void printPackageName(Class cl) {
        System.out.println("Package name:");
        System.out.println("  - " + cl.getPackage().getName());
    }

    public static void printSimpleClassName(Class cl) {
        System.out.println("Simple class name:");
        System.out.println("  - " + cl.getSimpleName());
    }

    public static void printMethods(Class cl) {
        System.out.println("Methods: ");
        for (Method method : cl.getDeclaredMethods()) {
            System.out.println("  - " + method.toString());
        }
    }

    public static void main(String[] args) {
        PC pc = new PC("Pentium", 2.4, 4, 4096, 128);
        Notebook nb = new Notebook(21, 2000, 4000, "Acer X100500", 3.0, 8, 8192, 256);
        System.out.println(pc.toString());
        System.out.println(nb.toString());
        printPackageName(nb.getClass());
        printSimpleClassName(nb.getClass());
        printMethods(nb.getClass());
    }

}
