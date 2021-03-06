package com.example.stockservice.event.model.published;

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
public class StockReservedEvent extends PublishedEvent {

    private String orderId;

    private long numberOfItemsSold;

    private EventType eventType = EventType.EVENT;
}
