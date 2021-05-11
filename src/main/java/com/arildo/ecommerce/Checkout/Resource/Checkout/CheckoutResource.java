package com.arildo.ecommerce.Checkout.Resource.Checkout;

import lombok.Data;

@Data
public class CheckoutResource {

    private String FirstName;
    private String LastName;
    private String email;
    private String address;
    private String complement;
    private String country;
    private String state;
    private String cep;
    private Boolean saveAddress;
    private Boolean saveInfo;
    private String paymentMethod;
    private String cardName;
    private String cardNumber;
    private String cardDate;
    private String cardCvv;
}
