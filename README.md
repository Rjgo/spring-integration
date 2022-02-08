# Spring Integration
## Introduction
This is a demo project learning Spring Integration.

### Channels
If you have a direct dependency on a service, you can use a channel to 
remove that dependency. <br/> <br/>For example, <br/>

```
@SpringBootApplication
public class SpringIntegrationApplication implements ApplicationRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringIntegrationApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments arg0) {

		channel.subscribe(new MessageHandler(){

			@Override
			public void handleMessage(Message<?> message) throws MessagingException {
				new PrintService().print((Message<String>)message);
				
			}
			
		});
		
		Message<String> message = MessageBuilder.withPayload("Hello World, from the builder pattern")
				.setHeader("newHeader", "newHeaderValue").build();
		channel.send(message);
	}

}


```



@SpringBootApplication
@Configuration
@ImportResource("integration-context.xml")
public class SpringIntegrationApplication implements ApplicationRunner {

	@Autowired
	private DirectChannel channel;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringIntegrationApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments arg0) {

		channel.subscribe(new MessageHandler(){

			@Override
			public void handleMessage(Message<?> message) throws MessagingException {
				new PrintService().print((Message<String>)message);
				
			}
			
		});
		
		Message<String> message = MessageBuilder.withPayload("Hello World, from the builder pattern")
				.setHeader("newHeader", "newHeaderValue").build();
		channel.send(message);
	}

}


