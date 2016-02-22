/*
 * Эта прога сравнивает 4 числа сравнениями по 2 и возвращает минимум
 */
package лаб.работа.pkg2.pkg6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ЛабРабота26 {

    public static int min(int a, int b) {
        if (a>b) return b;
        else return a;
    }
    
    public static int minn(int a, int b, int c, int d) {
        int k=min(a,b);
        k=min(k,c);
        k=min(k,d);
        return k;
    }
    
    public static void main(String[] args) {
        
        String abcd="qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNMйцукенгшщзхъфывапролджэячсмитьбюЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЧСМИТЬБЮ";
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        
        String s1 = null;
        
        System.out.println("\nВведи 1-е число: ");
        
        try {
            s1 = bufferedReader.readLine(); //читаем строку с клавиатуры
        } catch (IOException ex) {
            System.out.println("\nОшибка ввода");
        }
        
        String s2 = null;
        
        System.out.println("\nВведи 2-е число ");
        
        try {
            s2 = bufferedReader.readLine(); //читаем строку с клавиатуры
        } catch (IOException ex) {
            System.out.println("\nОшибка ввода");
        }
        
        String s3 = null;
        
        System.out.println("\nВведи 3-е число ");
        
        try {
            s3 = bufferedReader.readLine(); //читаем строку с клавиатуры
        } catch (IOException ex) {
            System.out.println("\nОшибка ввода");
        }
        
        String s4 = null;
        
        System.out.println("\nВведи 4-е: ");
        
        try {
            s4 = bufferedReader.readLine(); //читаем строку с клавиатуры
        } catch (IOException ex) {
            System.out.println("\nОшибка ввода");
        }
        
        for (int i=0; i<abcd.length(); i++) {
                if ((s1.contains(""+abcd.charAt(i))) || (s2.contains(""+abcd.charAt(i))) || (s3.contains(""+abcd.charAt(i))) || (s4.contains(""+abcd.charAt(i)))) {
                System.out.print("Неправильные числа");
                return;
            }
        }
        
        int a=Integer.parseInt(s1);
        int b=Integer.parseInt(s2);
        int c=Integer.parseInt(s3);
        int d=Integer.parseInt(s4);
        
        
        System.out.println("\nМинимум: "+minn(a,b,c,d));
    }
    
}
