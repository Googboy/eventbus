package com.example.eventbus;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import de.greenrobot.event.EventBus;

/**
 * Created by 潘硕 on 2017/11/7.
 */

public class SecondActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_fragment);

        findViewById(R.id.btnBackFirst).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(new FirstEvent("FirstEvent btn clicked"));
            }
        });
    }
}
