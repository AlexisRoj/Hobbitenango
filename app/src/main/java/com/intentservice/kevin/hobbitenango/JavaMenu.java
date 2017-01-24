package com.intentservice.kevin.hobbitenango;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by kevin on 24/01/2017.
 */

public class JavaMenu extends android.support.v4.app.Fragment {

    public JavaMenu(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.menu,container,false);
        return rootView;
    }
}
