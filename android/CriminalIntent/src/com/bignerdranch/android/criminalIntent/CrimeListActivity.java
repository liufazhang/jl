package com.bignerdranch.android.criminalIntent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

public class CrimeListActivity extends SingleFragmentActivity {

	@Override
	protected Fragment createFragment() {
		// TODO Auto-generated method stub
		return new CrimeListFragment();
	}

}
