package com.fm.financemanager;

import com.fm.financemanager.finance.Purchase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class FinanceManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinanceManagerApplication.class, args);
	}

    @GetMapping
    public List<Purchase> hello(){
        return List.of(
                new Purchase("Groceries", "Apples", "10th of Sept",  10.0)
        );
    }

}
