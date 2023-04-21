package pro.sky.diploma.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class AdsNotFoundException extends RuntimeException {
    public AdsNotFoundException (Integer id) {
        super("Объявление с id: " + id + " не найдено.");
    }
}