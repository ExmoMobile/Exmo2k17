package com.cse.exmo.exmo2k17.prefs;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Sineth on 3/25/2017. ExmoAndroid
 */

public class AppSharedPreferenceHelper implements SharedPreferenceHelper {
    public static final String PREF_KEY_IS_FIRST_LAUNCH = "PREF_KEY_IS_FIRST_LAUNCH";
    public final SharedPreferences mPrefs;

    public AppSharedPreferenceHelper(Context context, String prefFileName) {
        mPrefs = context.getSharedPreferences(prefFileName, Context.MODE_PRIVATE);
    }

    @Override
    public boolean getFirstLaunchPref() {
        return mPrefs.getBoolean(PREF_KEY_IS_FIRST_LAUNCH, true);
    }

    @Override
    public void setFirstLaunchPref(boolean firstLaunchPref) {
        mPrefs.edit().putBoolean(PREF_KEY_IS_FIRST_LAUNCH, firstLaunchPref).apply();
    }
}
