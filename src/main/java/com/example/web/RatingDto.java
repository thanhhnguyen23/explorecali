package com.example.web;
import com.example.domain.TourRating;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class RatingDto {
  @Min(0)
  @Max(5)
  private Integer score;

  @Size(max = 255)
  private String comment;

  @NotNull
  private Integer customerId;

  public RatingDto(TourRating tourRating) {
    this(tourRating.getScore(), tourRating.getComment(), tourRating.getPk().getCustomerId());
  }

  private RatingDto(Integer score, String comment, Integer customerId) {
    this.score = score;
    this.comment = comment;
    this.customerId = customerId;
  }

  protected RatingDto() {
  }

  public Integer getScore() { return score;
  }

  public String getComment() {
    return comment;
  }

  public Integer getCustomerId() {
    return customerId;
  }

  public void setScore(Integer score) {
    this.score = score;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

}
