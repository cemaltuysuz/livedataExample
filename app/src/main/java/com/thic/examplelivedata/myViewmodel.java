package com.thic.examplelivedata;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class myViewmodel extends ViewModel {
    private MutableLiveData<String> input = new MutableLiveData<>();

    public void setInput(String input){
         this.input.setValue(input);
    }
    public LiveData<String> getInput(){
        return input;
    }
}
