package com.example.projectZarna;

import android.app.slice.Slice;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.project.R;

import java.util.ArrayList;


public class Video extends Fragment {
    ImageSlider imageSlider;
    ArrayList<SlideModel> slide;


    public Video() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view =inflater.inflate(R.layout.fragment_video, container, false);
       imageSlider=view.findViewById(R.id.image_slider);
       slide=new ArrayList<>();
      slide.add(new SlideModel(R.drawable.archi,ScaleTypes.CENTER_INSIDE));
      slide.add(new SlideModel(R.drawable.jdk,ScaleTypes.CENTER_INSIDE));
      slide.add(new SlideModel(R.drawable.oops,ScaleTypes.CENTER_INSIDE));
      slide.add(new SlideModel(R.drawable.p36,ScaleTypes.CENTER_INSIDE));
      slide.add(new SlideModel(R.drawable.poly,ScaleTypes.CENTER_INSIDE));
      slide.add(new SlideModel(R.drawable.encapsulation,ScaleTypes.CENTER_INSIDE));
      slide.add(new SlideModel(R.drawable.spring,ScaleTypes.CENTER_INSIDE));
      slide.add(new SlideModel(R.drawable.swimg,ScaleTypes.CENTER_INSIDE));
      slide.add(new SlideModel(R.drawable.inher,ScaleTypes.FIT));
       imageSlider.setImageList(slide);
        return view;
    }

}
