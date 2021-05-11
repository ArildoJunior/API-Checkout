package com.arildo.ecommerce.Checkout.Service;

import com.arildo.ecommerce.Checkout.Entity.CheckoutEntity;
import com.arildo.ecommerce.Checkout.Repository.CheckoutRepository;
import com.arildo.ecommerce.Checkout.Resource.Checkout.CheckoutRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CheckoutServiceImpl implements CheckoutService {

    private final CheckoutRepository checkoutRepository;

    @Override
    public Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest) {
        final CheckoutEntity checkoutEntity = CheckoutEntity.builder()
            .code(UUID.randomUUID().toString())
            .build();
        return Optional.of( checkoutRepository.save(checkoutEntity));
    }
}
