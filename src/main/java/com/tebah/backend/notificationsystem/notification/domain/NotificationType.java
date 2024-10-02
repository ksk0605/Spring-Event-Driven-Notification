package com.tebah.backend.notificationsystem.notification.domain;

public enum NotificationType {

	// 모임 생성
	MOIM_CREATED("모임이 만들어졌어요!"),

	// 모임 변경
	MOIMING_COMPLETED("모집이 마감되었어요!"),
	MOINING_REOPENED("모집이 재개되었어요!"),
	MOIM_CANCELLED("모임이 취소되었어요!"),
	MOIM_MODIFIED("모임 정보가 변경되었어요!"),
	NEW_COMMENT("님이 댓글을 남겼어요!"),
	NEW_REPLY("님이 답글을 남겼어요!"),
	NEW_MOIMEE_JOINED("님이 모임에 참여했어요!"),
	MOIMEE_LEFT("님이 참여를 취소했어요!"),
	MOIM_PLACE_CONFIRMED("모임 장소가 확정되었어요!"),
	MOIM_TIME_CONFIRMED("모임 시간이 확정되었어요!"),


	// 채팅
	NEW_CHAT("님이 메시지를 보냈어요!"),

	// 안내면진다
	NEW_BET("안내면진다가 만들어졌어요!"),
	BET_COMPLETE("안내면진다 결과가 발표되었어요!");

	private final String message;

	NotificationType(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
