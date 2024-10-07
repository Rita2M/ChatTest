package ru.myproject.testchat

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject
@HiltAndroidApp
class ChatTestApp @Inject constructor(): Application()
