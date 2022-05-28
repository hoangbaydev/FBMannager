package com.example.fbmanage;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.example.fbmanage.adapter.BottomNavigationAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomTabsNavigation extends AppCompatActivity {
    private ViewPager2 viewPager2;
    private BottomNavigationView mBottomNavigationView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();

}
    private void initUI() {
        viewPager2 = findViewById(R.id.view_page2_bottom_tabs);
        mBottomNavigationView = findViewById(R.id.bottom_navigation);
        BottomNavigationAdapter bottomNavigationView = new BottomNavigationAdapter(this);
        viewPager2.setAdapter(bottomNavigationView);
        mBottomNavigationView.setOnItemSelectedListener(item -> {
            int id = item.getItemId();
            switch (id) {
                case R.id.taikhoan_bottom:{
                    viewPager2.setCurrentItem(1);
                    break;
                }
                case R.id.tao_ads_bottom:{
                    viewPager2.setCurrentItem(2);
                    break;
                }
                case R.id.thongbao_bottom:{
                    viewPager2.setCurrentItem(3);
                    break;
                }
                case R.id.trogiup_bottom:{
                    viewPager2.setCurrentItem(4);
                    break;
                }
                case R.id.setting_bottom:{
                    viewPager2.setCurrentItem(5);
                    break;
                }
                default:{
                    viewPager2.setCurrentItem(0);
                    break;
                }

            }
            return true;
        });
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                switch (position) {
                    case 1:{
                        mBottomNavigationView.setSelectedItemId(R.id.taikhoan_bottom);
                        break;
                    }
                    case 2:{
                        mBottomNavigationView.setSelectedItemId(R.id.tao_ads_bottom);
                        break;
                    }
                    case 3:{
                        mBottomNavigationView.setSelectedItemId(R.id.thongbao_bottom);
                        break;
                    }
                    case 4:{
                        mBottomNavigationView.setSelectedItemId(R.id.trogiup_bottom);
                        break;
                    }
                    default:{
                        mBottomNavigationView.setSelectedItemId(R.id.setting_bottom);
                        break;
                    }
                }
            }
        });

    }
}


