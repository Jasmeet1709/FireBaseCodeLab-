package com.example.vaibhavchellani.firebaseioextended.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.vaibhavchellani.firebaseioextended.Adapters.listviewAdapter;
import com.example.vaibhavchellani.firebaseioextended.Models.Message;
import com.example.vaibhavchellani.firebaseioextended.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText messageEditText;
    private Button sendButton;
    private ListView messageListView;
    private listviewAdapter mlistviewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //linking xml and java
        messageEditText=(EditText) findViewById(R.id.messageEditText);
        sendButton=(Button) findViewById(R.id.sendButton);
        messageListView=(ListView)findViewById(R.id.messageListView);
        List<Message> messages=new ArrayList<Message>();
        Message newMessage=new Message();

        //for testing listview
        /*newMessage.setUserMessage("fdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfd");
        newMessage.setUserName("vaibhav");
        messages.add(newMessage);
        messages.add(newMessage);messages.add(newMessage);messages.add(newMessage);*/


        mlistviewAdapter=new listviewAdapter(this,R.layout.row_layout,messages);
        messageListView.setAdapter(mlistviewAdapter);

        // Send button listener
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //todo in further steps
            }
        });

        // if edit text is empty this disables the send button .
        messageEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.toString().trim().length() > 0) {
                    sendButton.setEnabled(true);
                } else {
                    sendButton.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });











    }
}
