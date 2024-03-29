package com.mypack.converter;

import com.mypack.domain.OrderMaster;
import com.mypack.dto.OrderDTO;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

public class OrderMaster2OrderDTOConvetrer {
    public static OrderDTO convert(OrderMaster orderMaster){
        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster,orderDTO);
        return orderDTO;
    }

    public static List<OrderDTO> convert(List<OrderMaster> orderMasters){
        return orderMasters.stream().map(e -> convert(e)).collect(Collectors.toList());
    }
}
