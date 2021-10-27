package com.mw;

import java.util.UUID;

public class Constants {
    public static final String ACTION_INTENT_CLEAR_NOTIFICATION = "ACTION_CLEAR_NOTIFICATION";
    public static final String ACTION_INTENT_CONNECT_TO_DISCOVERED_DEVICE = "ACTION_CONNECT_TO_DISCOVERED_DEVICE";
    public static final String ACTION_INTENT_INIT_LE = "ACTION_INIT_BLE";
    public static final String ACTION_INTENT_INIT_LE_AND_RESTART_SCAN = "ACTION_INIT_BLE_AND_RESTART_SCAN";
    public static final String ACTION_INTENT_REFRESH = "ACTION_REFRESH";
    public static final String ACTION_INTENT_SCAN_FOR_DEVICE = "ACTION_SCAN_FOR_DEVICE";
    public static final String ACTION_INTENT_STOP_SCAN = "ACTION_STOP_SCAN";
    public static final String ACTION_INTENT_STOP_SERVICE = "ACTION_STOP_SERVICE";
    public static final UUID ALARM = UUID.fromString("0000bfff-1212-efde-1523-785fef13d123");
    public static final UUID ALARM_CONFIG = UUID.fromString("0000bffe-1212-efde-1523-785fef13d123");
    public static final String ALARM_MUTED = "ALARM_MUTED";
    public static final String ALARM_OFF = "ALARM_OFF";
    public static final String ALARM_SENS1 = "ALARM_SENS_1";
    public static final String ALARM_SENS2 = "ALARM_SENS_2";
    public static final String ALARM_SENS3 = "ALARM_SENS_3";
    public static final String ALARM_SENS4 = "ALARM_SENS_4";
    public static final UUID ALARM_TIME = UUID.fromString("0000baaf-1212-efde-1523-785fef13d123");
    public static final String ALERT_TASK_BLE_RESET = "BLE_RESET";
    public static final String ALERT_TASK_BOND_INFO = "BOND_INFO";
    public static final String ALERT_TASK_CLEAR_HISTORY_LOG = "CLEAR_HISTORY_LOG";
    public static final String ALERT_TASK_DEFAULT = "DEFAULT_TASK";
    public static final String ALERT_TASK_DO_NOT_DISTURB_MODE = "DO_NOT_DISTURB_MODE";
    public static final String ALERT_TASK_FACTORY_RESET = "FACTORY_RESET";
    public static final String ALERT_TASK_IGNORE_BATTERY_OPTIMIZATION = "IGNORE_BATTERY_OPTIMIZATION";
    public static final String ALERT_TASK_I_L_I_NOT_FOUND = "I_L_I_NOT_FOUND";
    public static final String ALERT_TASK_LOCKING_SOUND_INFO = "LOCKING_SOUND_INFO";
    public static final String ALERT_TASK_MORE_INFOR_FOR_LOCK_CONTROLL_ERROR = "INFO_LOCK_CONTROLL_ERROR";
    public static final String ALERT_TASK_PRE_ALARM = "PRE_ALARM";
    public static final String ALERT_TASK_TURN_BLUETOOTH_ON = "TURN_BLUETOOTH_ON";
    public static final String ALERT_TASK_TURN_BLUETOOTH_ON_OFF = "TURN_BLUETOOTH_ON_OFF";
    public static final String ANDROID = "ANDROID";
    public static final String APP_VERSION_LS = "APP_VERSION";
    public static final byte[] ASCII_CODE_ILI_LTK = {73, 76, 111, 99, 107, 73, 116, 32, 80, 108, 117, 115, 32, 76, 84, 75};
    public static final String AUTH_ID = "AUTH_ID";
    public static final UUID AUTH_SERVICE = UUID.fromString("0000f00f-1212-efde-1523-785fef13d123");
    public static final String AUTOMATIC_RECONNECT_LS = "AUTOMATIC_RECONNECT";
    public static final UUID AUTO_OPEN_CLOSE = UUID.fromString("0000bbbb-1212-efde-1523-785fef13d123");
    public static final String AUTO_RECONNECT_1 = "AUTO_RECONNECT_1";
    public static final String AUTO_RECONNECT_2 = "AUTO_RECONNECT_2";
    public static final String AUTO_RECONNECT_3 = "AUTO_RECONNECT_3";
    public static final String AUTO_RECONNECT_4 = "AUTO_RECONNECT_4";
    public static final String AUTO_RECONNECT_5 = "AUTO_RECONNECT_5";
    public static final String AUTO_RECONNECT_6 = "AUTO_RECONNECT_6";
    public static final String AUTO_RECONNECT_7 = "AUTO_RECONNECT_7";
    public static final String AUTO_RECONNECT_8 = "AUTO_RECONNECT_8";
    public static final String AUTO_RECONNECT_9 = "AUTO_RECONNECT_9";
    public static final String AUTO_RECONNECT_OFF = "AUTO_RECONNECT_OFF";
    public static final String BATTERY_OPTIMIZATION_LINK = "https://ilockit.zendesk.com/hc/de/articles/115002810374-Android-Akku-Leistungsoptimierung-deaktivieren";
    public static final String BATTERY_OPTIMIZATION_LS = "BATTERY_OPTIMIZATION";
    public static final UUID BATTERY_SERVICE = UUID.fromString("0000180f-1212-efde-1523-785fef13d123");
    public static final UUID BATTERY_STATE = UUID.fromString("00002A19-1212-efde-1523-785fef13d123");
    public static final String BUNDLE_ALERT_DIALOG_FRAGMENT_LINK = "ALERT_DIALOG_LINK";
    public static final String BUNDLE_ALERT_DIALOG_FRAGMENT_LISTENER_AUTO_OPEN_BOOLEAN = "ALERT_DIALOG_FRAGMENT_LISTENER_AUTO_OPEN";
    public static final String BUNDLE_ALERT_DIALOG_FRAGMENT_MESSAGE = "ALERT_DIALOG_MESSAGE";
    public static final String BUNDLE_ALERT_DIALOG_FRAGMENT_NEGATIVE_BTN_TEXT = "ALERT_DIALOG_NEGATIVE_BTN_TEXT";
    public static final String BUNDLE_ALERT_DIALOG_FRAGMENT_NEUTRAL_BTN_TEXT = "ALERT_DIALOG_NEUTRAL_BTN_TEXT";
    public static final String BUNDLE_ALERT_DIALOG_FRAGMENT_POSITIVE_BTN_TEXT = "ALERT_DIALOG_POSITIVE_BTN_TEXT";
    public static final String BUNDLE_ALERT_DIALOG_FRAGMENT_TASK = "ALERT_DIALOG_FRAGMENT_TASK";
    public static final String BUNDLE_ALERT_DIALOG_FRAGMENT_TITLE = "ALERT_DIALOG_TITLE";
    public static final String BUNDLE_APP_WIDGET_BUTTON_TEXT = "APP_WIDGET_BUTTON_TEXT";
    public static final String BUNDLE_APP_WIDGET_SET_INACTIVE = "APP_WIDGET_SET_INACTIVE";
    public static final String BUNDLE_BACK_TO_SET_UP_FROM_ERROR = "BACK_TO_SET_UP_FROM_ERROR";
    public static final String BUNDLE_CHANGE_NAME_DIALOG_CURRENT_NAME = "CHANGE_NAME_CURRENT_NAME";
    public static final String BUNDLE_CHANGE_NAME_DIALOG_ID = "CHANGE_NAME_ID";
    public static final String BUNDLE_CHANGE_NAME_DIALOG_POS = "CHANGE_NAME_POS";
    public static final String BUNDLE_DIALOG_FRAGMENT_FIRMWARE_UPDATE_IS_KEY_FOB = "FIRMWARE_UPDATE_DIALOG_IS_KEY_FOB";
    public static final String BUNDLE_DIALOG_FRAGMENT_FIRMWARE_UPDATE_IS_KEY_FOB_CH = "FIRMWARE_UPDATE_DIALOG_IS_KEY_FOB_CH";
    public static final String BUNDLE_DIALOG_FRAGMENT_FIRMWARE_UPDATE_KEY_FOB_FIRMWARE_VERSION = "FIRMWARE_UPDATE_DIALOG_KEY_FOB_FIRMWARE_VERSION";
    public static final String BUNDLE_DIALOG_FRAGMENT_FIRMWARE_UPDATE_KEY_FOB_SERIAL_NUM = "FIRMWARE_UPDATE_DIALOG_KEY_FOB_SERIAL_NUM";
    public static final String BUNDLE_DIALOG_FRAGMENT_MAP_LATITUDE = "MAP_DIALOG_LATITUDE";
    public static final String BUNDLE_DIALOG_FRAGMENT_MAP_LONGITUDE = "MAP_DIALOG_LONGITUDE";
    public static final String BUNDLE_FEEDBACK_I_LOCK_IT = "FEEDBACK_I_LOCK_IT";
    public static final String BUNDLE_FIRST_I_LOCK_IT = "FIRST_I_LOCK_IT";
    public static final String BUNDLE_INTRO_ERROR_SET_LAYOUT = "INTRO_ERROR_SET_LAYOUT";
    public static final String BUNDLE_INTRO_HELP_SET_LAYOUT = "INTRO_HELP_SET_LAYOUT";
    public static final String BUNDLE_PERMISSION_ICON = "PERMISSION_ICON";
    public static final String BUNDLE_PERMISSION_REQUEST = "PERMISSION_REQUEST";
    public static final String BUNDLE_PERMISSION_TEXT = "PERMISSION_TEXT";
    public static final String BUNDLE_PREMISSIONS_GRANTED = "PERMISSIONS_GRANTED";
    public static final String BUNDLE_SET_UP_FINISH_TO_HOME = "SET_UP_FINISH_TO_HOME";
    public static final String BUNDLE_SHOW_SIGN_UP = "SHOW_SIGN_UP";
    public static final String BUNDLE_STOP_ALARM = "STOP_ALARM";
    public static final String BUNLDE_APP_WIDGET_CONNECTION_STATE = "APP_WIDGET_CONNECTION_STATE";
    public static final int CALLBACK_ERROR_ID_COLOR_CODE_FRAGMENT = 2;
    public static final int CALLBACK_ERROR_ID_CONNECT_FRAGMENT = 1;
    public static final String CHANNEL_01_ID = "NOTIFY_CHANNEL_01_ID";
    public static final String CHANNEL_02_ID = "NOTIFY_CHANNEL_02_ID";
    public static final String CHANNEL_FIREBASE_ID = "NOTIFICATION_CHANNEL_FIREBASE_ID";
    public static final String CHANNEL_LE_SERVICE_ID = "NOTIFY_CHANNEL_LE_SERVICE_ID";
    public static final String CHANNEL_LOCATION_FORGROUND_SERVICE_ID = "NOTIFICATION_CHANNEL_LOCATION_FORGROUND_SERVICE";
    public static final String CHANNEL_LOCATION_SERVICE_ID = "NOTIFICATION_CHANNEL_LOCATION_FORGROUND_SERVICE";
    public static final String CHANNEL_MOVEMENT_CHECK_ID = "NOTIFICATION_CHANNEL_MOVEMENT_CHECK_SERVICE";
    public static final String CHANNEL_NO_BOND_ERROR_ID = "NOTIFICATION_CHANNEL_NO_BOND_ERRORS";
    public static final String CHANNEL_WARNING_ID = "NOTIFICATION_CHANNEL_WARNING_ID";
    public static final String CLOSE_COUNTER_SP = "CLOSE_COUNTER";
    public static final String CLOSE_DIST1 = "CLOSE_DIST_1";
    public static final String CLOSE_DIST2 = "CLOSE_DIST_2";
    public static final String CLOSE_DIST3 = "CLOSE_DIST_3";
    public static final String CLOSE_DIST4 = "CLOSE_DIST_4";
    public static final String CLOSE_DIST5 = "CLOSE_DIST_5";
    public static final String CLOSE_OFF = "CLOSE_OFF";
    public static final String COLUMN_ALARM = "ALARM";
    public static final String COLUMN_ALARM_SENSIBILITY = "ALARM_SENSIBILITY";
    public static final String COLUMN_AUTH_ID = "AUTH_ID";
    public static final String COLUMN_AUTOMATIC_RECONNECT = "AUTOMATIC_RECONNECT";
    public static final String COLUMN_AUTO_CLOSE = "AUTO_CLOSE";
    public static final String COLUMN_AUTO_OPEN = "AUTO_OPEN";
    public static final String COLUMN_AUTO_RECONNECT = "AUTO_RECONNECT";
    public static final String COLUMN_BATTERY_LEVEL = "BATTERY_LEVEL";
    public static final String COLUMN_DISTANCE_CLOSE = "DISTANCE_CLOSE";
    public static final String COLUMN_DISTANCE_OPEN = "DISTANCE_OPEN";
    public static final String COLUMN_DO_NOT_DISTURB_MODE = "DO_NOT_DISTURB_MODE";
    public static final String COLUMN_EXPIRE_DATE = "EXPIRE_DATE";
    public static final String COLUMN_FIREBASE_ANALYTICS_SEND = "FIREBASE_ANALYTICS_SEND";
    public static final String COLUMN_FIRMWARE_VERSION = "FIRMWARE_VERSION";
    public static final String COLUMN_HARDWARE_ID = "HARDWARE_ID";
    public static final String COLUMN_HARDWARE_VERSION = "HARDWARE_VERSION";
    public static final String COLUMN_IS_FIRMWARE_DOWNLOADED = "IS_FIRMWARE_DOWNLOADED";
    public static final String COLUMN_IS_GPS = "IS_GPS";
    public static final String COLUMN_IS_I_LOCK_IT_PLUS = "IS_I_LOCK_IT_PLUS";
    public static final String COLUMN_IS_KEY_FOB_CH = "KEY_FOB_CH";
    public static final String COLUMN_IS_KEY_FOB_FIRMWARE_DOWNLOADED = "KEY_FOB_FIRMWARE_DONWLOADED";
    public static final String COLUMN_IS_KEY_FOB_SET_UP = "IS_KEY_FOB_SET_UP";
    public static final String COLUMN_IS_LOGGIN_ON = "IS_LOGGING_ON";
    public static final String COLUMN_IS_NO_BOND = "IS_NO_BOND";
    public static final String COLUMN_KEY_FOB_AUTOMODE = "KEY_FOB_AUTOMODE";
    public static final String COLUMN_KEY_FOB_AUTO_CLOSE = "KEY_FOB_AUTO_CLOSE";
    public static final String COLUMN_KEY_FOB_AUTO_OPEN = "KEY_FOB_AUTO_OPEN";
    public static final String COLUMN_KEY_FOB_FIRMWARE_VERSION = "FIRMWARE_VERSION";
    public static final String COLUMN_KEY_FOB_RECONNECT_INTERVAL = "KEY_FOB_RECONNECT_INTERVAL";
    public static final String COLUMN_KEY_FOB_SERIAL_NUMBER = "SERIAL_NUMBER";
    public static final String COLUMN_LAST_LOCK_STATE = "LAST_LOCK_STATE";
    public static final String COLUMN_LAST_POSITION_LAT = "LAST_POSITION_LAT";
    public static final String COLUMN_LAST_POSITION_LONG = "LAST_POSITION_LANG";
    public static final String COLUMN_LATITUDE = "LATITUDE";
    public static final String COLUMN_LOCKING_GPS_LAT = "LOCKSTATE_LAT";
    public static final String COLUMN_LOCKING_GPS_LONG = "LOCKSTATE_LONG";
    public static final String COLUMN_LOCKING_SOUND = "LOCKING_SOUND";
    public static final String COLUMN_LOCK_ERROR = "LOCK_ERROR";
    public static final String COLUMN_LOCK_ID = "LOCK_ID";
    public static final String COLUMN_LOCK_MAC = "LOCK_MAC";
    public static final String COLUMN_LONGITUDE = "LONGITUDE";
    public static final String COLUMN_NAME = "LOCK_NAME";
    public static final String COLUMN_NICKNAME = "NICKNAME";
    public static final String COLUMN_PERS_CODE = "PERSONAL_CODE";
    public static final String COLUMN_PRE_ALARM = "PRE_ALARM";
    public static final String COLUMN_RECONNECT_INTERVAL = "RECONNECT_INTERVAL";
    public static final String COLUMN_SETTINGS_ALARM = "SETTINGS_ALARM";
    public static final String COLUMN_SETTINGS_AUTOMODE = "SETTINGS_AUTOMODE";
    public static final String COLUMN_SETTINGS_SOUNDS = "SETTINGS_SOUNDS";
    public static final String COLUMN_SHARE_CODE = "SHARE_CODE";
    public static final String COLUMN_SILENT_ALARM = "SILENT_ALARM";
    public static final String COLUMN_SMART_BATTERY_OPTIMIZATION = "SMART_BATTERY_OPTIMIZATION";
    public static final String COLUMN_SOUNDMODE = "SOUNDMODE";
    public static final String COLUMN_STATE = "STATE";
    public static final String COLUMN_TIMESTAMP = "TIMESTAMP";
    public static final String COLUMN_UNIQUE_GPS_ID = "UNIQUE_GPS_ID";
    public static final String COLUMN_UNLOCKING_SOUND = "UNLOCKING_SOUND";
    public static final String COLUMN_WARNING_SOUND = "WARNING_SOUND";
    public static final String COMMAND_ID = "command_id";
    public static final int COMMAND_ID_ALARM = 1;
    public static final int COMMAND_ID_BATTERY = 2;
    public static final int COMMAND_ID_GPS = 3;
    public static final UUID CONTROLL = UUID.fromString("0000beee-1212-efde-1523-785fef13d123");
    public static final String COOKIE_SP = "COOKIE";
    public static final String DB_TASK_ID_FIRMWARE_VERSION = "TASK_FIRMWARE_VERSION";
    public static final String DB_TASK_ID_NAME = "TASK_NAME";
    public static final String DB_TASK_ID_PERS_CODE = "TASK_PERS_CODE";
    public static final String DB_TASK_ID_SHARE_CODE = "TASK_SHARE_CODE";
    public static final String DEBUG_MODE_SP = "DEBUG_MODE";
    public static final String DEFAULT_LOCK_ID = "LOCK_ID";
    public static final String DEVICE_FETCHED_FROM_SERVER = "_DEVICE_FETCHED_FROM_SERVER";
    public static final String DEVICE_LINKED = "_DEVICE_LINKED";
    public static final String DEV_USER_SP = "DEV_USER";
    public static final UUID DFU_CONTROL_POINT = UUID.fromString("00001531-1212-EFDE-1523-785FEABCD123");
    public static final UUID DFU_SERVICE = UUID.fromString("00001530-1212-EFDE-1523-785FEABCD123");
    public static final String DIALOG_FRAGMENT_TAG_CLEAR_HISTORY = "TAG_CLEAR_HISTORY";
    public static final String DIALOG_FRAGMENT_TAG_FOROGT_PASSWORD = "TAG_FOROGT_PASSWORD";
    public static final String DIALOG_FRAGMENT_TAG_HELP = "TAG_DIALOG_HELP";
    public static final String DIALOG_FRAGMENT_TAG_ILI_NOT_FOUND = "TAG_ILI_NOT_FOUND";
    public static final String DIALOG_FRAGMENT_TAG_PRE_ALARM = "TAG_PRE_ALARM";
    public static final String DIALOG_FRAGMENT_TAG_RATING = "TAG_DIALOG_RATING";
    public static final UUID DISTANCE_CLOSE = UUID.fromString("0000bddd-1212-efde-1523-785fef13d123");
    public static final UUID DISTANCE_OPEN = UUID.fromString("0000bccc-1212-efde-1523-785fef13d123");
    public static final String DO_NOT_DISTURB_MODE_SHOW_HELP_TEXT_LS = "DO_NOT_DISTURB_MODE_SHOW_HELP_TEXT";
    public static final String ENERGY_OFF = "ENERGY_OFF";
    public static final String ENERY_SAVING_ON = "ENERY_SAVING_ON";
    public static final int ENVIRONMENT_MODE = 1;
    public static final int ERROR_BLOCKING_LOCK_WHILE_CLOSING = 82;
    public static final int ERROR_BLOCKING_LOCK_WHILE_OPENING = 83;
    public static final int ERROR_ID_COLOR_CODE = 4;
    public static final int ERROR_ID_KEY_FOB_V1 = 2;
    public static final int ERROR_ID_KEY_FOB_V2 = 3;
    public static final int ERROR_ID_SMARTPHONE = 1;
    public static final int ERROR_LOCK_MOVE_WHILE_CLOSING = 81;
    public static final String FCM_TAG_BUTTON_TEXT = "buttonText";
    public static final String FCM_TAG_BUTTON_URL = "buttonUrl";
    public static final String FCM_TAG_DIALOG_MESSAGE = "dialogMessage";
    public static final String FCM_TAG_IMAGE_URL = "imageUrl";
    public static final String FCM_TAG_OPEN_DIALOG_FRAGMENT = "OPEN_FIREBASE_AD_DIALOG_FRAGMENT";
    public static final String FCM_TOPIC_DE_ANDROID = "de_android";
    public static final String FCM_TOPIC_DE_BATTERY_OPTIMIZING_ON = "de_battery_optimizing_on";
    public static final String FCM_TOPIC_DE_MARKETING = "de_marketing";
    public static final String FCM_TOPIC_DE_OUTDATED_FW = "de_outdated_fw";
    public static final String FCM_TOPIC_EN_ANDROID = "en_android";
    public static final String FCM_TOPIC_EN_BATTERY_OPTIMIZING_ON = "en_battery_optimizing_on";
    public static final String FCM_TOPIC_EN_MARKETING = "en_marketing";
    public static final String FCM_TOPIC_EN_OUTDATED_FW = "en_outdated_fw";
    public static final String FILE_BOOTLOADER = "bootloader.zip";
    public static final String FILE_ILI_FW_CLASSIC = "i_lock_it_fw.zip";
    public static final String FILE_ILI_FW_NO_BOND = "i_lock_it_no_bond.zip";
    public static final String FILE_ILI_FW_PLUS = "i_lock_it_fw_plus.zip";
    public static final String FILE_KEY_FOB_FW_CH = "key_fob_fw_ch.zip";
    public static final String FILE_KEY_FOB_FW_DE = "key_fob_fw.zip";
    public static final byte[] FILLER = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public static final String FIREBASE_TOKEN_SP = "FIREBASE_TOKEN";
    public static final UUID FIRMWARE_VERSION = UUID.fromString("0000baad-1212-efde-1523-785fef13d123");
    public static final String FIRST_START_LS = "FIST_START";
    public static final String FOB_AUTO_LOCK = "FOB_AUTO_LOCK";
    public static final String FOB_AUTO_OFF = "FOB_AUTO_OFF";
    public static final String FOB_AUTO_OPEN = "FOB_AUTO_OPEN";
    public static final String FOB_RECON_TIMEOUT_1 = "FOB_RECON_TIMEOUT_1";
    public static final String FOB_RECON_TIMEOUT_2 = "FOB_RECON_TIMEOUT_2";
    public static final String FOB_RECON_TIMEOUT_3 = "FOB_RECON_TIMEOUT_3";
    public static final String FOB_RECON_TIMEOUT_4 = "FOB_RECON_TIMEOUT_4";
    public static final String FRAGMENT_TAG_BLE_RESET = "TAG_BLE_RESET";
    public static final String FRAGMENT_TAG_BOND_INFO = "TAG_BOND_INFO";
    public static final String FRAGMENT_TAG_CHANGE_LOCK_NAME = "TAG_CHANGE_LOCK_NAME";
    public static final String FRAGMENT_TAG_CHECK_FOR_UPDATES = "TAG_CHECK_FOR_UPDATEES";
    public static final String FRAGMENT_TAG_COLOR_PICKER = "TAG_COLOR_PICKER";
    public static final String FRAGMENT_TAG_DO_NOT_DISTURB_HELP_DIALOG = "TAG_DO_NOT_DISTURB_HELP";
    public static final String FRAGMENT_TAG_EROR_STEPS = "TAG_ERROR_STEPS";
    public static final String FRAGMENT_TAG_ERROR_KEY_FOB = "TAG_ERROR_KEY_FOB";
    public static final String FRAGMENT_TAG_FACTORY_RESET = "TAG_FACTORY_RESET";
    public static final String FRAGMENT_TAG_FIIRMWARE_UPDATE = "TAG_FIRMWARE_UPDATE";
    public static final String FRAGMENT_TAG_IGNORE_BATTERY_OPTIMIZATION = "TAG_IGNORE_BATTERY_OPTIMIZATION";
    public static final String FRAGMENT_TAG_INFO_LOCK_CONTROLL_ERROR = "TAG_INFO_LOCK_CONTROLL_ERROR";
    public static final String FRAGMENT_TAG_LOCKING_SOUND_INFO = "TAG_LOCKING_SOUND_INFO";
    public static final String FRAGMENT_TAG_MAP = "TAG_MAP";
    public static final String FRAGMENT_TAG_NB_REAUTHENTICATION_CHOOSE_KEY_FOB = "TAG_CHOOSE_KEY_FOB";
    public static final String FRAGMENT_TAG_TEACH_NEW_DEVICE = "TAG_TEACH_NEW_DEVICE";
    public static final String FRAGMENT_TAG_TURN_BLUETOOTH_ON = "TAG_TURN_BLUETOOTH_ON";
    public static final String FW18 = "FW_18";
    public static final String FW19 = "FW_19";
    public static final String FW20 = "FW_20";
    public static final String FW21 = "FW_21";
    public static final String FW22 = "FW_22";
    public static final String FW23 = "FW_23";
    public static final String FW24 = "FW_24";
    public static final String FW_OLD = "FW_OLD";
    public static final UUID GENERAL_INPUT_OUTPUT = UUID.fromString("0000BAAA-1212-EFDE-1523-785FEF13D123");
    public static final String GPS_LAT = "gps_lat";
    public static final String GPS_LAT_LS = "GPS_LAT";
    public static final String GPS_LONG = "gps_long";
    public static final String GPS_LONG_LS = "GPS_LONG";
    public static final String HAS_RATED = "HAS_RATED";
    public static final String HAS_RATED_LS = "HAS_RATED";
    public static final int HELP_ID_BONDING = 2;
    public static final int HELP_ID_SEARCH = 1;
    public static final String HW_V1 = "HW_V1";
    public static final String HW_V2 = "HW_V2";
    public static final String ILI1 = "ILI_1";
    public static final String ILI2 = "ILI_2";
    public static final String ILI3 = "ILI_3";
    public static final String ILI4 = "ILI_4";
    public static final String ILI5 = "ILI_5";
    public static final String INTENT_DONT_RECONNECT_AUTO_ID = "DONT_RECONNECT_AUTO_ID";
    public static final String INTENT_FACTORY_ID = "FACTORY_ID";
    public static final String INTENT_INTRO_ID = "INTRO_ID";
    public static final String INTENT_LICENSE_ID = "LICENSE_ID";
    public static final String INTENT_LINK_ID = "LINK_ID";
    public static final int INTERVAL_RECONNECTING_LONG_TERM = 1;
    public static final String IS_BACKGROUND_CONNECT_RUNNING_SP = "IS_BACKGROUND_CONNECT_RUNNING";
    public static final String IS_BACKGROUND_SCAN_RUNNING_SP = "IS_BACKGROUND_SCAN_RUNNING";
    public static final String IS_FIRMWARE_UPDATE_RUNNING_SP = "IS_FIRMWARE_UPDATE_FINISCHED";
    public static final String IS_IN_RECONNECT_MODE_LS = "IS_IN_RECONNECT_MODE";
    public static final String IV_SP = "IV";
    public static final String JSON_APP_VERSION = "app_version";
    public static final String JSON_CHANGELOG = "changelog";
    public static final String JSON_DOWNLOAD_BOOTLOADER_URL = "download_url_bootloader";
    public static final String JSON_DOWNLOAD_NO_BOND_URL = "download_url_non_bond";
    public static final String JSON_DOWNLOAD_URL = "download_url";
    public static final String JSON_ENG = "eng";
    public static final String JSON_FIRMWARE_VERSION = "firmware_version";
    public static final String JSON_GER = "ger";
    public static final String JSON_KEY_FOB_VERSION_1 = "version_1";
    public static final String JSON_KEY_FOB_VERSION_2 = "version_2";
    public static final String JSON_LINK = "https://info.ilockit.bike/data.json";
    public static final String JSON_MAIN_I_LOCK_IT = "ilockit";
    public static final String JSON_MAIN_I_LOCK_IT_DEV = "ilockit_dev";
    public static final String JSON_SUB_ANDROID = "android";
    public static final String JSON_SUB_CLASSIC = "classic";
    public static final String JSON_SUB_GPS = "gps";
    public static final String JSON_SUB_KEY_FOB = "key_fob";
    public static final String JSON_SUB_PLUS = "plus";
    public static final String JSON_SUB_PLUS_NO_BOND = "plus_nobond";
    public static final String KEY_FOB = "KEY_FOB";
    public static final UUID KEY_FOB_AUTO_MODE = UUID.fromString("0000BAAA-1212-efde-1523-785fef13d123");
    public static final UUID KEY_FOB_PLUS_SERIE_FW = UUID.fromString("0000BCCC-1212-efde-1523-785fef13d123");
    public static final UUID KEY_FOB_RECONNECT_INTERVAL = UUID.fromString("0000BBBB-1212-efde-1523-785fef13d123");
    public static final UUID KEY_FOB_SERVICE = UUID.fromString("0000F00E-1212-efde-1523-785fef13d123");
    public static final String LAST_RATING_CHECK_LS = "LAST_RATING_CHECK";
    public static final String LAST_SELECTED_DEVICE_SP = "LAST_SELECTED_DEVICE";
    public static final String LAST_UPDATE_CHECK_LS = "LAST_UPDATE_CHECK";
    public static final UUID LOCKSTATE = UUID.fromString("0000baaa-1212-efde-1523-785fef13d123");
    public static final String LOCKSTATE_COUNTER_LS = "LOCKSTATE_COUNTER";
    public static final String LOCK_ID = "lock_id";
    public static final String LOCK_MAC = "60:35:4B:79:D8:0B";
    public static final String LOCK_SOUND_ON = "LOCK_SOUND_ON";
    public static final String LOG_ON_OFF_LS = "LOG_ON_OFF";
    public static final String MAC = "mac";
    public static final String MAC_ADRESS_LS = "MAC_ADRESS";
    public static final float MOVMENT_VALUE_LIMIT = 2.0f;
    public static final String NEVER_SHOW_AGAIN_NOT_FOUND_DIALOG_SP = "NEVER_SHOW_AGAIN_NOT_FOUND_DIALOG";
    public static final byte[] NONCE = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public static final int NOTIFICATION_ALARM_ID = 110;
    public static final int NOTIFICATION_ALARM_TIME_ID = 115;
    public static final int NOTIFICATION_BATTERY_LOW_ID = 116;
    public static final int NOTIFICATION_CONNECTION_LOST_WHILE_LOCK_IS_OPEN_ID = 114;
    public static final int NOTIFICATION_CONTROL_ID = 111;
    public static final int NOTIFICATION_FOREGROUND_LE_SERVICE_ID = 121;
    public static final int NOTIFICATION_FOREGROUND_LOCATION_SERVICE_ID = 120;
    public static final int NOTIFICATION_FOREGROUND_MOVEMENT_CHECK_ID = 119;
    public static final int NOTIFICATION_FOREGROUND_OLD_LE_SERVICE_ID = 113;
    public static final int NOTIFICATION_ILI_NOT_FOUND_TIPS = 118;
    public static final int NOTIFICATION_LIVE_TRACKING_ID = 112;
    public static final int NOTIFICATION_NO_BOND_ERROR_ID = 117;
    public static final String NO_BOND_ERROR_PARING_FAILED = "NB_0x98";
    public static final String NO_BOND_ERROR_WRONG_AUTH_ID = "NB_0x96";
    public static final String NO_BOND_ERROR_WRONG_COMMAND = "NB_0x91";
    public static final String NO_BOND_ERROR_WRONG_CRC = "NB_0x92";
    public static final String NO_BOND_ERROR_WRONG_MESSAGE_LENGTH = "NB_0x95";
    public static final String NO_HW_2 = "NO_HW_2";
    public static final String OPEN_DIST1 = "OPEN_DIST_1";
    public static final String OPEN_DIST2 = "OPEN_DIST_2";
    public static final String OPEN_DIST3 = "OPEN_DIST_3";
    public static final String OPEN_DIST4 = "OPEN_DIST_4";
    public static final String OPEN_DIST5 = "OPEN_DIST_5";
    public static final String OPEN_DIST6 = "OPEN_DIST_6";
    public static final String OPEN_OFF = "OPEN_OFF";
    public static final String OPEN_SOUND_ON = "OPEN_SOUND_ON";
    public static final UUID OTHERS = UUID.fromString("0000baab-1212-efde-1523-785fef13d123");
    public static final String PARAM_DEVICE_ID = "deviceId";
    public static final String PARAM_FROM = "from";
    public static final String PARAM_ID = "id";
    public static final String PARAM_TO = "to";
    public static final String PARAM_USER_ID = "userId";
    public static final UUID PERSONAL_CODE = UUID.fromString("0000babf-1212-efde-1523-785fef13d123");
    public static final UUID SERVICE = UUID.fromString("0000f00d-1212-efde-1523-785fef13d123");
    public static final UUID SHARE_CODE = UUID.fromString("0000baac-1212-efde-1523-785fef13d123");
    public static final String SHARING_CODE_USED = "SHARING_CODE_USED";
    public static final String SHOW_WELCOME_INTRO_LS = "SHOW_WELCOME_INTRO";
    public static final byte[] SMARTPHONE_ID = {19, 52, 86, 120};
    public static final String STEP_SENSOR_IS_NOT_AVAILABLE_LS = "STEP_SENSOR_IS_NOT_AVAILABLE";
    public static final String TIMESTAMP = "timestamp";
    public static final String TOKEN_SP = "TOKEN";
    public static final UUID TON = UUID.fromString("0000baae-1212-efde-1523-785fef13d123");
    public static final String USER_ID_SP = "USER_ID";
    public static final UUID USER_INPUT_OUTPUT = UUID.fromString("0000BBBB-1212-EFDE-1523-785FEF13D123");
    public static final String USER_MAIL_SP = "USER_MAIL";
    public static final String VALUE = "value";
    public static final String WAKE_LOCK_TAG = "KEEP_CPU_ALIVE_TAG";
    public static final String WARN_ON = "WARN_ON";
    public static final String WIDGET_ON = "WIDGET_ON";

    private Constants() {
    }
}