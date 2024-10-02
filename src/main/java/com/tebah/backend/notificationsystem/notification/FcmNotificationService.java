package com.tebah.backend.notificationsystem.notification;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tebah.backend.notificationsystem.notification.domain.Recipient;
import com.tebah.backend.notificationsystem.notification.infrastructure.entity.MemberNotificationEntity;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class FcmNotificationService {

	public void notify(MemberNotificationEntity memberNotification, List<Recipient> recipients) {
		log.info("Notify success! {} {}", memberNotification, recipients);
	}
}
