package ui.firstpage;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.hs.MainActivity;
import com.example.hs.R;

import ui.about.AboutFragment;
import ui.about.AboutViewModel;

public class FirstpageFragment extends Fragment {
    private FirstpageViewModel mViewModel;

    public static FirstpageFragment newInstance()
    {
        return new FirstpageFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_firstpage, container, false);


        return root;


    }

    public void updateDetail(){
        Intent intent = new Intent(getActivity(), MainActivity.class);
        startActivity(intent);
    }
}
