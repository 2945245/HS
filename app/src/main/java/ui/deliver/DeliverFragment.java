package ui.deliver;

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

import ui.moving.MovingFragment;
import ui.moving.MovingViewModel;

public class DeliverFragment extends Fragment {
    private DeliverViewModel mViewModel;

    public static DeliverFragment newInstance()
    {
        return new DeliverFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_deliver, container, false);


        return root;


    }

    public void updateDetail(){
        Intent intent = new Intent(getActivity(), MainActivity.class);
        startActivity(intent);
    }
}
