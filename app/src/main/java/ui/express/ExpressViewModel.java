package ui.express;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ExpressViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public ExpressViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }



    public LiveData<String> getText() {
        return mText;
    }
}
