package com.arildo.ecommerce.Checkout.Config;

import com.arildo.ecommerce.Checkout.Streaming.CheckoutCreatedSource;
import com.arildo.ecommerce.Checkout.Streaming.PaymentPaidSink;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(value = {
        CheckoutCreatedSource.class,
        PaymentPaidSink.class
})
public class StreamingConfig {
}