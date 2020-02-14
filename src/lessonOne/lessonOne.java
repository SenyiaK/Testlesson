package lessonOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lessonOne {

    public static void main(String[] arg) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое число");
        String onenumber = reader.readLine();
        System.out.println("Введите второе число");
        String twonumber = reader.readLine();
        int Onumber = Integer.parseInt(onenumber);
        int Tnumber = Integer.parseInt(twonumber);
        if (Onumber>Tnumber)
            {
            System.out.println("Первое число больше второго");
            }
        else
         {
             System.out.println("Второе число больше первого");
         }
        }

    }

