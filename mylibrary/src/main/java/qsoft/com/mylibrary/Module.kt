package qsoft.com.mylibrary

import android.content.Context
import org.jetbrains.anko.toast

class Module {
    companion object {
        fun test(context: Context, message: String) {
            context.toast(message)
        }
    }
}