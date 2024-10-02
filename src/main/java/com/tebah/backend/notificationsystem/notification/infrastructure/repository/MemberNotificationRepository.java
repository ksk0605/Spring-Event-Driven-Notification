package com.tebah.backend.notificationsystem.notification.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tebah.backend.notificationsystem.notification.infrastructure.entity.MemberNotificationEntity;

public interface MemberNotificationRepository extends JpaRepository<MemberNotificationEntity, Long> {
}
