package ru.devsokovix.transitionframework

import android.os.Bundle
import android.transition.Scene
import android.transition.TransitionInflater
import android.transition.TransitionManager
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet.Constraint
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import ru.devsokovix.transitionframework.databinding.ActivityMainBinding
import ru.devsokovix.transitionframework.databinding.Scane1Binding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var scane1Binding: Scane1Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: ConstraintLayout = binding.root
        setContentView(view)
        val scene1 = Scene.getSceneForLayout(binding.sceneRoot, R.layout.scane1, this)
        val scene2 = Scene.getSceneForLayout(binding.sceneRoot, R.layout.scane2, this)
        val transitionManager = TransitionInflater.from(this).inflateTransitionManager(R.transition.t_maneger, binding.sceneRoot)
        transitionManager.transitionTo(scene1)
            scane1Binding.button.setOnClickListener {
            transitionManager.transitionTo(scene2)
        }
    }
}