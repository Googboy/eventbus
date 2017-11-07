package com.example.evnet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import de.greenrobot.event.EventBus;

public class MainActivity extends AppCompatActivity {
    private Button btnsend;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsend = (Button) findViewById(R.id.btnSend);
        textView = (TextView) findViewById(R.id.tv_show);

        EventBus.getDefault().register(this);//注册

        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,secondActivity.class);
                startActivity(intent);
            }
        });
    }

    public void onEventMainThread(MyMessage event){
        String msg = "onEventMainThread收到了消息" + event.getString();
        textView.setText(msg);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
}
