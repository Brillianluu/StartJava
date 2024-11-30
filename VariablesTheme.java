public class VariablesTheme {
    public static void main(String[] args) {
        // цифра
        int digit = 5;
        System.out.println("Разные переменные\n1.1. Цифра = " + digit);
        // Сумма чисел
        int numbersSum = 5 + digit;
        System.out.println("1.2. Сумма чисел = " + numbersSum);
        // Произведение чисел
        int numbersMultiplication = digit * numbersSum;
        System.out.println("1.3. Произведение цифр = " + numbersMultiplication);
        // максимальное число
        int maxNumber = 1000000;
        System.out.println("1.4. Максимальное число = " + maxNumber);
        // количество десятков
        int tensCount = maxNumber / 10;
        System.out.println("1.5. Количество десятков = " + tensCount);
        // вес собаки
        double dogWeight = 12.5;
        System.out.println("1.6. Вес собаки = " + dogWeight + " киллограммов");
        // исходное число
        int originalNumber = 0;
        System.out.println("1.7. Исходное число = " + originalNumber);
        // процент по вкладу
        int depositPercent = 15;
        System.out.println("1.8. Процент по вкладу = " + depositPercent + " %");
        // переменная хранит символ &
        char symbolAndStorage = '&';
        System.out.println("1.9. Переменная хранит символ & = " + symbolAndStorage);
        // код ошибки
        String errorCode = "0x8007025d";
        System.out.println("1.10. Код ошибки = " + errorCode);
        // тип сообщения
        String massageType = "INFO";
        System.out.println("1.11. Тип сообщения = " + massageType);
        // число нулей
        String str = "10000";
        int zerosCount = str.length() - str.replaceAll("0", "").length();
        System.out.println("1.12. Число нулей = " + zerosCount);
        // уникальное число
        int uniqueNumber = 55;
        System.out.println("1.13. Уникальное число = " + uniqueNumber);
        // случайное число
        int randNumber = (int) (Math. random() * 100);
        System.out.println("1.14. Случайное число = " + randNumber);
        // математическое выражение
        String mathOperation = "2+2=5";
        System.out.println("1.15. Математическое выражение = " + mathOperation);
        // счет в игре
        int gameScore = 5;
        System.out.println("1.16. Счет в игре = " + gameScore);
        // максимальная длина
        int maxLenght = 300;
        System.out.println("1.17. Максимальная длина = " + maxLenght + " метров");
        // пункт меню
        String menuItem = "Картошка фри";
        System.out.println("1.18. Пункт меню = " + menuItem);
        // стоимость кофе
        int coffeePrice = 3;
        System.out.println("1.19. Стоимость кофе = " + coffeePrice + " $");
        // дата начала
        String startDate = "13.11.2024";
        System.out.println("1.20. Дата начала = " + startDate);
        // окончание диапазона
        int rangeEnd = Math.max(Math.max(2, 1), 3);;
        System.out.println("1.21. Окончание диапазона = " + rangeEnd);
        // полное имя работника месяца
        String employeeMonthFullName = "Максим";
        System.out.println("1.22. Полное имя работника месяца = " + employeeMonthFullName);
        // заголовок электронной книги
        String electronicBookTitle = "Clean Code";
        System.out.println("1.23. Заголовок электронной книги = " + electronicBookTitle);
        // размер
        int size = 60;
        System.out.println("1.24. Размер = " + size + " сантиметров");
        // вместимость
        int capacity = 70;
        System.out.println("1.25. Вместимость = " + capacity + " литров");
        // счетчик
        int counter = 70;
        System.out.println("1.26. Счетчик = " + counter);
        // путь до файла
        String filePath = "C\\Java\\VariablesTheme.java";
        System.out.println("1.27. Путь до файла = " + filePath);
        // количество чисел в каждой строке
        int numbersEachRowCount = 100;
        System.out.println("1.28. Количество чисел в каждой строке = " + numbersEachRowCount);
        // Boolean-переменные
        // сотни равны?
        boolean isEqualHundreds = 100 == 100;
        System.out.println("\nBoolean-переменные" + "\n2.1. сотни равны? = " + isEqualHundreds);
        // компьютер включен?
        boolean isIncludedComputer = true;
        System.out.println("2.2. компьютер включен? = " + isIncludedComputer);
        // есть равные цифры?
        boolean hasEqualDigits = false;
        System.out.println("2.3. есть равные цифры? = " + hasEqualDigits);
        // создано?
        boolean isCreated = true;
        System.out.println("2.4. создано? = " + isCreated);
        // пустое?
        boolean isEmpty = false;
        System.out.println("2.5. пустое? = " + isEmpty);
        // активное?
        boolean isActive = true;
        System.out.println("2.6. активное? = " + isActive);
        // новое?
        boolean isNew = false;
        System.out.println("2.7. новое? = " + isNew);
        // электронная почта действительная?
        boolean isValidEmail = true;
        System.out.println("2.8. электронная почта действительная? = " + isValidEmail);
        // имеются уникальные строки?
        boolean hasUniqueStrings = false;
        System.out.println("2.9. имеются уникальные строки? = " + hasUniqueStrings);
        // Аббревиатуры 
        // старый universally unique identifier
        String oldUuId = "3422b448-2460-4fd2-9183-8000de6f8343";
        System.out.println("\nАббревиатуры \n3.1. старый universally unique identifier = " + 
                oldUuId);
        // производитель оперативной памяти
        String ramManufacturer = "Kingston";
        System.out.println("3.2. производитель оперативной памяти = " + ramManufacturer);
        // емкость жесткого диска
        int hddCapacity = 32;
        System.out.println("3.3. емкость жесткого диска = " + hddCapacity + " TB");
        // протокол передачи гипертекста
        String http = "HTTP";
        System.out.println("3.4. протокол передачи гипертекста = " + http);
        // сокращенный uniform resource locator
        String shortUrl = "https://shorturl.at/e3DxH";
        System.out.println("3.5. сокращенный uniform resource locator = " + shortUrl);
        // новый идентификатор клиента
        int newClientId = 4556;
        System.out.println("3.6. новый идентификатор клиента = " + newClientId);
        // american standard code for information interchange
        String ascii = "ASCII (American Standard Code for Information Interchange)";
        System.out.println("3.7. american standard code for information interchange= " + ascii);
    }
}
