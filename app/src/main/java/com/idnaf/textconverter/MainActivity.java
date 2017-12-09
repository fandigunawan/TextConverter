package com.idnaf.textconverter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity
{
    private Spinner spMenu;
    private Button btGo;
    private EditText etInput;
    private TextView tvOutput;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spMenu = (Spinner) findViewById(R.id.spMenu);
        btGo = (Button) findViewById(R.id.btGo);
        etInput = (EditText) findViewById(R.id.etInput);
        tvOutput = (TextView) findViewById(R.id.tvOutput);

        btGo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int menuPosition = spMenu.getSelectedItemPosition();
                String menu = getResources().getStringArray(R.array.menu)[menuPosition];


                String input = etInput.getText().toString();
                StringBuilder output = new StringBuilder();
                switch(menuPosition)
                {
                    case 0:
                        char[] chars = input.toCharArray();
                        for(int i = 0; i < chars.length; i++)
                        {
                            int j = (int) chars[i];
                            output.append(Integer.toHexString(j));
                        }
                        tvOutput.setText(output);

                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                }
            }
        });

    }
}
