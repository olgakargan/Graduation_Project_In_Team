package pro.sky.diploma.service;

import org.springframework.data.util.Pair;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import pro.sky.diploma.dto.Ads;
import pro.sky.diploma.dto.CreateAds;
import pro.sky.diploma.dto.FullAds;
import pro.sky.diploma.dto.ResponseWrapperAds;
import pro.sky.diploma.entity.AdsEntity;
import pro.sky.diploma.exception.AdsNotFoundException;

import java.io.IOException;

/**
 * Сервис объявлений
 */

public interface AdsService {

    /**
     * Добавляет новое объявление
     *
     * @param properties     {@link CreateAds}
     * @param image
     * @param username
     * @return Созданное объявление
     */
    Ads addAds(CreateAds properties, MultipartFile image, String username) throws IOException;

    /**
     * Удаляет запись из БД по id
     *
     * @param id
     * @throws AdsNotFoundException исключение, если запись с id не найдена
     */
    ResponseEntity<Void> deleteAds(Integer id);

    /**
     * Изменяет объявление
     *
     * @param id
     * @param createAds
     * @return
     */
    Ads updateAds(Integer id, CreateAds createAds);

    /**
     * Получает объявление по id
     *
     * @param id
     * @return
     */
    FullAds getFullAds(Integer id);

    /**
     * Получаем все объявления
     *
     * @return
     */
    ResponseWrapperAds getAllAds();

    /**
     * Возвращает объявления конкретного пользователя
     *
     * @param username
     * @return
     */
    ResponseWrapperAds getAdsMe(String username);

    /**
     * Возвращает сущность объявления по id
     *
     * @param id
     * @return
     */
    AdsEntity getAds(Integer id);

    /**
     * Метод получает постер для объявления по его ID
     *
     * @param adsId ID объявления
     * @return poster
     */
    Pair<byte[], String> getPoster(Integer adsId);

    /**
     * Метод изменяет постер для объявления по ID объявления (или добавляет постер)
     *
     * @param adsId ID объявления
     * @return poster
     */
    Pair<byte[], String> updatePosterOfAds(Integer adsId, MultipartFile image) throws IOException;
}