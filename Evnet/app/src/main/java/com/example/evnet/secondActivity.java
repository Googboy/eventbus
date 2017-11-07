package com.example.evnet;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import de.greenrobot.event.EventBus;

/**
 * Created by 潘硕 on 2017/11/7.
 */

public class secondActivity extends Activity {
    private Button btnBack;
    private Button btnFinish;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_fragment);

        btnBack = findViewById(R.id.send_message);
        btnFinish = findViewById(R.id.btn_finish);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(new MyMessage("这是一条消息!!!"));
            }
        });
        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
