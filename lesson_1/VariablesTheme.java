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
        byte q = a + 1;
        byte w = a - 1;
        short b = 32767;
        short e = b + 1;
        short r = b - 1;
        int c = 2 ^ 31 - 1;
        int t = c + 1;
        int y = c - 1;
        long d = 2 ^ 63 - 1;
        long u = d + 1;
        long i = d - 1;
        System.out.println(a, q, w);
    }
}