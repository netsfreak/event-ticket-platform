package com.netsfreak.tickets.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateTicketTypeResponseDto {
    private String id;
    private String name;
    private Double price;
    private String description;
    private Integer totalAvailable;
    private String createdAt;
    private String updatedAt;
}
