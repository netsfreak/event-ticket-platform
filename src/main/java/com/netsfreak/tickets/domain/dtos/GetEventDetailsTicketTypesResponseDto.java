package com.netsfreak.tickets.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class GetEventDetailsTicketTypesResponseDto {
    private UUID id;
    private String name;
    private Double price;
    private String description;
    private Integer totalAvailable;
    private LocalDateTime CreatedAt;
    private LocalDateTime UpdatedAt;
}
