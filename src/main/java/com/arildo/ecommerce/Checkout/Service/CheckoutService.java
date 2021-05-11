package com.arildo.ecommerce.Checkout.Service;

import com.arildo.ecommerce.Checkout.Entity.CheckoutEntity;
import com.arildo.ecommerce.Checkout.Resource.Checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);
}
