package com.netsfreak.tickets.domain.dtos;

import com.netsfreak.tickets.domain.entities.EventStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListEventResponseDto {
            private UUID id;
            private String name;
            private LocalDateTime start;
            private LocalDateTime end;
            private String venue;
            private LocalDateTime salesStart;
            private LocalDateTime salesEnd;
            private EventStatusEnum status;





}


