package kr.edcan.hangeulro.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

import kr.edcan.hangeulro.R;
import kr.edcan.hangeulro.adapter.CommonListViewAdapter;
import kr.edcan.hangeulro.model.CommonData;

public class MainActivity extends AppCompatActivity {

    ArrayList<CommonData> arrayList;
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setDefault();
    }

    private void setDefault() {
        listview = (ListView) findViewById(R.id.main_listview);
        arrayList = new ArrayList<>();
        arrayList.add(new CommonData("사전", R.drawable.ic_dic));
        arrayList.add(new CommonData("내사전", R.drawable.ic_my));
        arrayList.add(new CommonData("신조어 게시판", R.drawable.ic_board));
        arrayList.add(new CommonData("설정", R.drawable.ic_setting));
        CommonListViewAdapter adapter = new CommonListViewAdapter(getApplicationContext(), arrayList);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(getApplicationContext(), DictionaryListActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(getApplicationContext(), MyDictionaryActivity.class));
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "신조어 게시판은 정식 버전에서 지원할 예정입니다.", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        startActivity(new Intent(getApplicationContext(), SettingActivity.class));
                        break;
                }
            }
        });
    }
}