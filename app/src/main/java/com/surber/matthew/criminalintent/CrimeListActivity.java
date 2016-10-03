package com.surber.matthew.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Me on 10/2/2016.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
