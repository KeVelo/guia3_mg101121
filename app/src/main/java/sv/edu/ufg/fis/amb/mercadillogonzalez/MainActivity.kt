package sv.edu.ufg.fis.amb.mercadillogonzalez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)

        setSupportActionBar(toolbar)

        supportActionBar?.title = "Mercadillo Gonzalez"
        supportActionBar?.subtitle = "UFG"
        supportActionBar?.setIcon(R.drawable.ic_launcher_foreground)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.ufg_toolbar, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.configuracion -> {
                Toast.makeText(
                    this,
                    "Ha seleccionado la opcion de configuracion",
                    Toast.LENGTH_SHORT
                ).show()
                true
            }

            R.id.perfil -> {
                Toast.makeText(this, "Ha seleccionado la opcion de perfil", Toast.LENGTH_SHORT)
                    .show()
                true
            }

            R.id.mapa -> {
                Toast.makeText(
                    this,
                    "Ha seleccionado la opcion de enviar su direccion",
                    Toast.LENGTH_SHORT
                ).show()
                true
            }

            R.id.nueva_cuenta -> {
                Toast.makeText(
                    this,
                    "Ha seleccionado la opcion para crear nueva cuenta",
                    Toast.LENGTH_SHORT
                ).show()
                true
            }

            R.id.salir -> {
                Toast.makeText(
                    this,
                    "Ha seleccionado la opcion para salir de la cuenta", Toast.LENGTH_SHORT
                ).show()
                true
            }

            else -> false
        }
    }

}