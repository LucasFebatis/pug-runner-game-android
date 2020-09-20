package com.febatis.mygamehtml.dialog

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.febatis.mygamehtml.R

class ErrorDialogFragment(private var description: CharSequence?) : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        description = description ?: getString(R.string.dialog_error_default_message)

        return activity?.let {
            val builder = AlertDialog.Builder(it)
            builder.setTitle(R.string.dialog_error_title)
                .setMessage(description)
                .setPositiveButton(R.string.ok) { _, _ -> dismiss() }
            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }
}