package io.nbompetsis.streamRabbitmq;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.context.annotation.Configuration;

import reactor.core.publisher.Flux;

@Configuration
@EnableBinding(MyProcessor.class)
public class ReactiveBean {

  @StreamListener
  @Output(MyProcessor.OUTPUT)
  public Flux<String> receive(@Input(MyProcessor.INPUT) Flux<String> input) {
    return input.map(s -> s.toUpperCase());
  }
}