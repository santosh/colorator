package com.santosh.colorator;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;

class Eula {
	public static final String PREFERENCE_EULA_ACCEPTED = "eula.accepted";
	public static final String PREFERENCES_EULA = "eula";

	static void showEula(final Activity activity) {
		final SharedPreferences preferences = activity.getSharedPreferences(
				PREFERENCES_EULA, Activity.MODE_PRIVATE);

		final AlertDialog.Builder builder = new AlertDialog.Builder(activity);
		builder.setTitle(R.string.about_title);
		builder.setCancelable(false);
		builder.setPositiveButton(R.string.about_dismiss_button,
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						preferences.edit().putBoolean(PREFERENCE_EULA_ACCEPTED,
								true).commit();
					}
				});
		builder.setMessage(R.string.about_body);
		builder.create().show();
	}
}
