package demo.tensorflow.org.customvision_sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class customizePage extends AppCompatActivity {
    private ArrayList<String> items;
    private ArrayAdapter<String> itemsAdapter;
    private ListView lvItems;

    ArrayAdapter<String> m_adapter;
    ArrayList<String>m_listItems = new ArrayList<String>();

    Button bt;
    EditText et;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customize_page);

        bt = findViewById(R.id.submit);
        et = findViewById(R.id.editText);
        lv = (ListView)findViewById(R.id.recipeList);

        m_adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, m_listItems);
        lv.setAdapter(m_adapter);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = et.getText().toString();
                if(null !=input && input.length()>0){
                    m_listItems.add(input);

                    m_adapter.notifyDataSetChanged();
                }
            }
        });
    }
}
