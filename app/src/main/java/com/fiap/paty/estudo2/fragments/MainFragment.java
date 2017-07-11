package com.fiap.paty.estudo2.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.fiap.paty.estudo2.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by logonrm on 11/07/2017.
 */

public class MainFragment extends Fragment {

    @BindView(R.id.tvfragment)TextView tvfragment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container,savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_main,container,false);
        ButterKnife.bind(this,view);//equivalente ao findViewById pra todas as coisas da manteiga na faca

        return view;
    }

    @OnClick(R.id.button)
    public void clicou(View view){
        Toast.makeText(view.getContext(),tvfragment.getText().toString(),Toast.LENGTH_SHORT).show();
    }
}
