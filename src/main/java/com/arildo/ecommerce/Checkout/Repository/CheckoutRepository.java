package com.arildo.ecommerce.Checkout.Repository;

import com.arildo.ecommerce.Checkout.Entity.CheckoutEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckoutRepository extends JpaRepository<CheckoutEntity, Long> {
}
