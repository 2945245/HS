package ui.services;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

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


        return view;


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        //binding = null;
    }
}
