package com.thic.examplelivedata;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

public class firstFragment extends Fragment {

    EditText text;
    myViewmodel viewmodel;

    public static firstFragment newInstance() {
        return new firstFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        viewmodel = new ViewModelProvider(requireActivity()).get(myViewmodel.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup viewGroup = (ViewGroup)  inflater.inflate(R.layout.fragment_first, container, false);

        text = viewGroup.findViewById(R.id.input);
        text.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                viewmodel.setInput(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        viewmodel.getInput().observe(requireActivity(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Toast.makeText(getActivity(),"Data :"+s,Toast.LENGTH_SHORT).show();

            }
        });
        return viewGroup;
    }
}