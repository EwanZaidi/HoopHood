package com.hoophood.ridhwan.hoophood.Utils;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

/**
 * Created by Ridhwan on 10/27/2017.
 */

public class BottomNavigationViewHelper {

    private static final String TAG = "BottomNavigationViewHel";

    public static void setupBottomNavigationView (BottomNavigationViewEx bottomNavigationViewEx){
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.setTextVisibility(false);
    }
}
