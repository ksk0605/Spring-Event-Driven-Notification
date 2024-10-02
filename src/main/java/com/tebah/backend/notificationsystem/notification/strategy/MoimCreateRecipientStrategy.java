package com.tebah.backend.notificationsystem.notification.strategy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.tebah.backend.notificationsystem.notification.domain.NotificationType;
import com.tebah.backend.notificationsystem.notification.domain.Recipient;
import com.tebah.backend.notificationsystem.notification.infrastructure.entity.FcmTokenEntity;
import com.tebah.backend.notificationsystem.notification.infrastructure.repository.FcmTokenRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class MoimCreateRecipientStrategy implements RecipientStrategy {

	private final FcmTokenRepository tokenRepository;

	@Override
	public boolean support(NotificationType notificationType) {
		return notificationType == NotificationType.MOIM_CREATED;
	}

	@Override
	public List<Recipient> selectRecipients(NotificationType notificationType) {
		List<FcmTokenEntity> fcmTokenEntities = tokenRepository.findAll();

		// 어쩌구 저쩌구
		List<String> tokens = new ArrayList<>();
		tokens.add("token1");

		return List.of(new Recipient(tokens));
	}
}
