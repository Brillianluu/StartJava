public class VariablesTheme {
    public static void main(String[] args) {
        String osName = "Майкрософт Windows 11 Pro";
        String osVersion = "10.0.22631 Сборка 22631";
        String osManufacturer = "Microsoft Corporation";
        String manufacturer = "ASUSTeK COMPUTER INC.";
        String model = "ASUS TUF Gaming A17 FA707NU_FA707NU";
        String processorName = "AMD Ryzen 5 7535HS with Radeon Graphics";
        char baseType = 'x';
        short baseComputer = 64;
        long frequencyProcessor = 3301L;
        byte cores = 6;
        double smbiosVersion = 3.4f;
        float builtinControllerVersion = 3.09f;
        boolean secureBootStatus = false;
        int ram = 16;
        short swapFileSize = 1;
        boolean dmaCoreProtection = true;
        System.out.println("1.Переменные: примитивные типы данных:" + "\nИмя ОС: " + osName + 
                "\nВерсия: " + osVersion + "\nИзготовитель ОС: " + osManufacturer + 
                "\nИзготовитель: " + manufacturer + "\nМодель: " + model + "\nПроцессор: " + 
                processorName + "\nКомпьютер на базе: " + baseType + baseComputer + 
                "\nЧастота процессора: " + frequencyProcessor + " Мгц" + "\nЯдер: " + 
                cores + "\nВерсия SMBIOS: " + smbiosVersion + 
                "\nВерсия встроенного контроллера: " + builtinControllerVersion + 
                "\nСостояние безопасной загрузки: " + secureBootStatus + 
                "\nУстановленная оперативная память: " + ram + " ГБ" + 
                "\nРазмер файла подкачки: " + swapFileSize + " ГБ" + "\nЗащита DMA ядра: " + 
                dmaCoreProtection);
        double penPrice = 105.5;
        double bookPrice = 235.83;
        double costSum = penPrice + bookPrice;
        double discountSum = costSum * 11 / 100;
        double total = costSum - discountSum;
        String costTotal = String.format("%.3f", total);
        System.out.println("\n2.Расчет стоимости товара со скидкой:" + 
                "\nстоимость товаров без скидки = " + costSum + "\nсумма скидки = " + discountSum + 
                "\nстоимость товаров со скидкой = " + costTotal + " рублей");
        System.out.println("\n3.Вывод слова JAVA:");
        System.out.println("    J    a  v     v  a");
        System.out.println("    J   a a  v   v  a a");
        System.out.println(" J  J  aaaaa  V V  aaaaa");
        System.out.println("  JJ  a     a  V  a     a");
        int startI = 2147483647;
        System.out.println("\n4.Вывод min и max значений целых числовых типов: " +
                "\nпервоначальное значение int = " + startI);
        startI++;
        System.out.println("значение после инкремента на единицу = " + startI);
        int startIn = 2147483647;
        startIn--;
        System.out.println("значение после декремента на единицу = " + startIn);
        long startL = 9223372036854775807L;
        System.out.println("первоначальное значение long = " + startL);
        startL++;
        System.out.println("значение после инкремента на единицу = " + startL);
        long startLo = 9223372036854775807L;
        startLo--;
        System.out.println("значение после декремента на единицу = " + startLo);
        byte startB = 127;
        System.out.println("первоначальное значение byte = " + startB);
        startB++;
        System.out.println("значение после инкремента на единицу = " + startB);
        byte startBy = 127;
        startBy--;
        System.out.println("значение после декремента на единицу = " + startBy);
        short startS = 32767;
        System.out.println("первоначальное значение short = " + startS);
        startS++;
        System.out.println("значение после инкремента на единицу = " + startS);
        short startSh = 32767;
        startSh--;
        System.out.println("значение после декремента на единицу = " + startSh);
        int numberV = 2;
        int numberA = 5;
        System.out.println("\n5.Перестановка значений переменных:" + 
                "\nисходные значения переменных " + numberV + "," + numberA);
        int numberD = numberV;
        numberV = numberA;
        numberA = numberD;
        System.out.println("с помощью третьей переменной " + numberV + "," + numberA);
        numberV += numberA;
        numberA = numberV - numberA; 
        numberV = numberV - numberA;
        System.out.println("с помощью арифметических операций " + numberV + "," + numberA);
        numberV ^= numberA;
        numberA ^= numberV;
        numberV ^= numberA;
        System.out.println("с помощью побитовой операции ^ " + numberV + "," + numberA);
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char pipeline = '|';
        char tilde = '~';
        System.out.println("\n6.Вывод символов и их кодов:\n" + (int) dollar + "-" + dollar);
        System.out.println((int) asterisk + "-" + asterisk);
        System.out.println((int) atSign + "-" + atSign);
        System.out.println((int) pipeline + "-" + pipeline);
        System.out.println((int) tilde + "-" + tilde);
        char backSlash = '\\';
        char slash = '/';
        char leftPparenthesis = '(';
        char rightParenthesis = ')';
        char underscore = '_';
        System.out.println("\n7.Вывод в консоль ASCII-арт Дюка:\n    " + slash + backSlash);
        System.out.println("   " + slash + "  " + backSlash);
        System.out.println("  " + slash + underscore + leftPparenthesis + " " + rightParenthesis +
                backSlash);
        System.out.println(" " + slash + "      " + backSlash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + 
                slash + backSlash + underscore + underscore + backSlash);
        int oneTwoThree = 123;
        int hundreds = oneTwoThree / 100;
        int dozens = oneTwoThree / 10 % 10;
        int units = oneTwoThree % 10;
        int multiplication = hundreds * dozens * units;
        int addition = hundreds + dozens + units;
        System.out.println("\n8.Манипуляции с сотнями, десятками и единицами числа:\n" + 
                "Число " + oneTwoThree + " содержит:\n" + "  сотен - " + hundreds + 
                "\n  десятков - " + dozens + "\n  единиц - " + units + "\nСумма разрядов = " + 
                addition + "\nПроизведение разрядов = " + multiplication);
        int originalSeconds = 86399;
        int seconds = originalSeconds % 60;
        int hours = originalSeconds / 3600 % 60;
        int minutes = originalSeconds / 60 % 60;
        System.out.println("\n9.Перевод секунд в часы, минуты и секунды:\n" + 
                hours + ":" + minutes + ":" + seconds);
    }
}
