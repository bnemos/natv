package kg.megalab.natv.mappers;

import kg.megalab.natv.models.dto.DaysDto;
import kg.megalab.natv.models.entity.Days;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DaysMapper {
    DaysMapper INSTANCE = Mappers.getMapper(DaysMapper.class);

    Days mapToDays(DaysDto daysDto);
    DaysDto mapToDaysDto(Days days);

}