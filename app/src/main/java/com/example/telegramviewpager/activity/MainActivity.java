package com.example.telegramviewpager.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;
import com.example.telegramviewpager.R;
import com.example.telegramviewpager.adapter.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

public class MainActivity extends AppCompatActivity {
    private ViewPagerAdapter viewPagerAdapter;
    private ViewPager viewPager;
    private DotsIndicator dotsIndicator;
    private LottieAnimationView lottieAnimationView;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        viewPager = findViewById(R.id.view_pager);


        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.add(new Page1());//bular viewpagerlarni qo'shadi
        viewPagerAdapter.add(new page2());
        viewPagerAdapter.add(new page3());
        viewPagerAdapter.add(new page4());
        viewPagerAdapter.add(new page5());
        viewPagerAdapter.add(new page6());

        viewPager.setAdapter(viewPagerAdapter);
        lottieAnimationView = findViewById(R.id.lottie_animatsiya);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // bu animatsiyani chaqiradi
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                switch (position) {
                    case 0:
                        //case ichidagi narsalar animatsiyani chaqirish uchun kerak.
                        lottieAnimationView.setAnimation("telegram.json");
                        lottieAnimationView.playAnimation();
                        break;
                    case 1:
                        lottieAnimationView.setAnimation("speed.json");
                        lottieAnimationView.playAnimation();
                        break;
                    case 2:
                        lottieAnimationView.setAnimation("present.json");
                        lottieAnimationView.playAnimation();
                        break;
                    case 3:
                        lottieAnimationView.setAnimation("infinity.json");
                        lottieAnimationView.playAnimation();
                        break;
                    case 4:
                        lottieAnimationView.setAnimation("secure.json");
                        lottieAnimationView.playAnimation();
                        break;
                    case 5:
                        lottieAnimationView.setAnimation("cloud.json");
                        lottieAnimationView.playAnimation();
                        break;
                    default:
                        lottieAnimationView.setAnimation("telegram.json");
                        lottieAnimationView.playAnimation();
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        dotsIndicator = findViewById(R.id.dots_indicator);
        dotsIndicator.setViewPager(viewPager);

//        tabLayout = findViewById(R.id.tab_layout);
//        tabLayout.setupWithViewPager(viewPager);
    }
}