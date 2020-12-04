package com.william.bulletscreen

import android.text.Editable
import android.text.TextWatcher


/**
 * @author William
 * @date 12/4/20 7:56 PM
 * Class Comment：
 */
open class SimpleTextWatcher : TextWatcher {
    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
    }

    override fun afterTextChanged(s: Editable?) {
    }

}