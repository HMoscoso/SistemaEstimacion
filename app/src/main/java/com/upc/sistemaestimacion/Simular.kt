package com.upc.sistemaestimacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.SeekBar

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.upc.sistemaestimacion.databinding.ActivitySimularBinding
import kotlinx.android.synthetic.main.activity_mapa.*
import kotlinx.android.synthetic.main.activity_rango.*
import kotlinx.android.synthetic.main.activity_simular.*
import kotlinx.android.synthetic.main.activity_simular.btnSim

class Simular : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivitySimularBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySimularBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
        btnSim.setOnClickListener {
            val intent: Intent = Intent(this, Resultado::class.java)
            startActivity(intent)
        }

        sBar1.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                if (progress.toInt() == 0){
                    textView11.text = "1"
                } else if (progress.toInt() == 1){
                    textView11.text = "           2"
                } else if (progress.toInt() == 2){
                    textView11.text = "                      3"
                } else if (progress.toInt() == 3){
                    textView11.text = "                                 4"
                } else if (progress.toInt() == 4){
                    textView11.text = "                                            5"
                } else if (progress.toInt() == 5){
                    textView11.text = "                                                       6"
                } else if (progress.toInt() == 6){
                    textView11.text = "                                                                  7"
                } else if (progress.toInt() == 7){
                    textView11.text = "                                                                             8"
                } else if (progress.toInt() == 8){
                    textView11.text = "                                                                                        9"
                } else if (progress.toInt() == 9){
                    textView11.text = "                                                                                                  10"
                }
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }
        })
    }



    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val sydney = LatLng(-34.0, 151.0)
        mMap.addMarker(MarkerOptions().position(sydney).title("Marker in Sydney"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))
    }
}