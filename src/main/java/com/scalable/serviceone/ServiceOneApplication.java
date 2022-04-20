package com.scalable.serviceone;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.boot.SpringApplication;
//import org.springframework.context.ApplicationContext;


import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.jms.core.JmsTemplate;
@SpringBootApplication
public class ServiceOneApplication {

	private static String url = "tcp://localhost:61616";

	// default broker URL is : tcp://localhost:61616"
	private static String subject = "JCG_QUEUE";
	public static void main(String[] args)throws JMSException {
		//SpringApplication.run(ServiceOneApplication.class, args);
		//ApplicationContext ctx = SpringApplication.run(
				//ServiceOneApplication.class, args);
		SpringApplication.run(ServiceOneApplication.class, args);
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(url);
		Connection connection = connectionFactory.createConnection();
		connection.start();

		// Creating a non transactional session to send/receive JMS message.
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

		// Destination represents here our queue 'JCG_QUEUE' on the JMS server.
		// The queue will be created automatically on the server.
		Destination destination = session.createQueue(subject);

		// MessageProducer is used for sending messages to the queue.
		MessageProducer producer = session.createProducer(destination);

		// We will send a small text message saying 'Hello World!!!'
		TextMessage message = session.createTextMessage("Hello !!! Welcome to the world of ActiveMQ.");

		// Here we are sending our message!
		producer.send(message);

		System.out.println("BITS AMQ Sample:" + message.getText() + "'");
		connection.close();
		/*JmsTemplate jms = ctx.getBean(JmsTemplate.class);
		jms.convertAndSend("javainuse", "test message");*/
	}

}
