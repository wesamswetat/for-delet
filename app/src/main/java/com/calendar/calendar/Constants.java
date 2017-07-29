package com.calendar.calendar;

import com.google.api.services.calendar.CalendarScopes;

/**
 * Created by wesamswetat on 7/30/17.
 */

public final class Constants {

    // for Calendar Google Api
    public static final int REQUEST_ACCOUNT_PICKER = 1000;
    public static final int REQUEST_AUTHORIZATION = 1001;
    public static final int REQUEST_GOOGLE_PLAY_SERVICES = 1002;
    public static final int REQUEST_PERMISSION_GET_ACCOUNTS = 1003;
    public static final String[] SCOPES = {CalendarScopes.CALENDAR_READONLY};

    // save account name to SharedPreferences
    public static final String PREF_ACCOUNT_NAME = "accountName";

    // event send by intent.putExtra key
    public static final String EVENTS_FROM_API = "eventFromApi";

}
