package com.api.domain.entity;

import java.time.LocalDateTime;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

/**
 * 記事テーブル
 */
public record Article(@Id Long Integer, String userId, String userName, String bio, @Column("TAG_ID") Set<Tag> tag, LocalDateTime updateAt, LocalDateTime createdAt ) {
  // 処理
}
