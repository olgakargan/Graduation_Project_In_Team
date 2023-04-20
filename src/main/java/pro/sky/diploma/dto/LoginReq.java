package pro.sky.diploma.dto;

import lombok.Data;

/**
 * Класс-DTO для авторизации пользователя на платформе
 */
@Data
public class LoginReq {
    private String password;
    private String username;

}
