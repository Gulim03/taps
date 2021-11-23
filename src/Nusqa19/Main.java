//Создать объект класса Фотоальбом, используя классы Фотография,
//Страница. Методы: задать название фотографии, дополнить фотоальбом
//фотографией, вывести на консоль количество фотографий.
package Nusqa19;

import java.util.ArrayList;
import java.util.Scanner;
import Nusqa19.Name;

public class Main {
    public static void main(String[] args) {
        Name i = new Name();
        Photo[] p = new Photo[5];
        i.createArray(p);
        i.print(p);
    }

}