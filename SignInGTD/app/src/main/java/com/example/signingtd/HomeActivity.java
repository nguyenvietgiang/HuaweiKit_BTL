package com.example.signingtd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator;

public class HomeActivity extends AppCompatActivity {
    ViewPager viewPager;
    CircleIndicator circleIndicator;
    List<Photo> listPhoto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        addControls();
        addEvents();
    }

    private void addEvents() {
        listPhoto = getListPhoto();
        PhotoViewPageAdapter adapter = new PhotoViewPageAdapter(listPhoto);
        viewPager.setAdapter(adapter);
        circleIndicator.setViewPager(viewPager);
    }

    private void addControls() {
        viewPager = findViewById(R.id.view_page);
        circleIndicator = findViewById(R.id.circle_indicator);
    }

    private List<Photo> getListPhoto(){
        List<Photo> list = new ArrayList<>();
        list.add(new Photo(R.drawable.image_slide_1));
        list.add(new Photo(R.drawable.image_slide_2));
        return list;
    }
}