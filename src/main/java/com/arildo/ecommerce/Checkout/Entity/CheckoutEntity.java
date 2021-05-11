package com.arildo.ecommerce.Checkout.Entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Builder
@Entity
@Data
public class CheckoutEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String code;

    @Column
    @Enumerated()
    private Status status;

    public enum Status {
        CREATED,
        APROVED
    }
}