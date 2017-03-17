package com.example.dagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserComponent userComponent = DaggerUserComponent.builder().userModule(new UserModule()).build();

        user = userComponent.provideUser();

        TextView t = (TextView) findViewById(R.id.activity_main_textview_text);
        t.setText(user.getProfile().getDescription());
    }
}
