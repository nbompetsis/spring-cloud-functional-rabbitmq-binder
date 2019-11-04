package io.nbompetsis.streamRabbitmq;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface MyProcessor {
    String INPUT = "streamInput";
    String OUTPUT = "streamOutput";
    
 
    @Input
    SubscribableChannel streamInput();
 
    @Output("streamOutput")
    MessageChannel streamOutput();
 
}
