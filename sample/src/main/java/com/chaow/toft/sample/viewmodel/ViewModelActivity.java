package com.chaow.toft.sample.viewmodel;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import com.chaow.toft.sample.R;

/**
 * @author Char
 * @date 2019/11/11
 */
public class ViewModelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewmodel);
//        mainViewmodel = new ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication())).get(MainViewmodel.class);
        final MainViewmodel mainViewmodel = ViewModelProviders.of(this).get(MainViewmodel.class);
        mainViewmodel.getUsername().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                ((TextView) findViewById(R.id.tv_username)).setText(s);
            }
        });
        findViewById(R.id.bt_change).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainViewmodel.setUsername("username" + System.currentTimeMillis());
            }
        });
    }
}
