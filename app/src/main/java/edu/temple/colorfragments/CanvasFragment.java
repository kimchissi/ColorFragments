package edu.temple.colorfragments;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



public class CanvasFragment extends Fragment {

    public CanvasFragment() {
        // Required empty public constructor
    }
    private View view;
    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.

     * @return A new instance of fragment CanvasFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CanvasFragment newInstance() {
        CanvasFragment fragment = new CanvasFragment();
        return fragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_canvas, container, false);
        return view;
    }



    @Override
    public void onDetach() {
        super.onDetach();
    }


    public void changeBackgroundColor(String color) {
        view.setBackgroundColor(Color.parseColor(color));
    }
}
