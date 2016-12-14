import java.util.ArrayList;
import java.util.List;

public class NumberList {

    public  List<Integer> Odd(List<Integer> numberlist) {
        List<Integer> oddNumbers = new ArrayList<Integer>();

        for(Integer number: numberlist) {
            if(number % 2 == 1) {
                oddNumbers.add(number);
            }
        }

        return oddNumbers;
    }

    public  List<Integer> Even(List<Integer> numberlist) {
        List<Integer> evenNumbers = new ArrayList<Integer>();

        for(Integer number: numberlist) {
            if(number % 2 == 0) {
                evenNumbers.add(number);
            }
        }

        return evenNumbers;
    }

    public List<Integer> changeEven(List<Integer> numberlist) {
        List<Integer> numbers = new ArrayList<Integer>();

        for(int i = 0; i < numberlist.size(); i++) {
            int number = numberlist.get(i);
            if(number % 2 == 0) {
                number =  number * 2;
            }
            numbers.add(number);
        }
        return numbers;
    }

    public String findNumber(int number, List<Integer> numberlist) {
        String str = "Not Found";
        for(Integer num: numberlist) {
            if(num == number) {
                str = "Hello," + num;
                break;
            }
        }
        return str;
    }

}
