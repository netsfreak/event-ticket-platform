package com.netsfreak.tickets.services;

import com.netsfreak.tickets.domain.CreateEventRequest;
import com.netsfreak.tickets.domain.entities.Event;
import java.util.UUID;

public interface EventService {
    Event createEvent(UUID organizerId, CreateEventRequest event);
}
