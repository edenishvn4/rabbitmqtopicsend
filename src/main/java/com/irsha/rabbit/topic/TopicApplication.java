package com.irsha.rabbit.topic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TopicApplication {

	public static void main(String[] args) {
		SpringApplication.run(TopicApplication.class, args);

		SendTopic sendTopic = new SendTopic();
		String[] data ={"office.critical","A critical office error"};
		sendTopic.sentTopic(data);
	}
}
