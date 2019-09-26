package com.example.praktikumfragment.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.example.praktikumfragment.R;
import com.example.praktikumfragment.fragments.BlueFragment;
import com.example.praktikumfragment.fragments.RedFragment;

public class DynamicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic);


    }


    public void handlerClickLoadRedFragment(View view) {
        FragmentManager fm = getSupportFragmentManager();
        Fragment checkFragment = fm.findFragmentByTag("RED_FRAGMENT");
        if (checkFragment != null && checkFragment.isVisible()){
//            System.out.println(checkFragment.isVisible());
//            System.out.println(checkFragment.getTag());
        }else{
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new RedFragment(),"RED_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handlerClickLoadBlueFragment(View view) {
        FragmentManager fm = getSupportFragmentManager();
        Fragment checkFragment = fm.findFragmentByTag("BLUE_FRAGMENT");
        if (checkFragment != null && checkFragment.isVisible()){
//            System.out.println(checkFragment.isVisible());
//            System.out.println(checkFragment.getTag());
        }else{
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new BlueFragment(),"BLUE_FRAGMENT");
            fragmentTransaction.addToBackStack("BLUE_FRAGMENT");
            fragmentTransaction.commit();
        }
    }
}
