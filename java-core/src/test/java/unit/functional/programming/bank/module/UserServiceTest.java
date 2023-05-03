package unit.functional.programming.bank.module;

import effective.java.com.functional.programming.bank.module.model.Bank;
import effective.java.com.functional.programming.bank.module.model.Gender;
import effective.java.com.functional.programming.bank.module.model.Loan;
import effective.java.com.functional.programming.bank.module.model.User;
import effective.java.com.functional.programming.bank.module.service.UserService;
import org.junit.jupiter.api.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UserServiceTest {
    private static final UserService userService = new UserService();
    private static final List<User> usersWithRepaidLoans = new ArrayList<>();
    private static Bank pekao;
    private static Bank mBank;
    private static Bank revolute;

    private static void initUsersWithRepaidLoans() {
        List<Loan> repaidLoans = List.of(new Loan(6L, new GregorianCalendar(2013, 2, 16).getTime(), new GregorianCalendar(2015, 3, 20).getTime(), new BigDecimal(123), new BigDecimal(0), mBank),
                new Loan(7L,  new GregorianCalendar(2017, 1, 2).getTime(), new GregorianCalendar(2018, 10, 23).getTime(), new BigDecimal(3800), new BigDecimal(4222), revolute),
                new Loan(8L,  new GregorianCalendar(2013, 1, 4).getTime(), new GregorianCalendar(2020, 1, 13).getTime(), new BigDecimal(4800), new BigDecimal(5222), pekao));

        usersWithRepaidLoans.add(new User(1L, 25, "Jordan H.", Gender.MALE, new BigDecimal(1700), repaidLoans));
        usersWithRepaidLoans.add(new User(2L, 63, "Chris B.", Gender.FEMALE, new BigDecimal(55000), repaidLoans));
        usersWithRepaidLoans.add(new User(3L, 19, "Andrew J.", Gender.MALE, new BigDecimal(500), repaidLoans));
    }

    @BeforeAll
    static void initUsers() {
        initBanks();
        initUsersWithRepaidLoans();
    }

    private static void initBanks() {
        pekao = new Bank(2L, "Mono Bank");
        mBank = new Bank(3L, "Revolute Bank");
        revolute = new Bank(4L, "NBU Bank");
    }

    @Test
    @Order(1)
    public void shouldGroupByAge() {
        Map<Integer, List<User>> usersGroupedByAge = userService.groupByAge(usersWithRepaidLoans);
        //assertTrue
    }

}
