package one.digitalinnovation.beerapitest.mapper;

import one.digitalinnovation.beerapitest.dto.BeerDTO;
import one.digitalinnovation.beerapitest.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
