package io.nbompetsis.streamRabbitmq;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
//import org.springframework.cloud.stream.annotation.Input;
//import org.springframework.cloud.stream.annotation.Output;
//import org.springframework.cloud.stream.annotation.StreamListener;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Import;
//import org.springframework.messaging.Message;
//import org.springframework.messaging.handler.annotation.SendTo;
//import org.springframework.messaging.support.MessageBuilder;
//
//import reactor.core.publisher.Flux;


@SpringBootApplication
@EnableBinding(MyProcessor.class)
public class StreamRabbitmqApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(StreamRabbitmqApplication.class, args);
	}

//	@Autowired
//	private MyProcessor processor;
	
//	@StreamListener(MyProcessor.INPUT)
//	public void handle(String value) {
//		System.out.println("Received: " + value);
//		processor.streamOutput().send(message(value));
//	}
	 
	
//	@StreamListener(MyProcessor.INPUT)
//	@SendTo(MyProcessor.OUTPUT)
//	public String handle(String value) {
//		System.out.println("Received: " + value);
//		return value;
//	}
	
//	@StreamListener
//	@Output(MyProcessor.OUTPUT)
//	public Flux<String> receive(@Input(MyProcessor.INPUT) Flux<String> input) {
//	  return input.map(s -> s.toUpperCase());
//	}
//	
//	private static final <T> Message<T> message(T val) {
//	    return MessageBuilder.withPayload(val).build();
//	}
	
}
