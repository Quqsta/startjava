public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1.Вывод характеристик компьютера" + "\n");
        
        byte numberOfCores = 4;
        System.out.println(numberOfCores + "\nКоличество ядер компьютера");
        short mouseCost = 2500;
        System.out.println(mouseCost + "\nСтоимость мышки в рублях (целых)");
        int numberOfMonitors = 1;
        System.out.println(numberOfMonitors + "\nКоличество мониторов у компьютера");
        long numberOfFilesOnDiskE = 5352353;
        System.out.println(numberOfFilesOnDiskE + "\nКоличество файлов на диске Е");
        float keyboardWeight = 1.8f;
        System.out.println(keyboardWeight + "\nВес клавиатуры в килограммах");
        double paintOnKeyWeight = 0.849593043;
        System.out.println(paintOnKeyWeight + "\nВес краски на одной клавише в граммах");
        char textOnKeyB = 'B';
        System.out.println(textOnKeyB + "\nТекст на клавише B" + "\n");

        System.out.println("2.Расчет стоимости товара со скидкой" + "\n");
        int costOfPen = 100;
        int costOfBook = 200;
        float goodsCostWithoutDiscount = costOfPen + costOfBook;
        float discount = goodsCostWithoutDiscount / 100 * 11;
        float goodsCostWithDiscount = goodsCostWithoutDiscount - discount;
        System.out.println("Общая стоимость товаров без скидки = " + goodsCostWithoutDiscount + " руб.");
        System.out.println("Сумма скидки = " + discount + " руб.");
        System.out.println("Общая стоимость товаров со скидкой = " + goodsCostWithDiscount + " руб." + "\n");

        System.out.println("3.Вывод слова JAVA" + "\n");
        System.out.println("   J    a  v     v  a   " + "\n   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa  " + "\n JJ  a     a  V  a     a" + "\n");

        System.out.println("4.Вывод min и max значений целых числовых типов" + "\n");
        byte a = 127;
        int q = a + 1;
        int w = a - 1;
        short b = 32767;
        int e = b + 1;
        int r = b - 1;
        int c = 2147483647;
        int t = c + 1;
        int y = c - 1;
        long d = 9223372036854775807l;
        long u = d + 1;
        long i = d - 1;
        System.out.println(a + " " + q + " " + w);
        System.out.println(b + " " + e + " " + r);
        System.out.println(c + " " + t + " " + y);
        System.out.println(d + " " + u + " " + i + "\n");

        System.out.println("5.Перестановка значений переменных" + "\n");
        int firstVariable = 2;
        int secondVariable = 5;
        System.out.println("Перестановка значений с помощью третьей переменной");
        System.out.println("Исходные значения переменных:" + "\na - " + firstVariable + "\nb - " + secondVariable);
        int thirdVariable = 3;
        firstVariable = firstVariable + thirdVariable;
        secondVariable = secondVariable - thirdVariable;
        System.out.println("Новые значения переменных:" + "\na - " + firstVariable + "\nb - " + secondVariable);
        System.out.println("Перестановка значений с помощью арифметических операций");
        firstVariable = firstVariable + secondVariable - firstVariable;
        secondVariable = firstVariable + secondVariable + firstVariable / firstVariable;
        System.out.println("Новые значения переменных:" + "\na - " + firstVariable + "\nb - " + secondVariable);
        System.out.println("Перестановка значений с помощью побитовой операции");
        System.out.println("Новое значение первой переменной в двоичной системе исчисления: " + Integer.toBinaryString(secondVariable));
        System.out.println("Новое значение второй переменной в двоичной системе исчисления: " + Integer.toBinaryString(firstVariable) + "\n");

        System.out.println("6.Вывод символов и их кодов" + "\n");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '`';
        System.out.println((int)dollar + " " + dollar);
        System.out.println((int)asterisk + " " + asterisk);
        System.out.println((int)atSign + " " + atSign);
        System.out.println((int)verticalBar + " " + verticalBar);
        System.out.println((int)tilde + " " + tilde + "\n");

        System.out.println("7.Вывод в консоль ASCII-арт Дюка" + "\n");
        char slash = '/';
        String backSlash = "\\";
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        char underscore = '_';
        System.out.println("     " + slash + backSlash + "     ");
        System.out.println("    " + slash + "  " + backSlash + "    ");
        System.out.println("   " + slash + underscore + leftParenthesis + " " + rightParenthesis + backSlash + "    ");
        System.out.println("  " + slash + "      "+ backSlash + "   ");
        System.out.println(" " + slash + underscore + underscore + underscore + underscore + slash + backSlash + underscore + underscore +backSlash + "  \n");

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