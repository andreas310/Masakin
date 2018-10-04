package com.masak_in.masakin;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.masak_in.masakin.bayem.BayemActivity;


/**
 * Created by POPO on 4/19/2018.
 */

public class FragmentMakanan extends Fragment {
    View view;
    TextView postmakanan1,waktumakanan1,desmakanan1,postmakanan2,waktumakanan2,desmakanan2,coming;
    Intent intent;

    public static FragmentMakanan newInstace() {
        FragmentMakanan myFrag = new FragmentMakanan();
        return myFrag;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.makanan_fragment, container, false);
        //run param
        changeText();

        //declare card 1
        intent = new Intent(getActivity(), BayemActivity.class);
        final CardView button = (CardView) view.findViewById(R.id.card1);
        final TextView text = (TextView) view.findViewById(R.id.desmakanan1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent);
            }
        });
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });

        //declare card 2
        intent = new Intent(getActivity(), BayemActivity.class);
        final CardView button2 = (CardView) view.findViewById(R.id.card2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent);
            }
        });

        return view;

    }

    public void changeText(){
        //Deklarasi font
        Typeface Medium = Typeface.createFromAsset(getActivity().getAssets(),  "fonts/GothamRoundedMedium.ttf");
        Typeface Bold = Typeface.createFromAsset(getActivity().getAssets(),  "fonts/GothamRoundedBold.ttf");
        Typeface Regular = Typeface.createFromAsset(getActivity().getAssets(),  "fonts/GothamRoundedBook.ttf");

        //deklarasi text
        postmakanan1 = (TextView) view.findViewById(R.id.postmakanan1);
        waktumakanan1 = (TextView) view.findViewById(R.id.waktumakanan1);
        desmakanan1 = (TextView) view.findViewById(R.id.desmakanan1);
        postmakanan2 = (TextView) view.findViewById(R.id.postmakanan2);
        waktumakanan2 = (TextView) view.findViewById(R.id.waktumakanan2);
        desmakanan2= (TextView) view.findViewById(R.id.desmakanan2);
        coming = (TextView) view.findViewById(R.id.textcoming);

        //implemen font family
        postmakanan1.setTypeface(Bold);
        waktumakanan1.setTypeface(Medium);
        desmakanan1.setTypeface(Regular);
        postmakanan2.setTypeface(Bold);
        waktumakanan2.setTypeface(Medium);
        desmakanan2.setTypeface(Regular);
        coming.setTypeface(Bold);


    }
}
