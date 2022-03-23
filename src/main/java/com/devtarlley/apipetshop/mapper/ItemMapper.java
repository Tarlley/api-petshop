package com.devtarlley.apipetshop.mapper;

import com.devtarlley.apipetshop.dto.ItemDTO;
import com.devtarlley.apipetshop.model.Item;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ItemMapper {
    public static final ItemMapper INSTANCE = Mappers.getMapper(ItemMapper.class);

    ItemDTO toItemDTO(Item item);
    Item toItem(ItemDTO itemDTO);

    List<ItemDTO> toItemDTO(List<Item> items);
    List<Item> toItem(List<ItemDTO> itemDTOS);
}
