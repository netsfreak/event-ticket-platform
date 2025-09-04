package com.netsfreak.tickets.mappers;

import com.netsfreak.tickets.domain.CreateEventRequest;
import com.netsfreak.tickets.domain.CreateTicketTypeRequest;
import com.netsfreak.tickets.domain.dtos.*;
import com.netsfreak.tickets.domain.entities.Event;
import com.netsfreak.tickets.domain.entities.EventStatusEnum;
import com.netsfreak.tickets.domain.entities.TicketType;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EventMapper {

    CreateTicketTypeRequest fromDto(CreateTicketTypeRequestDto dto);

    CreateEventRequest fromDto(CreateEventRequestDto dto);

    CreateEventResponseDto toDto(Event event);

    ListEventTicketTypeResponseDto toDto(TicketType ticketType);

    ListEventResponseDto toListEventResponseDto(Event event);

    GetEventDetailsTicketTypesResponseDto toGetEventDetailsTicketTypesResponseDto(TicketType ticketType);

    GetEventDetailsResponseDto toGetEventDetailsResponseDto(Event event);
}
