package com.api.domain.entity;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

/**
 * ユーザーテーブル
 */
public record User(@Id Long id, String userId, String userName, String bio, LocalDateTime updatedAt, LocalDateTime createdAt) {
    // 処理
}
