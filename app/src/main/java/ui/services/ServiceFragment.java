package ui.services;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.hs.MainActivity;
import com.example.hs.R;

public class ServiceFragment extends Fragment {
    //private FragmentServicesBinding binding;
    private ServiceViewModel serviceViewModel;

    public static ServiceFragment newInstance(){
        return new ServiceFragment();
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ServiceViewModel servicesViewModel =
                new ViewModelProvider(this).get(ServiceViewModel.class);

        // binding = FragmentServicesBinding.inflate(inflater, container, false);
        // View root = binding.getRoot();

        View view = inflater.inflate(R.layout.fragment_service, container, false);
        Button button1 = (Button) view.findViewById(R.id.viewmore1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //

            }
        });
        Button button2 = (Button) view.findViewById(R.id.viewmore2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               //
            }
        });
        Button button3 = (Button) view.findViewById(R.id.viewmore3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
            }
        });
        return view;


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        //binding = null;
    }
}
