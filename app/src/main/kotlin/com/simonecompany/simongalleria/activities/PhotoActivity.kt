package com.simonecompany.simongalleria.activities

import android.os.Bundle
import com.simonecompany.simongalleria.helpers.ColorModeHelper

class PhotoActivity : PhotoVideoActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        mIsVideo = false
        super.onCreate(savedInstanceState)
    }

    override fun onDestroy() {
        super.onDestroy()
        ColorModeHelper.resetColorMode(this)
    }
}
