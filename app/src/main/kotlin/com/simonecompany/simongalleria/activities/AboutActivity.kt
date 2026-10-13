package com.simonecompany.simongalleria.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.simonecompany.simongalleria.BuildConfig
import com.simonecompany.simongalleria.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            aboutAppIcon.setImageResource(com.simonecompany.simongalleria.R.mipmap.ic_launcher)
            aboutAppName.text = getString(com.simonecompany.simongalleria.R.string.app_name)
            aboutVersion.text = BuildConfig.VERSION_NAME
            aboutPackageName.text = BuildConfig.APPLICATION_ID
        }
    }
}
