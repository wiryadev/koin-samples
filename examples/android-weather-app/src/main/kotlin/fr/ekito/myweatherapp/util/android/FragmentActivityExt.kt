@file:Suppress("UNCHECKED_CAST")

package fr.ekito.myweatherapp.util.android

import androidx.fragment.app.FragmentActivity

/**
 * Retrieve argument from Activity intent
 */
fun <T : Any> FragmentActivity.argument(key: String) =
    lazy { intent.extras?.get(key) as? T ?: error("Intent Argument $key is missing") }

