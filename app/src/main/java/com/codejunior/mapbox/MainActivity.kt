package com.codejunior.mapbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codejunior.mapbox.databinding.ActivityMainBinding
import com.mapbox.mapboxsdk.maps.MapView
import com.mapbox.maps.Style

class MainActivity : AppCompatActivity() {

    private var mapView: com.mapbox.maps.MapView? = null
    private lateinit var _binding: ActivityMainBinding
    private val binding get() = _binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

   /*     mapView = binding.mapView
        mapView?.getMapboxMap()?.loadStyleUri(Style.MAPBOX_STREETS)*/


    }
    override fun onStart() {
        super.onStart()
        mapView?.onStart()
    }

    override fun onStop() {
        super.onStop()
        mapView?.onStop()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        mapView?.onLowMemory()
    }

    override fun onDestroy() {
        super.onDestroy()
        mapView?.onDestroy()
    }
}