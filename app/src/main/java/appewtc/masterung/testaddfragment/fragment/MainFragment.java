package appewtc.masterung.testaddfragment.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import appewtc.masterung.testaddfragment.R;

/**
 * Created by masterUNG on 6/30/2017 AD.
 */

public class MainFragment extends Fragment{

    private String nameString;
    private TextView textView;

    public static MainFragment newInstance(String strName) {

        MainFragment mainFragment = new MainFragment();
        Bundle bundle = new Bundle();
        bundle.putString("Name", strName);
        mainFragment.setArguments(bundle);

        return mainFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        nameString = getArguments().getString("Name");
        Log.d("masterUNG", "Name ==> " + nameString);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_fragment_layout, container, false);

        //Initial View
        initialView(view);

        return view;
    }

    private void initialView(View view) {
        textView = (TextView) view.findViewById(R.id.txtName);
    }

    public void changeName(String strName) {
        textView.setText(strName);
    }

}   // Main Class
