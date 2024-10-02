package com.tebah.backend.notificationsystem.notification.channel;

import org.springframework.stereotype.Component;

import com.tebah.backend.notificationsystem.notification.domain.NotificationType;
import com.tebah.backend.notificationsystem.notification.event.NotificationEvent;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class SlackNotificationChannel implements NotificationChannel {

	@Override
	public boolean support(NotificationType notificationType) {
		return notificationType == NotificationType.MOIM_CANCELLED || notificationType == NotificationType.NEW_BET;
	}

	@Override
	public void send(NotificationEvent event) {
		log.info("Slack notify success!");
	}
}
