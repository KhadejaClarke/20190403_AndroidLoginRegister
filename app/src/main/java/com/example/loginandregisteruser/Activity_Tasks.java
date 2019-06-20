package com.example.loginandregisteruser;

import android.support.v4.app.Fragment;

public class Activity_Tasks extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return ReadTasksFragment.newInstance();
    }
}
