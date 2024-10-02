package com.tebah.backend.notificationsystem.notification.channel;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Component;

import com.tebah.backend.notificationsystem.notification.FcmNotificationService;
import com.tebah.backend.notificationsystem.notification.domain.NotificationType;
import com.tebah.backend.notificationsystem.notification.domain.Recipient;
import com.tebah.backend.notificationsystem.notification.domain.Sender;
import com.tebah.backend.notificationsystem.notification.event.NotificationEvent;
import com.tebah.backend.notificationsystem.notification.infrastructure.entity.MemberNotificationEntity;
import com.tebah.backend.notificationsystem.notification.strategy.RecipientStrategyFactory;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RequiredArgsConstructor
public class PushNotificationChannel implements NotificationChannel {

	private final RecipientStrategyFactory recipientStrategyFactory;
	private final FcmNotificationService fcmNotificationService;

	@Override
	public boolean support(NotificationType notificationType) {
		return true;
	}

	@Override
	public void send(NotificationEvent event) {
		List<Recipient> recipients = recipientStrategyFactory.getStrategy(event.getNotificationType())
			.selectRecipients(event.getNotificationType());
		Sender sender = event.getSender();

		MemberNotificationEntity memberNotification = new MemberNotificationEntity(
			sender.getDarakbangMemberId(),
			event.getPrefix(),
			event.getNotificationType().getMessage(),
			event.getNotificationType().toString(),
			"targetUrl",
			LocalDateTime.now()
		);
		fcmNotificationService.notify(memberNotification, recipients);
	}
}
