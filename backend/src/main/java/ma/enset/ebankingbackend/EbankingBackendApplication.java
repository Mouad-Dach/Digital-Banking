package ma.enset.ebankingbackend;

import ma.enset.ebankingbackend.dtos.BankAccountDTO;
import ma.enset.ebankingbackend.dtos.CurrentAccountDTO;
import ma.enset.ebankingbackend.dtos.CustomerDTO;
import ma.enset.ebankingbackend.dtos.SavingAccountDTO;
import ma.enset.ebankingbackend.entities.*;
import ma.enset.ebankingbackend.enums.AccountStatus;
import ma.enset.ebankingbackend.enums.OperationType;
import ma.enset.ebankingbackend.enums.Role;
import ma.enset.ebankingbackend.exceptions.BalanceNotSufficientException;
import ma.enset.ebankingbackend.exceptions.BankAccountNotFoundException;
import ma.enset.ebankingbackend.exceptions.CustomerNotFoundException;
import ma.enset.ebankingbackend.repositories.AccountOperationRepository;
import ma.enset.ebankingbackend.repositories.BankAccountRepository;
import ma.enset.ebankingbackend.repositories.CustomerRepository;
import ma.enset.ebankingbackend.repositories.UserRepository;
import ma.enset.ebankingbackend.services.BankAccountService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class EbankingBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(EbankingBackendApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(BankAccountService bankAccountService) {
        return args -> {
            // This method can be used to initialize data if needed
        };
    }
    /**
     * Alternative data initialization method.
     * Uncomment the @Bean annotation to use this method instead of commandLineRunner.
     */
    // @Bean
    CommandLineRunner start(CustomerRepository customerRepository,
                            BankAccountRepository bankAccountRepository,
                            AccountOperationRepository accountOperationRepository) {
        return args -> {
            // Initialize sample customers, accounts and operations
            // This method is currently disabled in favor of the simpler commandLineRunner above
        };
    }
}
