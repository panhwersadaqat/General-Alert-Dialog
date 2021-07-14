package com.example.dialogdemo

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog

object Dialog {
    var alertDialog: AlertDialog? = null
    fun showDialog(context: Context) {
        val dialogBuilder = AlertDialog.Builder(context)
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val dialogView = inflater.inflate(R.layout.loader, null)
        dialogBuilder.setView(dialogView)
        alertDialog = dialogBuilder.create()
        alertDialog!!.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        alertDialog!!.setCancelable(false)
        alertDialog!!.show()
    }

    fun dismissDialog() {
        if (alertDialog != null) {
            alertDialog!!.dismiss()
        }
    }
}