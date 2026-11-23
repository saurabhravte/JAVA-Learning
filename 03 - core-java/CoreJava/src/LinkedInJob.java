import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Optional;

public class LinkedInJob {
    static void main() {
         Optional<String> offer =  checkJobOffer("saurabh");
        System.out.println(offer.orElse("No offer yet"));

//        base salary + bonus
        BigDecimal baseSalary = new BigDecimal("1200000");
        BigDecimal bonus = baseSalary.multiply(new BigDecimal("15")).divide(
                new BigDecimal(100),2, RoundingMode.HALF_UP
        );
        System.out.println("Final CTC: ");
        System.out.println("Base salary :: " + baseSalary);
        System.out.println("Bonus :: " + bonus);
    }

    static Optional<String> checkJobOffer(String name){
        if(name.startsWith("sau")){
            return Optional.of("Job offer granted.");
        }
        return Optional.empty();
    }
}
