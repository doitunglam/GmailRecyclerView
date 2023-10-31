package com.example.gmail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import java.util.Date

class MainActivity : AppCompatActivity() {
    var listEmail: ArrayList<Email> = ArrayList<Email>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listEmail.add(Email("FPT Telecom", "Chuc mung quy khach da trung thuonwg mot chiec Toyota Civic tri gia 1.098 trieu dong", "12:34 PM"))
        listEmail.add(Email("FPT Telecom", "Chuc mung quy khach da trung thuonwg mot chiec Toyota Civic", "12:34 PM"))
        listEmail.add(Email("FPT Telecom", "Chuc mung quy khach da trung thuonwg mot chiec Toyota Civic", "12:34 PM"))
        listEmail.add(Email("FPT Telecom", "Chuc mung quy khach da trung thuonwg mot chiec Toyota Civic", "12:34 PM"))
        listEmail.add(Email("FPT Telecom", "Chuc mung quy khach da trung thuonwg mot chiec Toyota Civic", "12:34 PM"))

        listEmail.add(Email("FPT Telecom", "Chuc mung quy khach da trung thuonwg mot chiec Toyota Civic", "12:34 PM"))
        listEmail.add(Email("FPT Telecom", "Chuc mung quy khach da trung thuonwg mot chiec Toyota Civic", "12:34 PM"))
        listEmail.add(Email("FPT Telecom", "Chuc mung quy khach da trung thuonwg mot chiec Toyota Civic", "12:34 PM"))
        listEmail.add(Email("FPT Telecom", "Chuc mung quy khach da trung thuonwg mot chiec Toyota Civic", "12:34 PM"))
        listEmail.add(Email("FPT Telecom", "Chuc mung quy khach da trung thuonwg mot chiec Toyota Civic", "12:34 PM"))

        listEmail.add(Email("FPT Telecom", "Chuc mung quy khach da trung thuonwg mot chiec Toyota Civic", "12:34 PM"))
        listEmail.add(Email("FPT Telecom", "Chuc mung quy khach da trung thuonwg mot chiec Toyota Civic", "12:34 PM"))
        listEmail.add(Email("FPT Telecom", "Chuc mung quy khach da trung thuonwg mot chiec Toyota Civic", "12:34 PM"))
        listEmail.add(Email("FPT Telecom", "Chuc mung quy khach da trung thuonwg mot chiec Toyota Civic", "12:34 PM"))
        listEmail.add(Email("FPT Telecom", "Chuc mung quy khach da trung thuonwg mot chiec Toyota Civic", "12:34 PM"))

        listEmail.add(Email("FPT Telecom", "Chuc mung quy khach da trung thuonwg mot chiec Toyota Civic", "12:34 PM"))
        listEmail.add(Email("FPT Telecom", "Chuc mung quy khach da trung thuonwg mot chiec Toyota Civic", "12:34 PM"))
        listEmail.add(Email("FPT Telecom", "Chuc mung quy khach da trung thuonwg mot chiec Toyota Civic", "12:34 PM"))
        listEmail.add(Email("FPT Telecom", "Chuc mung quy khach da trung thuonwg mot chiec Toyota Civic", "12:34 PM"))
        listEmail.add(Email("FPT Telecom", "Chuc mung quy khach da trung thuonwg mot chiec Toyota Civic", "12:34 PM"))

        listEmail.add(Email("FPT Telecom", "Chuc mung quy khach da trung thuonwg mot chiec Toyota Civic", "12:34 PM"))
        listEmail.add(Email("FPT Telecom", "Chuc mung quy khach da trung thuonwg mot chiec Toyota Civic", "12:34 PM"))
        listEmail.add(Email("FPT Telecom", "Chuc mung quy khach da trung thuonwg mot chiec Toyota Civic", "12:34 PM"))
        listEmail.add(Email("FPT Telecom", "Chuc mung quy khach da trung thuonwg mot chiec Toyota Civic", "12:34 PM"))
        listEmail.add(Email("FPT Telecom", "Chuc mung quy khach da trung thuonwg mot chiec Toyota Civic", "12:34 PM"))


        val adapter = MailAdapter(this, listEmail);
        findViewById<ListView>(R.id.emailListView).adapter = adapter

    }
}