package com.yaini.adapter.in.batch.tasklet.chunk.processor;

import com.yaini.adapter.in.batch.item.CustomerItem;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class CustomerProcessor implements ItemProcessor<CustomerItem, CustomerItem> {

  @Override
  public CustomerItem process(final CustomerItem item) {

    return CustomerItem.builder()
        .id(item.getId())
        .name(item.getName())
        .birth(item.getBirth())
        .build();
  }
}