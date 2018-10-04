package com.masak_in.masakin.bayem;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.masak_in.masakin.R;

/**
 * Created by POPO on 4/24/2018.
 */

public class Bayem2Slide extends Fragment {

    View view;
    TextView step1,step10,step11,step12;

    public Bayem2Slide() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        view = inflater.inflate(R.layout.slide_bayem2,container,false);
        changeText();
        return view;
    }

    public void changeText(){
        //Deklarasi font
        Typeface Medium = Typeface.createFromAsset(getActivity().getAssets(),  "fonts/GothamRoundedMedium.ttf");
        Typeface Bold = Typeface.createFromAsset(getActivity().getAssets(),  "fonts/GothamRoundedBold.ttf");
        Typeface Regular = Typeface.createFromAsset(getActivity().getAssets(),  "fonts/GothamRoundedBook.ttf");

        //deklarasi text
        step1 = (TextView) view.findViewById(R.id.step1);
        step10 = (TextView) view.findViewById(R.id.step10);
        step11 = (TextView) view.findViewById(R.id.step11);
        step12 = (TextView) view.findViewById(R.id.step12);

        //implemen font family
        step1.setTypeface(Regular);
        step10.setTypeface(Regular);
        step11.setTypeface(Bold);
        step12.setTypeface(Regular);


    }
}
