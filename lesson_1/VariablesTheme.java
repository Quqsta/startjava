import java.math.BigDecimal;
import java.math.RoundingMode;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1.Вывод характеристик компьютера" + "\n");
        
        byte coresQuantity = 4;
        System.out.println(coresQuantity + " - Количество ядер компьютера");
        short mouseCost = 2500;
        System.out.println(mouseCost + " - Стоимость мышки в рублях (целых)");
        int monitorsQuantity = 1;
        System.out.println(monitorsQuantity + " - Количество мониторов у компьютера");
        long filesOnDiskE = 5352353;
        System.out.println(filesOnDiskE + " - Количество файлов на диске Е");
        float keyboardWeight = 1.8f;
        System.out.println(keyboardWeight + " - Вес клавиатуры в килограммах");
        double paintOnKeyWeight = 0.849593043;
        System.out.println(paintOnKeyWeight + " - Вес краски на одной клавише в граммах");
        boolean isMyComputer = true;
        System.out.println(isMyComputer + " - это мой компьютер");
        char textOnKeyB = 'B';
        System.out.println(textOnKeyB + " - Текст на клавише B" + "\n");

        System.out.println("2.Расчет стоимости товара со скидкой" + "\n");
        var penCosts = new BigDecimal(105.5);
        var bookCosts = new BigDecimal(238.83);
        var goodsCostWithoutDiscount = penCosts.add(bookCosts).setScale(2, RoundingMode.HALF_UP);
        var discountValue = new BigDecimal(0.11);
        var discount = goodsCostWithoutDiscount.multiply(discountValue).setScale(2, RoundingMode.HALF_UP);
        var goodsCostWithDiscount = goodsCostWithoutDiscount.subtract(discount)
                .setScale(2, RoundingMode.HALF_UP);
        System.out.println("Общая стоимость товаров без скидки = " + goodsCostWithoutDiscount + " руб.");
        System.out.println("Сумма скидки = " + discount + " руб.");
        System.out.println("Общая стоимость товаров со скидкой = " + goodsCostWithDiscount + " руб." + "\n");

        System.out.println("3.Вывод слова JAVA" + "\n" +
                 "   J    a  v     v  a   " + "\n" +
                 "   J   a a  v   v  a a  " + "J  J  aaaaa  V V  aaaaa  " + "\n" +
                 " JJ  a     a  V  a     a" + "\n");

        System.out.println("4.Вывод min и max значений целых числовых типов" + "\n");
        byte byteVariable = 127;
        byteVariable = ++byteVariable;
        System.out.println(byteVariable);
        byteVariable = --byteVariable;
        System.out.println(byteVariable);
        short shortVariable = 32767;
        shortVariable = ++shortVariable;
        System.out.println(shortVariable);
        shortVariable = --shortVariable;
        System.out.println(shortVariable);
        int intVariable = 2147483647;
        intVariable = ++intVariable;
        System.out.println(intVariable);
        intVariable = --intVariable;
        System.out.println(intVariable);
        long longVariable = 9223372036854775807L;
        longVariable = ++longVariable;
        System.out.println(longVariable);
        longVariable = --longVariable;
        System.out.println(longVariable + "\n");

        System.out.println("5.Перестановка значений переменных" + "\n");
        int firstVariable = 2;
        int secondVariable = 5;
        System.out.println("Перестановка значений с помощью третьей переменной");
        System.out.println("Исходные значения переменных:" + 
                "\na - " + firstVariable + "\nb - " + secondVariable);
        int thirdVariable = 3;
        firstVariable = firstVariable + thirdVariable;
        secondVariable = secondVariable - thirdVariable;
        System.out.println("Новые значения переменных:" + "\na - " + firstVariable + "\nb - " +
                  secondVariable);
        System.out.println("Перестановка значений с помощью арифметических операций");
        firstVariable = firstVariable + secondVariable - firstVariable;
        secondVariable = firstVariable + secondVariable + firstVariable / firstVariable;
        System.out.println("Новые значения переменных:" + "\na - " + firstVariable + "\nb - " +
                   secondVariable);
        System.out.println("Перестановка значений с помощью побитовой операции");
        System.out.println("Новое значение первой переменной в двоичной системе исчисления: " +
                   Integer.toBinaryString(secondVariable));
        System.out.println("Новое значение второй переменной в двоичной системе исчисления: " +
                   Integer.toBinaryString(firstVariable) + "\n");

        System.out.println("6.Вывод символов и их кодов" + "\n");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '`';
        System.out.println((int) dollar + " " + dollar);
        System.out.println((int) asterisk + " " + asterisk);
        System.out.println((int) atSign + " " + atSign);
        System.out.println((int) verticalBar + " " + verticalBar);
        System.out.println((int) tilde + " " + tilde + "\n");

        System.out.println("7.Вывод в консоль ASCII-арт Дюка" + "\n");
        char slash = '/';
        String backSlash = "\\";
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        char underscore = '_';
        System.out.println("     " + slash + backSlash + "     ");
        System.out.println("    " + slash + "  " + backSlash + "    ");
        System.out.println("   " + slash + underscore + leftParenthesis + " " + rightParenthesis + backSlash +
                 "    ");
        System.out.println("  " + slash + "      " + backSlash + "   ");
        System.out.println(" " + slash + underscore + underscore + underscore + underscore + slash +
                 backSlash + underscore + underscore + backSlash + "  \n");

        System.out.println("8.Вывод количества сотен, десятков и единиц числа" + "\n");
        int startNumber = 123;
        int numberOfHundreds = startNumber / 100;
        int numberOfTens = startNumber / 10;
        int numberOfUnits = startNumber / 1;
        int sumOfDigits = numberOfHundreds + numberOfTens + numberOfUnits;
        int compositionOfDigits = numberOfHundreds * numberOfTens * numberOfUnits;
        System.out.println("Число " + startNumber + " содержит :");
        System.out.println(" " + "сотен " + numberOfHundreds);
        System.out.println(" " + "десятков " + numberOfTens);
        System.out.println(" " + "единиц " + numberOfUnits);
        System.out.println("Сумма его цифр = " + sumOfDigits);
        System.out.println("Произведение = " + compositionOfDigits + "\n");

        System.out.println("9.Вывод времени" + "\n");
        int seconds = 86399;
        int numberOfHours = seconds / 3600;
        int numberOfMinutes = (seconds % 3600) / 60;
        int numberOfSeconds = (seconds % 3600) % 60;
        System.out.println(numberOfHours + ":" + numberOfMinutes + ":" + numberOfSeconds);
    }
}