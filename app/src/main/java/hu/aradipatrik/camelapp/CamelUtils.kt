package hu.aradipatrik.camelapp

object CamelUtils {
    @JvmStatic
    var camelBucks = 0

    @JvmStatic
    val camels = listOf(
        Camel(R.drawable.camel_group,  5, "Gang of camels"),
        Camel(R.drawable.derpy_camel, -1, "Herp Derp Megerp"),
        Camel(R.drawable.sexy_camel, 69, "Sexy XXX"),
        Camel(R.drawable.teve, 1, "Matyo himes teve")
    )

    @JvmStatic
    var selectedCamel = 0 // Bonus points: delete this, and use Intent extras es discussed
}

data class Camel(val imageResId: Int, val powerLvl: Int, val name: String)