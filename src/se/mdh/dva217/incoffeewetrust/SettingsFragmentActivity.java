package se.mdh.dva217.incoffeewetrust;

import android.app.Fragment;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created with IntelliJ IDEA.
 * User: d3eniz
 * Date: 10/18/13
 * Time: 10:14 AM
 * To change this template use File | Settings | File Templates.
 */
public class SettingsFragmentActivity extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {
        return (ViewGroup) inflater.inflate(R.layout.settings,container,false);
    }
}
