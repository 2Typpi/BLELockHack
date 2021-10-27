package com.mw;

public class Commands {
    public static final byte[] AUTHENTICATION_ID_CONFIRMATION = {8, 0};
    public static final byte[] AUTHENTICATOR = {5, 0};
    public static final byte[] AUTH_DATA = {6, 0};
    public static final byte[] LONG_TERM_KEY_CONFIRMATION = {6, 11, 0};
    public static final byte[] REQUEST_ALARM_TIMES = {8, 1, 0, 25, 0};
    public static final byte[] REQUEST_BATTERY_LEVEL = {8, 1, 0, 27, 0};
    public static final byte[] REQUEST_CHALLENGE = {8, 1, 0, 4, 0};
    public static final byte[] REQUEST_GPS_UNIQUE_ID = {8, 1, 0, 35, 0};
    public static final byte[] REQUEST_IV = {1, 0, 9, 0};
    public static final byte[] REQUEST_KEY_FOB_PLUS_INFO = {8, 1, 0, 30, 0};
    public static final byte[] REQUEST_LOCK_CONFIG = {8, 1, 0, 15, 0};
    public static final byte[] REQUEST_LOCK_STATE = {8, 1, 0, 23, 0};
    public static final byte[] REQUEST_PERSONAL_CODE = {8, 1, 0, 18, 0};
    public static final byte[] RESPONSE_ALARM_SETTINGS = {8, 19, 0};
    public static final byte[] RESPONSE_ALARM_TIMES = {7, 25, 0};
    public static final byte[] RESPONSE_AUTOMODE = {9, 21, 0};
    public static final byte[] RESPONSE_CHALLENGE = {46, 16, 0};
    public static final byte[] RESPONSE_DELETE_PEER = {7, 26, 0};
    public static final byte[] RESPONSE_DEVICE_SETTINGS = {7, 24, 0};
    public static final byte[] RESPONSE_DO_NOT_DISTURB_MODE = {7, 29, 0};
    public static final byte[] RESPONSE_LOCK_ACTION = {9, 17, 0};
    public static final byte[] RESPONSE_PERSONAL_CODE = {9, 18, 0};
    public static final byte[] RESPONSE_SHARE_CODE = {9, 22, 0};
    public static final byte[] RESPONSE_SOUND_SETTINGS = {7, 20, 0};
    public static final byte[] RESPONSE_START_DFU = {6, 28, 0};
    public static final byte[] RESPONSE_START_SIGNAL_SOUND = {6, 36, 0};
}
