package com.netsfreak.tickets.services;

import com.netsfreak.tickets.domain.CreateEventRequest;
import com.netsfreak.tickets.domain.entities.Event;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface EventService {
    Event createEvent(UUID organizerId, CreateEventRequest event);
    Page<Event> listEventsForOrganizer( UUID organizerId, Pageable pageable);
}
