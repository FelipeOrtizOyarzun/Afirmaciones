package com.example.afirmaciones.model

// Las anotaciones son útiles porque agregan información adicional a las clases, los métodos o los parámetros.
// Las anotaciones siempre se declaran con un símbolo @. En este caso, agrega la anotación @StringRes a tu propiedad de ID del recurso de strings
// y la anotación @DrawableRes a tu propiedad de ID del recurso de elementos de diseño. Recibirás una advertencia si proporcionas el tipo de ID de recurso incorrecto.
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(@StringRes val stringResourceId: Int,
                       @DrawableRes val imageResourceId: Int) {
}