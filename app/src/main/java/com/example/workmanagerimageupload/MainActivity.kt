package com.example.workmanagerimageupload

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import androidx.work.WorkRequest
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val uploadWorkRequest: WorkRequest =
            OneTimeWorkRequestBuilder<UploadWorker>().build()
        btnStartUpload.setOnClickListener {
            WorkManager.getInstance(this@MainActivity).enqueue(uploadWorkRequest)
        }
    }
}
