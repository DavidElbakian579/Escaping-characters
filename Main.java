/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasyntaxpro10l3;

/**
 *
 * @author David-pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 1
        Экранирование символов
        Выведи на экран следующий текст в две строки:
        It's a Windows path: "C:\Program Files\Java\jdk-13.0.0\bin"
        It's a Java string: \"C:\\Program Files\\Java\\jdk-13.0.0\\bin\"

        Подсказка:
        \” – экранирование двойной кавычки;
        \\ – экранирование обратной косой черты (\).
        */
        
        System.out.println("It's a Windows path: \"C:\\Program Files\\Java\\jdk-13.0.0\\bin\"");
        System.out.println("It's a Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk-13.0.0\\\\bin\\\"");
        
        /* 2
        Кодировка Unicode
        В публичный статический метод init(char[]) передается массив символов размером 9, который нужно заполнить следующими символами:
        0 - '\u00A9'
        1 - '\u004A'
        2 - '\u0061'
        3 - '\u0076'
        4 - '\u0061'
        5 - '\u0052'
        6 - '\u0075'
        7 - '\u0073'
        8 - '\u0068'        
        */
        
        char[] symbols = new char[9];
        init(symbols);
        System.out.println(new String(symbols));
        
        /* 3 class Solution3
        Поздравление!!!
        Проинициализируй статические переменные следующими значениями:

        partyFace — "\uD83E\uDD73"
        balloon — "\uD83C\uDF88"
        gift — "\uD83C\uDF81"
        partyPopper — "\uD83C\uDF89"
        cake — "\uD83C\uDF82"        
        */
        Solution3.printCongratulation();
    }
    
    public static void init(char[] symbols) {
        symbols [0] = '\u00A9';
        symbols [1] = '\u004A';
        symbols [2] = '\u0061';
        symbols [3] = '\u0076';
        symbols [4] = '\u0061';
        symbols [5] = '\u0052';
        symbols [6] = '\u0075';
        symbols [7] = '\u0073';
        symbols [8] = '\u0068';
    }
    
}
