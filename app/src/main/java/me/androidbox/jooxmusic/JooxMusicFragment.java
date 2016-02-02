package me.androidbox.jooxmusic;


import android.os.Bundle;
import android.app.Fragment;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class JooxMusicFragment extends Fragment {

    public JooxMusicFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_joox_music, container, false);

        /* Add the toolbar - cast to AppCompatActivity as we are doing this in our fragment */
        final AppCompatActivity appCompatActivity = (AppCompatActivity)getActivity();
        final Toolbar toolbar = (Toolbar)view.findViewById(R.id.tbJooxMusic);
        /* We are using setSupportActionBar for backward compatibility with older devices */
        appCompatActivity.setSupportActionBar(toolbar);

        /* Remove the title from the toolbar */
        appCompatActivity.getSupportActionBar().setDisplayShowTitleEnabled(false);

        /* Add the tabs */
        TabLayout tabLayout = (TabLayout)view.findViewById(R.id.tlJooxMusic);
        /* Use the selector for the displaying the icons */
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.music_selector));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.search_selector));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.radio_selector));

        return view;
    }

}
