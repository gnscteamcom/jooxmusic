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

        /* Add the toolbar */
        final AppCompatActivity appCompatActivity = (AppCompatActivity)getActivity();
        final Toolbar toolbar = (Toolbar)view.findViewById(R.id.tbJooxMusic);
        appCompatActivity.setSupportActionBar(toolbar);

        /* Remove the title from the toolbar */
        appCompatActivity.getSupportActionBar().setDisplayShowTitleEnabled(false);

        /* Add the tabs */
        TabLayout tabLayout = (TabLayout)view.findViewById(R.id.tlJooxMusic);
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_music_video_white_36dp));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_youtube_searched_for_white_36dp));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_radio_white_36dp));
        return view;
    }

}
