package com.nokia.rakshak.listviews;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] fruits = {"Apple", "Banana", "Orange", "Pineapple"};
//        ListAdapter rakshakAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,fruits);
//        ListView rakshakListView = (ListView) findViewById(R.id.rakshakListView);
//        rakshakListView.setAdapter(rakshakAdapter);

        ListAdapter rakshakAdapter = new CustomAdapter(this,fruits);
        ListView rakshakListView = (ListView) findViewById(R.id.rakshakListView);
        rakshakListView.setAdapter(rakshakAdapter);


        rakshakListView.setOnItemClickListener(
                new  AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String fruit = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(MainActivity.this,fruit,Toast.LENGTH_LONG).show();
                    }
                }
        );
    }



//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}
