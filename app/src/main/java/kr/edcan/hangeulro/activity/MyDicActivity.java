package kr.edcan.hangeulro.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import kr.edcan.hangeulro.R;
import kr.edcan.hangeulro.adapter.MyDicListViewAdapter;
import kr.edcan.hangeulro.databinding.ActivityMyDicBinding;
import kr.edcan.hangeulro.model.CommonData;
import okhttp3.ResponseBody;
import retrofit2.Call;

public class MyDicActivity extends AppCompatActivity {

    ActivityMyDicBinding binding;
    ListView listView;
    Call<ResponseBody> getMyDicList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_my_dic);
        setDefault();
    }

    private void setDefault() {
        listView = binding.mydicListView;
        ArrayList<CommonData> arrayList = new ArrayList<>();
        arrayList.add(new CommonData("이상해 코드", "Perculiar Code", R.drawable.ic_mydic_gold));
        arrayList.add(new CommonData("이상해 코드", "Perculiar Code", R.drawable.ic_mydic_gold));
        arrayList.add(new CommonData("이상해 코드", "Perculiar Code", R.drawable.ic_mydic_gold));
        arrayList.add(new CommonData("이상해 코드", "Perculiar Code", R.drawable.ic_mydic_gold));
        arrayList.add(new CommonData("이상해 코드", "Perculiar Code", R.drawable.ic_mydic_gold));
        arrayList.add(new CommonData("이상해 코드", "Perculiar Code", R.drawable.ic_mydic_gold));
        listView.setAdapter(new MyDicListViewAdapter(getApplicationContext(), arrayList));
    }
}