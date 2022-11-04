package ui.about;

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


public class AboutFragment extends Fragment {
    private AboutViewModel mViewModel;

    public static AboutFragment newInstance()
    {
        return new AboutFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_about, container, false);


        return root;


    }

    public void updateDetail(){
        Intent intent = new Intent(getActivity(), MainActivity.class);
        startActivity(intent);
    }

}
