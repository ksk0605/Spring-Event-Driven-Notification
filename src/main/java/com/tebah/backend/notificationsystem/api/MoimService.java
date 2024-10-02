package com.tebah.backend.notificationsystem.api;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.tebah.backend.notificationsystem.notification.domain.NotificationType;
import com.tebah.backend.notificationsystem.notification.domain.Sender;
import com.tebah.backend.notificationsystem.notification.event.NotificationEvent;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class MoimService {

	private final ApplicationEventPublisher events;

	public void createMoim(long id, String name, DarakbangMember darakbangMember) {
		Moim moim = new Moim(id, name);

		events.publishEvent(new NotificationEvent(
			NotificationType.MOIM_CREATED,
			moim.getName(),
			new Sender(
				darakbangMember.getMemberId(),
				darakbangMember.getId(),
				darakbangMember.getNickname()
		)));
	}
}
