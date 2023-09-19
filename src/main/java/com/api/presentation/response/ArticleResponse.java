package com.api.presentation.response;
import Lombok.Data;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ArticleResponse {
  private String title;
  private String content;
  private String image;
  private String category;

  public ArticleResponse(@Id Long id, String corporateId, String title, String content, String image, String category, LocalDateTime createdAt, LocalDateTime updatedAt) {
    @Column
  }
}
