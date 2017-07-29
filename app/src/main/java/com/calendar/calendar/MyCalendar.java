package com.calendar.calendar;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.calendar.calendar.modal.CalendarEvents;
import com.github.sundeepk.compactcalendarview.CompactCalendarView;

import java.util.ArrayList;

public class MyCalendar extends AppCompatActivity {

    CompactCalendarView compactCalendarView;
    Bundle bundle;
    Intent intent;
    ArrayList<CalendarEvents> events = new ArrayList<CalendarEvents>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_calendar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        compactCalendarView = (CompactCalendarView) findViewById(R.id.compactcalendar_view);

        intent = getIntent();
        bundle = intent.getBundleExtra(Constants.EVENTS_FROM_API);
        events = (ArrayList<CalendarEvents>) bundle.getSerializable(Constants.EVENTS_FROM_API);

        if (events != null){
            for(CalendarEvents event: events) {
                Toast.makeText(this, event.getEventSummary(), Toast.LENGTH_SHORT).show();
            }
        }
    }

}
