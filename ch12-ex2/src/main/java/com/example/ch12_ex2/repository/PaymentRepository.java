package com.example.ch12_ex2.repository;

import com.example.ch12_ex2.model.Purchase;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PaymentRepository {
    private final JdbcTemplate jdbc;

    public PaymentRepository(JdbcTemplate jdbc){
        this.jdbc = jdbc;
    }

    public void storePurchases(Purchase purchase){
        String sql = "INSERT INTO purchase VALUES (DEFAULT, ?, ?)";
        jdbc.update(sql, purchase.getProduct(), purchase.getPrice());
    }

    public List<Purchase> findAllPurchases(){
        String sql = "SELECT * FROM purchase";
        RowMapper<Purchase> purchaseRowMapper = (r,i)-> {
            Purchase rowObj = new Purchase();
            rowObj.setId(r.getInt("id"));
            rowObj.setProduct(r.getString("product"));
            rowObj.setPrice(r.getBigDecimal("price"));
            return rowObj;
        };
        return jdbc.query(sql, purchaseRowMapper);
    }
}
