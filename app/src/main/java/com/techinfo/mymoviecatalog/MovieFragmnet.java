package com.techinfo.mymoviecatalog;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class MovieFragmnet extends Fragment {
    
    
    public MovieFragmnet() {
        // Required empty public constructor
    }
    
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        TextView textView = new TextView(getActivity());
        return inflater.inflate(R.layout.fragment_movie, container, false);
    }
    
}
