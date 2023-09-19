package com.api.domain.entity;

import java.time.LocalDateTime;
import java.util.set;

import org.springframework.data.relational.core.mapping.Column;

@Entity
@Data
public class Article(@Id Long Integer, String userId, String userName, String bio, Integer tagId, LocalDateTime updateAt, LocalDateTime createdAt) {
  @Column
}
