public class VariablesTheme {
    public static void main(String[] args) {
        // цифра
        int digit = 5;
        System.out.println("1.1. Цифра = " + digit);
        // Сумма чисел
        int digitA = 5;;
        int sumDigits = digitA + digit;
        System.out.println("1.2. Сумма чисел = " + sumDigits);
        // Произведение чисел
        int multiplicationDigits = digitA * digit;
        System.out.println("1.3. Произведение цифр = " + multiplicationDigits);
        // максимальное число
        int maxDigit = 1000000;
        System.out.println("1.4. Максимальное число = " + maxDigit);
        //количество десятков
        int totalTen = maxDigit / 10;
        System.out.println("1.5. Количество десятков = " + totalTen);
        //вес собаки
        double weightDog = 12.5;
        System.out.println("1.6. Вес собаки = " + weightDog + " киллограммов");
        //исходное число
        int startDigit = 0;
        System.out.println("1.7. Исходное число = " + startDigit);
        //процент по вкладу
        int interestDeposit = 15;
        System.out.println("1.8. Процент по вкладу = " + interestDeposit + " %");
        //переменная хранит символ &
        char symbol = '&';
        System.out.println("1.9. Переменная хранит символ & = " + symbol);
        //код ошибки
        String error = "0x8007025d";
        System.out.println("1.10. Код ошибки = " + error);
        //тип сообщения
        String massage = "INFO";
        System.out.println("1.11. Тип сообщения = " + massage);
        //число нулей
        String str = "10000";
        int zeros = str.length() - str.replaceAll("0", "").length();
        System.out.println("1.12. Число нулей = " + zeros);
        //уникальное число
        int uniqueDigit = 55;
        System.out.println("1.13. Уникальное число = " + uniqueDigit);
        //случайное число
        int randDigit = (int)(Math.random()*100);
        System.out.println("1.14. Случайное число = " + randDigit);
        //математическое выражение
        String mathOperation = "2+2=5";
        System.out.println("1.15. Математическое выражение = " + mathOperation);
        //счет в игре
        int scoreGame = 5;
        System.out.println("1.16. Счет в игре = " + scoreGame);
        //максимальная длина
        int maxLenght = 300;
        System.out.println("1.17. Максимальная длина = " + maxLenght + " метров");
        //пункт меню
        String menuItem = "Картошка фри";
        System.out.println("1.18. Пункт меню = " + menuItem);
        //стоимость кофе
        int priceCoffee = 3;
        System.out.println("1.19. Стоимость кофе = " + priceCoffee + " $");
        //дата начала
        String startDate = "13.11.2024";
        System.out.println("1.20. Дата начала = " + startDate);
        //окончание диапазона
        int rangeEnd = Math.max(Math.max(2, 1),3);;
        System.out.println("1.21. Окончание диапазона = " + rangeEnd);
        //полное имя работника месяца
        String fullNameEmployeeMonth = "Максим";
        System.out.println("1.22. Полное имя работника месяца = " + fullNameEmployeeMonth);
        //заголовок электронной книги
        String titleEbook = "Clean Code";
        System.out.println("1.23. Заголовок электронной книги = " + titleEbook);
        //размер
        int size = 60;
        System.out.println("1.24. Размер = " + size + " сантиметров");
        //вместимость
        int capacity = 70;
        System.out.println("1.25. Вместимость = " + capacity + " литров");
        //счетчик
        int counter = 70;
        System.out.println("1.26. Счетчик = " + counter);
        //путь до файла
        String pathFile = "C\\Java\\VariablesTheme.java";
        System.out.println("1.27. Путь до файла = " + pathFile);
        //количество чисел в каждой строке
        int sumNumEachRow = 100;
        System.out.println("1.28. Количество чисел в каждой строке = " + sumNumEachRow);

    }
}
