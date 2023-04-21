package pro.sky.diploma.mapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import pro.sky.diploma.dto.Avatar;
import pro.sky.diploma.entity.AvatarEntity;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AvatarMapper {
    @Mapping(source = "id", target = "id")
    @Mapping(target = "user.id", source = "userId")
    @Mapping(source = "path", target = "path")
    AvatarEntity toEntity(Avatar dto);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "user.id", target = "userId")
    @Mapping(source = "path", target = "path")
    Avatar toDto(AvatarEntity entity);

    List<Avatar> toDtoList(List<AvatarEntity> entityList);

    List<AvatarEntity> toEntityList(List<Avatar> dtoList);
}