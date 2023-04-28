import java.util.Scanner;

public class Final2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Main result = new Main();
        System.out.println("Введите данные через пробел в виде '2 + 2'");
        String str = input.nextLine();
        String str2 = result.calc(str);


        System.out.println("Итого:\n" + str2);
    }
}

class Main{
    public static String calc(String input){

        String exception = "Введено неверное количество операторов или операндов";
        String exception2 = "Допустимый ввод чисел от 1 до 10";
        String exception3 = "Введен недопустимый оператор";
        int result = 0;
        String[] inputSplit = input.split(" ");
        if (inputSplit.length != 3){
            return exception;
        }
        Integer firstNumber = 0;
        Integer secondNumber = 0;

            firstNumber = Integer.valueOf(inputSplit[0]);
            secondNumber = Integer.valueOf(inputSplit[2]);


        if ((firstNumber < 1) || (firstNumber > 10) || (secondNumber < 1) || (secondNumber > 10)){
            return exception2;
        }

        String sign = inputSplit[1];
        switch (sign) {
            case "+" -> result = firstNumber + secondNumber;
            case "-" -> result = firstNumber - secondNumber;
            case "*" -> result = firstNumber * secondNumber;
            case "/" -> result = firstNumber / secondNumber;
            default -> {
                return exception3;
            }
        }

        String output;


            output = Integer.toString(result);


        return output;
    }




}