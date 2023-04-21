package pro.sky.diploma.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Класс-DTO с полной контактной информацией о пользователе, размещающим объявление
 */
@Data
public class FullAds {
    @JsonProperty("image")
    private String image;
    @JsonProperty("authorLastName")
    private String authorLastName;
    @JsonProperty("authorFirstName")
    private String authorFirstName;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("description")
    private String description;
    @JsonProperty("title")
    private String title;
    @JsonProperty("email")
    private String email;
    @JsonProperty("price")
    private Integer price;
    @JsonProperty("pk")
    private Integer id;
}