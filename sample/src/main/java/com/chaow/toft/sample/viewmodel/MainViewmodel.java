package com.chaow.toft.sample.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * @author Char
 * @date 2019/11/11
 */
public class MainViewmodel extends ViewModel {

    private MutableLiveData<String> username;

    public MainViewmodel() {
        username = new MutableLiveData<>();
    }

    public void setUsername(String un) {
        username.setValue(un);
    }

    public LiveData<String> getUsername() {
        return username;
    }
}
