package com.masak_in.masakin;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;

/**
 * Created by POPO on 4/19/2018.
 */

public class FragmentMinuman extends Fragment{
    View view;
    public FragmentMinuman() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        view = inflater.inflate(R.layout.minuman_fragment,container,false);
        return view;
    }
}
