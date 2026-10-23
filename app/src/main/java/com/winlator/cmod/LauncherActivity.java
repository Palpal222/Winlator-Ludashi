package com.winlator.cmod;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class LauncherActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent source = getIntent();
        Intent intent = new Intent();
        intent.setComponent(MainActivity.getLaunchComponent(this));
        if (source != null && source.getExtras() != null) intent.putExtras(source.getExtras());
        startActivity(intent);
        overridePendingTransition(0, 0);
        finish();
        overridePendingTransition(0, 0);
    }
}
