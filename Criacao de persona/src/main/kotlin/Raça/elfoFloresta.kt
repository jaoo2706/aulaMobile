package Raça

import Habilidades

class elfoFloresta : Raca{
    override fun aplicarBonusRaca(habilidades: Habilidades) {
        habilidades.sabedoria += 1
    }
    override fun toString() : String {
        return "elfoFloresta"
    }

}