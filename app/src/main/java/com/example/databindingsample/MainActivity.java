package com.example.databindingsample;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.databindingsample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //https://medium.com/@elye.project/kotlin-and-retrofit-2-tutorial-with-working-codes-333a4422a890
    //https://android.jlelse.eu/room-persistence-library-with-pre-populated-database-5f17ef103d3d
    //https://codelabs.developers.google.com/codelabs/android-databinding/#0
    //https://www.androidhive.info/android-working-with-databinding/
    //https://www.vogella.com/tutorials/AndroidDatabinding/article.html

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        //After Data Binding
        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        Person person = new Person("Ketan ", "Nakum", "25", "50");
        mainBinding.setPerson(person);


    }
}
