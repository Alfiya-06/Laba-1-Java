
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Laba laba = new Laba();
        Scanner scanner = new Scanner(System.in);

        // Задача 1. Отделить дробную часть от числа.
        System.out.println("Задача 1. Введите дробное число: ");
        double number = scanner.nextDouble();
        if (number!= (int)number) {
            System.out.println("Дробная часть числа:");
            System.out.println("Результат: "+laba.fraction(number));
        } else {
            System.out.println("Ошибка! Нужно ввести дробное число");
        }

        //Задача 2. Преобразовать символ в число.
        char inputChar;
        while (true) {
            System.out.println("Задача 2. Введите цифру от 0 до 9: ");
            inputChar = scanner.next().charAt(0);

            if (Character.isDigit(inputChar)) {
                break;
            } else {
                System.out.println("Ошибка! Нужно ввести цифру от 0 до 9");
            }
        }
        System.out.println("Символ " + inputChar + " преобразован в число: " + laba.charToNum(inputChar));


        //Задача 3. true, если число двузначное.
        int twoDigitNumber;
        while (true) {
            System.out.println("Задача 3. Введите двузначное число: ");
            twoDigitNumber = scanner.nextInt();

            if ((twoDigitNumber >= 10 && twoDigitNumber <= 99) ||
                    (twoDigitNumber <= -10 && twoDigitNumber >= -99)) {
                break;
            } else {
                System.out.println("Ошибка! Нужно ввести двузначное число");
            }
        }
        System.out.println("Число двузначное, поэтому результат: " + laba.is2Digits(twoDigitNumber));


        // Задача 4. true, если число входит в указанный диапазон.
        int firstNumber;
        int secondNumber;
        int numberToCheck;
        while (true) {
            System.out.println("Задача 4. Введите границы числового диапазона и число для проверки:");

            if (scanner.hasNextInt()) {
                firstNumber = scanner.nextInt();
            } else {
                System.out.println("Ошибка! Нужно ввести целое число.");
                scanner.nextLine();
                continue;
            }

            if (scanner.hasNextInt()) {
                secondNumber = scanner.nextInt();
            } else {
                System.out.println("Ошибка! Нужно ввести целое число.");
                scanner.nextLine();
                continue;
            }

            if (scanner.hasNextInt()) {
                numberToCheck = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Ошибка! Нужно ввести целое число.");
                scanner.nextLine();
            }
        }
        if ((numberToCheck >= firstNumber && numberToCheck <= secondNumber) ||
                (numberToCheck <= firstNumber && numberToCheck >= secondNumber)) {
            System.out.println("Число " + numberToCheck + " входит в диапазон (" +
                    firstNumber + "," + secondNumber + "), поэтому результат: " +
                    laba.isInRange(firstNumber, secondNumber, numberToCheck));
        } else {
            System.out.println("Число " + numberToCheck + " не входит в указанный диапазон," +
                    " поэтому результат: " +
                    laba.isInRange(firstNumber, secondNumber, numberToCheck));
        }


        // Задача 5. возвращает true, если все три числа равны
        int number1;
        int number2;
        int number3;
        while (true) {
            System.out.println("Задача 5. Введите три числа: ");

            if (scanner.hasNextInt()) {
                number1 = scanner.nextInt();

                if (scanner.hasNextInt()) {
                    number2 = scanner.nextInt();

                    if (scanner.hasNextInt()) {
                        number3 = scanner.nextInt();
                        scanner.nextLine();
                        break;
                    } else {
                        System.out.println("Ошибка! Нужно ввести целое число");
                        scanner.nextLine();
                    }
                } else {
                    System.out.println("Ошибка! Нужно ввести целое число");
                    scanner.nextLine();
                }
            } else {
                System.out.println("Ошибка! Нужно ввести целое число");
                scanner.nextLine();
            }
        }
        if (number1 == number2 && number2 == number3) {
            System.out.println("Все три числа равны. Результат: " + laba.isEqual(number1, number2, number3));
        } else {
            System.out.println("Все три числа не равны, поэтому результат: " + laba.isEqual(number1, number2, number3));
        }


        // Задача 6. Вовращает модуль числа.
        int integer;
        while (true) {
            System.out.println("Задача 6. Введите целое число: ");
            if (scanner.hasNextInt()) {
                integer = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Ошибка! Нужно ввести целое число");
                scanner.nextLine();
            }
        }
        System.out.println("Модуль числа: " + integer + " равен " + laba.abs(integer));


        //Задача 7. True, если число делится на 3 и 5.
        int count;
        while (true) {
            System.out.println("Задача 7. Введите целое число: ");
            if (scanner.hasNextInt()) {
                count = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Ошибка! Нужно ввести целое число");
                scanner.nextLine();
            }
        }
        if (laba.is35(count)) {
            System.out.println("Число: " + count + " делится на 3 или 5," +
                    " поэтому результат: " + laba.is35(count));
        } else {
            System.out.println("Число не удовлетворяет условию, поэтому результат: " + laba.is35(count));
        }


        //Задача 8. Максимальное из трех чисел.
        int numberFirst;
        int numberSecond;
        int numberThird;
        while (true) {
            System.out.println("Задача 8. Введите три целых числа: ");
            if (scanner.hasNextInt()) {
                numberFirst = scanner.nextInt();
                if (scanner.hasNextInt()) {
                    numberSecond = scanner.nextInt();
                    if (scanner.hasNextInt()) {
                        numberThird = scanner.nextInt();
                        scanner.nextLine();
                        break;
                    } else {
                        System.out.println("Ошибка! Нужно ввести целое число");
                        scanner.nextLine();
                    }
                } else {
                    System.out.println("Ошибка! Нужно ввести целое число");
                    scanner.nextLine();
                }
            } else {
                System.out.println("Ошибка! Нужно ввести целое число");
                scanner.nextLine();
            }
        }
        System.out.println("Максимальное из трёх чисел: "
                + laba.max3(numberFirst, numberSecond, numberThird));


        //Задача 9. Сумма чисел.
        int FirstNumber;
        int SecondNumber;
        while(true){
            System.out.println("Задача 9. Введите два целых числа:");

            if (scanner.hasNextInt()){
                FirstNumber = scanner.nextInt();

                if (scanner.hasNextInt()){
                    SecondNumber = scanner.nextInt();
                    scanner.nextLine();
                    break;
                }else {
                    System.out.println("Ошибка! Нужно ввести целое число");
                    scanner.nextLine();
                }
            }else {
                System.out.println("Ошибка! Нужно ввести целое число:");
                scanner.nextLine();
            }
        }
        System.out.println("Результат: " + laba.sum2(FirstNumber, SecondNumber));


        // Задача 10. Дни недели.
        int day;
        while (true){
            System.out.println("Задача 10. Введите номер дня недели (1-7): ");
            if (scanner.hasNextInt()){
                day = scanner.nextInt();
                scanner.nextLine();
                break;
            }else{
                System.out.println("Ошибка! Нужно вести целое число");
                scanner.nextLine();
            }
        }
        System.out.println("Результат: " + laba.day(day));


        // Задача 11. Строка с числами.
        int inputNumber;
        while (true){
            System.out.println("Задача 11. Введите целое число: ");
            if (scanner.hasNextInt()){
                inputNumber = scanner.nextInt();
                scanner.nextLine();
                break;
            }else{
                System.out.println("Ошибка! Нужно вести целое число");
                scanner.nextLine();
            }
        }
        System.out.println("Результат: " + laba.listNums(inputNumber));


        // Задача 12. Четные числа.
        int evenNumber;
        while (true) {
            System.out.println("Задача 12. Введите целое число: ");
            if (scanner.hasNextInt()) {
                evenNumber = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Ошибка! Нужно ввести целое число");
                scanner.nextLine();
            }
        }
        System.out.println("Результат: " + laba.chet(evenNumber));


        // Задача 13. Количество знаков в числе.
        int numeric;
        while (true) {
            System.out.println("Задача 13. Введите целое число: ");
            if (scanner.hasNextInt()) {
                numeric = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Ошибка! Нужно ввести целое число");
                scanner.nextLine();
            }
        }
        System.out.println("Результат: " + laba.numLen(numeric));


        // Задача 14. Квадрат из "*"
        int userValue;
        while (true) {
            System.out.println("Задача 14. Введите целое число: ");
            if (scanner.hasNextInt()) {
                userValue = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Ошибка! Нужно ввести целое число");
                scanner.nextLine();
            }
        }
        System.out.println("Результат: " );
        laba.square(userValue);


        //Задача 15. треугольник из "*".
        int value;
        while (true) {
            System.out.println("Задача 15. Введите целое число: ");
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Ошибка! Пожалуйста введите целое число");
                scanner.nextLine();
            }
        }
        System.out.println("Результат: " );
        laba.rightTriangle(value);


        //Задача 16. Индекс числа.
        int[] arr = {1, 2, 32, 221, 26, 321, -32, 2};

        int numIndex;
        while (true){
            System.out.println("Задача 16. Введите целое число: ");
            if (scanner.hasNextInt()){
                numIndex = scanner.nextInt();
                scanner.nextLine();
                break;
            }else {
                System.out.println("Ошибка! Пожалуйста введите целое число");
            }
        }
        System.out.println("Индекс первого вхождения числа " +numIndex + " равен " + laba.findFirst(arr,numIndex));


        //Задача 17. Наибольшее по модулю значение.
        int length;
        while (true) {
            System.out.println("Задача 17. Введите длину массива:");
            if (scanner.hasNextInt()) {
                length = scanner.nextInt();
                if (length > 0) {
                    scanner.nextLine();
                    break;
                } else {
                    System.out.println("Ошибка! Длина массива должна быть положительной.");
                }
            } else {
                System.out.println("Ошибка! Нужно ввести целое число.");
                scanner.nextLine();
            }
        }

        int[] array = new int[length];
        while (true) {
            System.out.println("Введите " + length + " элементов массива через пробел:");
            String inputLine = scanner.nextLine();
            String[] numbers = inputLine.split(" ");

            if (numbers.length != length) {
                System.out.println("Ошибка! Нужно ввести ровно " + length + " чисел.");
                continue;
            }

            try {
                for (int i = 0; i < length; i++) {
                    array[i] = Integer.parseInt(numbers[i]);
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Введите только целые числа. Попробуйте снова.");
            }
        }
        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Наибольшее по модулю значение: " + laba.maxAbs(array));


        //Задача 19. Массив задом наперед.
        int size;
        while (true) {
            System.out.println("Задача 19. Введите длину массива:");
            if (scanner.hasNextInt()) {
                size = scanner.nextInt();
                if (size > 0) {
                    scanner.nextLine();
                    break;
                } else {
                    System.out.println("Ошибка! Длина массива должна быть положительной.");
                }
            } else {
                System.out.println("Ошибка! Нужно ввести целое число.");
                scanner.nextLine();
            }
        }

        int[] values = new int[size];
        while (true) {
            System.out.println("Введите " + size + " элементов массива через пробел:");
            String inputLine = scanner.nextLine();
            String[] numbers = inputLine.split(" ");

            if (numbers.length != size) {
                System.out.println("Ошибка! Нужно ввести ровно " + size + " чисел.");
                continue;
            }

            try {
                for (int i = 0; i < size; i++) {
                    values[i] = Integer.parseInt(numbers[i]);
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Введите только целые числа. Попробуйте снова.");
            }
        }
        System.out.println("Массив: " + Arrays.toString(values));
        System.out.println("Массив записанный задом наперед: " + Arrays.toString(laba.reverseBack(values)));
    }
}

