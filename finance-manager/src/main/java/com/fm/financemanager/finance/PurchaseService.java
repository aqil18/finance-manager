package com.fm.financemanager.finance;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseService {
    public List<Purchase> getPurchases(){
        return List.of(
                new Purchase("Groceries", "Apples", "10th of Sept",  10.0)
        );
    }
}
