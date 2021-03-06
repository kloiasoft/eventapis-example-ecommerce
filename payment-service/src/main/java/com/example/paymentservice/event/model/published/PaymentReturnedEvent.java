package com.example.paymentservice.event.model.published;

import io.splitet.core.common.EventType;
import io.splitet.core.common.PublishedEvent;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class PaymentReturnedEvent extends PublishedEvent {

    private String orderId;

    private float amount;

    private EventType eventType = EventType.OP_SINGLE;
}
