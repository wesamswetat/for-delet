package com.calendar.calendar.modal;

import com.google.api.client.util.DateTime;

import java.io.Serializable;


/**
 * Created by wesamswetat on 7/30/17.
 */

public class CalendarEvents implements Serializable {

    private String eventSummary;
    private DateTime startDay;
    private DateTime endDay;

    public CalendarEvents(String eventSummary, DateTime startDay, DateTime endDay) {
        this.eventSummary = eventSummary;
        this.endDay = endDay;
        this.startDay = startDay;
    }

    public String getEventSummary() {
        return eventSummary;
    }

    public DateTime getStartDay() {
        return startDay;
    }

    public DateTime getEndDay() {
        return endDay;
    }
}
