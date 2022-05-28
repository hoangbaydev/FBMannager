package com.example.fbmanage.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.fbmanage.Framment.Caidat_Fragment;
import com.example.fbmanage.Framment.Taikhoan_Fragment;
import com.example.fbmanage.Framment.Taoquangcao_Fragment;
import com.example.fbmanage.Framment.Thongbao_Fragment;
import com.example.fbmanage.Framment.Trogiup_Fragment;

public class BottomNavigationAdapter extends FragmentStateAdapter {
    public BottomNavigationAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 1: return new Taikhoan_Fragment();
            case 2: return new Taoquangcao_Fragment ();
            case 3: return new Thongbao_Fragment();
            case 4: return new Trogiup_Fragment();
            default: return new Caidat_Fragment();
        }
    }

    @Override
    public int getItemCount() {
        return 7;
    }
}
