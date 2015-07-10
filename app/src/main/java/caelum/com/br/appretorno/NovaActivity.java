package caelum.com.br.appretorno;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;

/**
 * Created by matheus on 25/06/15.
 */
public class NovaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova);



        final EditText editText = (EditText) findViewById(R.id.activity_nova_edit_text);

        FloatingActionButton button = (FloatingActionButton) findViewById(R.id.nova_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.putExtra("texto", editText.getText().toString());
                setResult(RESULT_OK, intent);

                finish();
            }
        });
    }
}
