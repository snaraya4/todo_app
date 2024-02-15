package com.example.todo_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Task> taskList;
    private TaskAdapter taskAdapter;
    private RecyclerView recyclerView;
    private EditText editText;
    private Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        taskList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);
        editText = findViewById(R.id.editText);
        addButton = findViewById(R.id.addButton);

        taskAdapter = new TaskAdapter(taskList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(taskAdapter);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String taskName = editText.getText().toString().trim();
                if (!taskName.isEmpty()) {
                    taskList.add(new Task(taskName));
                    taskAdapter.notifyDataSetChanged();
                    editText.setText("");
                }
            }
        });
    }
}
