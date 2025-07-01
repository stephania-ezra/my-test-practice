package ColllectionsFromBook;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FiveNumbersFromUserPrintReverse {
    private final Logger log = LogManager.getLogger(FiveNumbersFromUserPrintReverse.class);

    public static void main(String[] args) {
        FiveNumbersFromUserPrintReverse fnfupr = new FiveNumbersFromUserPrintReverse();
        fnfupr.getReverseNumber();
    }

    void getReverseNumber(){
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        log.info("Enter five numbers");
        for(int i =0;i<5;i++){
            numbers.add(sc.nextInt());
        }

        for(Integer number : numbers){
            //reverse logic
            int answer = 0;
            while(number>0){
                int lastDigit = number % 10;
                answer = answer*10 +lastDigit;
                number = number /10;
            }
            System.out.print(answer+" ");
        }
    }
}
