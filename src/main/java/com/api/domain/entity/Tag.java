package com.api.domain.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

/** 
 * タグテーブル
 */
public record Tag(@Id Long id, String corporateId, String collectFile, String collectCycle, LocalDateTime createdAt, LocalDateTime updatedAt) {
        // 処理
}

/**
 * Usage: 
 * -------- コンストラクタ上書 --------
 * public Title(String value){
 *      this.value = value + "hoge";
 * }
 * 
 * -------- Bean Validation --------
 * public record Title(
 *      @NotEmpty(message = "タイトルを入力してください")
 *      String value
 * ) { }
 * 
 * -------- method --------
 * public record Title(String value) {
 *      public int length() {
 *          return this.value.length();
 *      }
 * }
 */