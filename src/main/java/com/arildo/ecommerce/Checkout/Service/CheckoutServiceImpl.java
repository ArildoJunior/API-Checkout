package com.arildo.ecommerce.Checkout.Service;

import com.arildo.ecommerce.Checkout.Entity.CheckoutEntity;
import com.arildo.ecommerce.Checkout.Repository.CheckoutRepository;
import com.arildo.ecommerce.Checkout.Resource.Checkout.CheckoutRequest;
import com.arildo.ecommerce.Checkout.Streaming.CheckoutCreatedSource;
import lombok.RequiredArgsConstructor;
//import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CheckoutServiceImpl implements CheckoutService {

    private final CheckoutRepository checkoutRepository;
    private final CheckoutCreatedSource checkoutCreatedSource;

    @Override
    public Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest) {
        final CheckoutEntity checkoutEntity = CheckoutEntity.builder()
            .code(UUID.randomUUID().toString())
            .status(CheckoutEntity.Status.CREATED)
            .build();
        final CheckoutEntity entity  = checkoutRepository.save(checkoutEntity);
       /* final CheckoutCreatedEvent checkoutCreatedEvent = CheckoutCreatedEvent.newBuilder()
                .setCheckoutCode(entity.getCode())
                .setStatus(entity.getStatus().name())
                .build();
        checkoutCreatedSource.output().send(MessageBuilder.withPayload(checkoutEntity).build()); */

        return Optional.of(entity);
    }

    @Override
    public Optional<CheckoutEntity> updateStatus(String checkoutCode, CheckoutEntity.Status status) {
        return Optional.empty();
    }
}