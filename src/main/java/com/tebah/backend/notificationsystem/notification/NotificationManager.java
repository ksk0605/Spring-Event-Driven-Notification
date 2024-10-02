package com.tebah.backend.notificationsystem.notification;

import java.util.List;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.tebah.backend.notificationsystem.notification.channel.NotificationChannel;
import com.tebah.backend.notificationsystem.notification.event.NotificationEvent;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RequiredArgsConstructor
public class NotificationManager {

	private final List<NotificationChannel> notificationChannels;

	@Async
	@EventListener
	public void listenEvent(NotificationEvent event) {
		log.info("event listen! {}", event);
		for (NotificationChannel notificationChannel : notificationChannels) {
			if (notificationChannel.support(event.getNotificationType())) {
				notificationChannel.send(event);
			}
		}
	}
}
